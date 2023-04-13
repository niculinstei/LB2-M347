import org.jooq.meta.jaxb.Logging

plugins {
    java
    id("org.springframework.boot") version "3.0.5"
    id("io.spring.dependency-management") version "1.1.0"
    id("nu.studer.jooq") version "7.1.1"
}

group = "ch.nikka"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-jooq")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.postgresql:postgresql:42.5.4")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(group = "org.jooq", name = "jooq-codegen", version = "3.15.4")
    jooqGenerator(group = "org.postgresql", name = "postgresql", version = "42.5.4")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("org.postgresql:postgresql")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
val codegenDirectory = buildDir.resolve("jooqCodeGen")

jooq {
    version.set("3.15.4")
    edition.set(nu.studer.gradle.jooq.JooqEdition.OSS)

    configurations{
        create("main"){
            jooqConfiguration.apply {
                logging = Logging.WARN
                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://localhost:5432/ToDoApp"
                    user = "postgres"
                    password = "postgres"
                    properties.add(org.jooq.meta.jaxb.Property().withKey("PAGE_SIZE").withValue("2048"))
                }
                generator.apply {
                    name = "org.jooq.codegen.DefaultGenerator";
                    database.apply {
                        name = "org.jooq.meta.postgres.PostgresDatabase"
                        inputSchema = "public"

                        forcedTypes = listOf(
                                org.jooq.meta.jaxb.ForcedType().apply {
                                    name = "varchar"
                                    includeExpression = ".*"
                                    includeTypes = "JSONB?"
                                },
                                org.jooq.meta.jaxb.ForcedType().apply {
                                    name = "varchar"
                                    includeExpression = ".*"
                                    includeTypes = "INET"
                                }
                        )
                    }
                    generate.apply{
                        isDeprecated = false
                        isFluentSetters = false
                        isGeneratedAnnotation = false
                        isImmutablePojos = false
                        isJavaTimeTypes = true
                        isPojos = false
                        isRecords = true
                    }
                    target.apply {
                        packageName = "ch.nikka.todo"
                        directory = "$codegenDirectory/src/"
                    }
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
                }
            }
        }
    }



}

package ch.nikka.todo.Note;


import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import static ch.nikka.todo.Tables.NOTE;

@Repository
public class NoteRepository {

	private final DSLContext dslContext;
	private final NoteMapper noteMapper;

	public NoteRepository(DSLContext dslContext, NoteMapper teamMapper) {
		this.dslContext = dslContext;
		this.noteMapper = teamMapper;
	}

	public List<Note> getAllNotes(){
		return dslContext.selectFrom(NOTE).fetch(noteMapper::map);
	}
}

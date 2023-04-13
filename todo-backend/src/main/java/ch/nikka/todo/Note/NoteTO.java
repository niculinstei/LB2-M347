package ch.nikka.todo.Note;

public class NoteTO {
	private int id;
	private String title;
	private String content;
	private NoteState state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public NoteState getState() {
		return state;
	}

	public void setState(NoteState state) {
		this.state = state;
	}
}

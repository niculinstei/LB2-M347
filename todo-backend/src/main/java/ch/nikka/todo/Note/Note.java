package ch.nikka.todo.Note;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Note {
	private  Integer id;
	private  String title;
	private  String noteContent;
	private  NoteState noteState;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNoteContent() {
		return noteContent;
	}

	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}

	public NoteState getNoteState() {
		return noteState;
	}

	public void setNoteState(NoteState noteState) {
		this.noteState = noteState;
	}
}

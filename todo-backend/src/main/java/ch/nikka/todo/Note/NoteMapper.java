package ch.nikka.todo.Note;

import ch.nikka.todo.tables.records.NoteRecord;
import org.springframework.stereotype.Component;

@Component
public class NoteMapper {
	public Note map(NoteRecord noteRecord){
		Note note = new Note();
		note.setId(noteRecord.getNoteId());
		note.setTitle(noteRecord.getTitle());
		note.setNoteContent(noteRecord.getNotecontent());
		note.setNoteState((NoteState) noteRecord.getNotestate());

		return note;
	}
}

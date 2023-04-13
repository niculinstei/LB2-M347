package ch.nikka.todo.Note;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class NoteController {

	private NoteRepository noteRepository;

	@Autowired
	public NoteController(NoteRepository noteRepository){
		this.noteRepository = noteRepository;
	}

	@GetMapping
	public List<NoteTO> getAllNotes() {
		return noteRepository.getAllNotes().stream().map(this::convert).collect(Collectors.toList());
	}

	private NoteTO convert(Note note){
		NoteTO noteTo = new NoteTO();
		noteTo.setId(note.getId());
		noteTo.setTitle(note.getTitle());
		noteTo.setContent(note.getNoteContent());
		noteTo.setState(note.getNoteState());
		return noteTo;
	}
}

package note.ramadan.listeners;

import note.ramadan.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}

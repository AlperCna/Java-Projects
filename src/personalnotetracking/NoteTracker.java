/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Alper
 */
public class NoteTracker {
    private final ArrayList<Note> notes;
    private Note[] noteArray;

    public NoteTracker() {
        notes = new ArrayList<>();
        noteArray = new Note[10];
    }

    public void addNote(Note note) {
        notes.add(note);
        if(noteArray.length == notes.size()){
            resize();
        }
        noteArray = notes.toArray(noteArray);
    }

    public Note findNote(String title)
    {
        for (Note note:notes)
        {
            if(note.getTitle().equalsIgnoreCase(title))
                return note;
        }
        return null;

    }
    public void removeNote(String title) {
        Note note=null;
        for (Note n:notes)
        {
            if(n.getTitle().equalsIgnoreCase(title))
            note=n;
        }
        if(note!=null) {
            notes.remove(note);

        noteArray = notes.toArray(noteArray);}
    }



    public int getTotalVoiceNotes()
    {
    int sum=0;
    for (Note note:notes)
    {
        if(note instanceof VoiceNote)
            sum++;
    }
    return sum;
    }

    public int getTotalReminderNotes()
    {
        int sum=0;
        for (Note note:notes)
        {
            if(note instanceof ReminderNote)
                sum++;
        }
        return sum;
    }


    public int getTotalToDoNotes()
    {
        int sum=0;
        for (Note note:notes)
        {
            if(note instanceof ToDo)
                sum++;
        }
        return sum;
    }


    public ArrayList<Note> getNotes() {
        return notes;
    }
    public Note[] getNotesArray() {
        return noteArray;
    }

    public ArrayList<ReminderNote> getReminderNotes() {
        ArrayList<ReminderNote> reminderNotes = new ArrayList<>();
        for (Note note : notes) {
            if (note instanceof ReminderNote reminderNote) {
                reminderNotes.add(reminderNote);
            }
        }
        return reminderNotes;
    }
    public ReminderNote[] getReminderNotesArray() {
        int count = 0;
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] instanceof ReminderNote) {
                count++;
            }
        }
        ReminderNote[] reminderNotes = new ReminderNote[count];
        int index = 0;
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] instanceof ReminderNote) {
                reminderNotes[index++] = (ReminderNote) noteArray[i];
            }
        }
        return reminderNotes;
    }

    public ArrayList<ToDo> getToDoNotes() {
        ArrayList<ToDo> toDoNotes = new ArrayList<ToDo>();
        for (Note note : notes) {
            if (note instanceof ToDo) {
                toDoNotes.add((ToDo) note);
            }
        }
        return toDoNotes;
    }
    public ToDo[] getToDoNotesArray() {
        int count = 0;
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] instanceof ToDo) {
                count++;
            }
        }
        ToDo[] toDoNotes = new ToDo[count];
        int index = 0;
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] instanceof ToDo) {
                toDoNotes[index++] = (ToDo) noteArray[i];
            }
        }
        return toDoNotes;
    }
public ArrayList<VoiceNote> getVoiceNotes() {
        ArrayList<VoiceNote> voiceNotes = new ArrayList<VoiceNote>();
        for (Note note : notes) {
            if (note instanceof VoiceNote) {
                voiceNotes.add((VoiceNote) note);
            }
        }
        return voiceNotes;
    }
    public VoiceNote[] getVoiceNotesArray() {
        int count = 0;
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] instanceof VoiceNote) {
                count++;
            }
        }
        VoiceNote[] voiceNotes = new VoiceNote[count];
        int index = 0;
        for (int i = 0; i < noteArray.length; i++) {
            if (noteArray[i] instanceof VoiceNote) {
                voiceNotes[index++] = (VoiceNote) noteArray[i];
            }
        }
        return voiceNotes;
    }
    public void resize(){
        noteArray = Arrays.copyOf(noteArray, noteArray.length*2);
    }

   

    
    

}


   

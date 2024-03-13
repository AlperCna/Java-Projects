/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alper
 */
public class VoiceNote extends Note {
    private String voiceFileLocation;
    private int duration;
    private Date recordingDate;

    public VoiceNote(String title, String content, Date createdAt, String voiceFileLocation, int duration, Date recordingDate) {
        super(title, content, createdAt);
        this.voiceFileLocation = voiceFileLocation;
        this.duration = duration;
        this.recordingDate = recordingDate;
    }

    public String getVoiceFileLocation() {
        return voiceFileLocation;
    }

    public void setVoiceFileLocation(String voiceFileLocation) {
        this.voiceFileLocation = voiceFileLocation;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Voice File='" + voiceFileLocation + '\'' +
                ", Duration=" + duration +
                ", Recording Date='" + recordingDate ;
    }
}

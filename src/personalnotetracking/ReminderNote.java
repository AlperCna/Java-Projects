/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alper
 */
public class ReminderNote extends Note {
     private Date reminderDate;

    public ReminderNote(String title, String content, Date createdAt, Date reminderDate) {
        super(title, content, createdAt);
        this.reminderDate = reminderDate;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public String toString() {
        return super.toString() + ", Reminder Date: " + reminderDate;
    }
    


   
    }
    


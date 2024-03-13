/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alper
 */
public class ToDo extends Note {
    private boolean isCompleted;
    private Date dueDate;

    public ToDo(String title, String content, boolean isCompleted, Date dueDate) {
        super(title, content);
        this.isCompleted = isCompleted;
        this.dueDate = dueDate;
    }



    public boolean getIsCompleted() {
        return isCompleted;
    }
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String getContent() {
        return super.getContent() + " Due Date: " + dueDate + " Status: " + (isCompleted ? "Completed" : "Not completed");
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    public void markAsInCompleted() {
        this.isCompleted = false;
    }
    //overloading markAsCompleted method
    public void markAsCompleted(String completedAt) {
        this.isCompleted = true;
        this.setContent(super.getContent() + " Completed At: " + completedAt);
    }


    @Override
    public String toString() {
        return super.toString()+
                ", isCompleted=" + isCompleted +
                ", dueDate=" + dueDate ;
    }
}

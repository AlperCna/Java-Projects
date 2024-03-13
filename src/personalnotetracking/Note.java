/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author Alper
 */
public class Note {


    private String title;//used to store title of a note (will be used in sorting process when we will sort notes Alphabetically with respect to their titles)
    private String content;
    private Date createdAt; // used to store date created
    private Date updatedAt;


    //parameterized constructor

    public Note(String title, String content) {
        this.title = title;
        this.content = content;

    }


    //overloaded Constructor
    public Note(String title, String content, Date createdAt) {
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }


    //getters and setters

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    //A string representation of note's object
    public String toString() {
        return
                "Title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created Date='" + createdAt + '\'' +
                ", updated Date='" + updatedAt ;

    }

}

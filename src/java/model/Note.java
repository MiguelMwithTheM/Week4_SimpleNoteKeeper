package model;

import java.io.Serializable;

/**
 *
 * @author migue
 */

public class Note implements Serializable {
    private String title;
    private String content;
    
    //Constructors
    public Note() {
        title = "";
        content = "";
    }
    
    public Note(String newTitle, String newContent) {
        this.title = newTitle;
        this.title = newContent;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}

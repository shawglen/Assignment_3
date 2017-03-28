package ca.glenshaw.todo;

/**
 * Created by glen on 27/03/2017.
 */

public class Item {

    private String title;

    public Item() {}

    public Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
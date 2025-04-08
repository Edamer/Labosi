package hr.fer.oop;

public class TaskTag {
    private String name;

    public TaskTag(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "@"+this.name;
    }
}
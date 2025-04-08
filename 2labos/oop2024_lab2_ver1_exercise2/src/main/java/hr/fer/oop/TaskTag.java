package hr.fer.oop;

public class TaskTag {
    private String name;

    @Override
    public String toString() {
        return "@" + name;
    }

    public TaskTag(String name) {
        this.name = name;
    }
}

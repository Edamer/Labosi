package hr.fer.oop;

public class Task {
    private String text;
    private int n;

    public Task(String text) {
        this.text = text;
        n = 0;
    }

    @Override
    public String toString() {
        return this.text;
    }

    public void add(TaskTag t) {
        if (n < 10) {
            this.text += " " + t.toString();
        }
        n++;
    }
}
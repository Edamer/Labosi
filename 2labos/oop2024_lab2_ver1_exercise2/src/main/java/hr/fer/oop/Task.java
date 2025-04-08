package hr.fer.oop;

public class Task {
    private final String text;
    TaskTag[] taskTag = new TaskTag[10];
    int idx=0;
    public Task(String text) {
        this.text = text;
    }
    public void add(TaskTag t) {
        if(idx<11){
            taskTag[idx] = t;
            idx++;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        for (int i = 0; i < idx; i++) {
            sb.append(" ").append(taskTag[i].toString());
        }
        return sb.toString();
    }
}

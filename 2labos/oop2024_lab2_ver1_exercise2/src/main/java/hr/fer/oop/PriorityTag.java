package hr.fer.oop;

public class PriorityTag extends TaskTag {
    private int priority;

    public PriorityTag(String name, int priority) {
        super(name);
        this.priority = priority;
    }

    @Override
    public String toString() {
        return super.toString()+"("+priority+")";
    }
}
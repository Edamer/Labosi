package hr.fer.oop;



public class Main {
    public static void main(String[] args) {

        Task task = new Task("some task");
        System.out.println(task);

        task.add(new TaskTag("todo"));
        System.out.println(task);

        task.add(new PriorityTag("priority", 3));
        System.out.println(task);

        task.add(new ParameterTag("repeat", "weekly"));
        System.out.println(task);

        task.add(new DateTag("due", 2020, 5, 1));
        System.out.println(task);

        task.add(new DateTag("start", 2020, 4, 40));
        System.out.println(task);
    }
}

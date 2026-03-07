
public class p1 {
    /* 
        Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
Create a Task class with name and priority.
Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
Add at least 5 tasks with different priorities.
Print the tasks in the order they are executed.
In a priority queue, elements are ordered based on priority (not insertion order). By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.
     */

    static class Task implements Comparable<Task> {
        String name;
        int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(this.priority, other.priority);
        }

        @Override
        public String toString() {
            return "Task{name='" + name + "', priority=" + priority + "}";
        }

    }
    public static void main(String[] args) {
        java.util.PriorityQueue<Task> taskQueue = new java.util.PriorityQueue<>();

        taskQueue.offer(new Task("Task 1", 3));
        taskQueue.offer(new Task("Task 2", 1));
        taskQueue.offer(new Task("Task 3", 4));
        taskQueue.offer(new Task("Task 4", 2));
        taskQueue.offer(new Task("Task 5", 5));

        System.out.println("Tasks in order of execution based on priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}

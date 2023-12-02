package ManagementTask;

import java.util.Map;
import java.util.HashMap;

public class Taskmanage {
    private Map<Integer, Task> tasks = new HashMap<>();
    private int id1 = 1;

    public void addTask(Task task) {
        task.getId();
        tasks.put(task.getId(), task);
        System.out.println("Task added successfully.");
    }
    public void viewTasks() {
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
    public void editTask(int newId, String newName, String newStatus, String newDate) {
        Task task = tasks.get(newId);
        //Điều kiện kiểm tra xem task có tồn tại không
        if (task != null) {
            task.setName(newName);
            task.setStatus(newStatus);
            task.setDate(newDate);
            System.out.println("Task edit successfully.");
        } else {
            System.out.println("Not found");
        }
    }
    public void removeTask(int newId) {
        //kiểm tra xem có tồn tại không
        if (tasks.containsKey(newId)) {
            tasks.remove(newId);
            System.out.println("Task remove successfully.");
        } else {
            System.out.println("Not found");
        }
    }
}

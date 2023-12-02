package ManagementTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taskmanage taskManager = new Taskmanage();

        while (true) {
            System.out.println("==================================");
            System.out.println("WELCOME TO TASK MANAGEMENT");
            System.out.println("==================================");
            System.out.println("1. Create Task");
            System.out.println("2. Edit task");
            System.out.println("3. Remove Task");
            System.out.println("4. View Task");
            System.out.println("5. Exit");
            System.out.print("(Choose 1 to add task, 2 to edit task, 3 to remove task, 4 to exit program) : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter task status(Todo/Pending/Done): ");
                    String status = sc.nextLine();

                    Task newtask = new Task(0, name, status, date);
                    taskManager.addTask(newtask);
                    break;
                case 2:
                    System.out.println("Enter edit task");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new task name: ");
                    String updateName = sc.nextLine();
                    System.out.print("Enter new task status (Todo/Pending/Done): ");
                    String updateStatus = sc.nextLine();
                    System.out.print("Enter Date: ");
                    String newdate = sc.nextLine();

                    taskManager.editTask(updateId, updateName, updateStatus, newdate);
                    break;
                case 3:
                    System.out.println("Enter task ID to delete: ");
                    int removeId = sc.nextInt();
                    taskManager.removeTask(removeId);
                    break;
                case 4:
                    taskManager.viewTasks();
                    break;
                case 5:
                    System.out.println("Exit.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please select again.");
            }
        }
    }
}

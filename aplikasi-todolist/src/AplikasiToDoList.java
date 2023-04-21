import java.util.Scanner;

public class AplikasiToDoList {

    public static String[] model = new String[10];

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------------- Todolist -------------");

        unitTest.testViewShowTodoList(model);
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        return sc.nextLine();
    }
}
import java.util.Scanner;

public class UserInput {
    public static String getUserData() {
        String userData;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите данные в следующем порядке, разделенные пробелом:");
            System.out.println("Фамилия Имя Отчество Дата_рождения Номер_телефона Пол_(f или m)");
            userData = scanner.nextLine();
        }

        return userData;
    }
}

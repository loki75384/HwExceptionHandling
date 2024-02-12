import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    public static void saveUserData(String userData) throws IOException {
        String[] parts = userData.split(" ");
        if (parts.length != 6) {
            throw new IllegalArgumentException("Неверное количество данных!");
        }

        String lastName = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String birthDate = parts[3];
        long phoneNumber;
        char gender;

        try {
            phoneNumber = Long.parseLong(parts[4]);
            gender = parts[5].charAt(0);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Неверный формат данных!");
        }

        String fileName = lastName + ".txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(lastName + " " + firstName + " " + middleName + " " + birthDate + " " + phoneNumber + " " + gender + "\n");
        }
    }
}

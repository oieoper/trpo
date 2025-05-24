import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class trpo {
    public static void main(String[] args) {
        String lastName = "Gembitskiy";
        String firstName = "Danila";

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Surname : " + lastName);
        System.out.println("Name: " + firstName);
        System.out.println("Time: " + formattedTime);
    }
}
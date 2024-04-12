import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NY_TimeZone  {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("America/New_York"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(formatter);
        System.out.println("Current time in New York: " + formattedTime);
    }
}

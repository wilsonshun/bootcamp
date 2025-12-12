import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.of (2025, 12, 31, 23, 59, 59); 
        System.out.println(currentTime); // 2025-12-31T23:59:59

        System.out.println(currentTime.plusMinutes(32));
        System.out.println(currentTime.minusDays(2));

        // Re-format
        System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MMM HH:mm"))); // 31 Dec 23:59
        System.out.println(currentTime.format(DateTimeFormatter.ofPattern("dd MMM hh:mm:ss a"))); // 31 Dec 11:59:59 pm

        // Time Zone: 
        ZoneId newYork = ZoneId.of("America/New_York"); 
        ZonedDateTime newYorkZoneTime = ZonedDateTime.of(currentTime, newYork); 
        System.out.println(newYorkZoneTime);

        // newYorkTime (ZoneDateTime) -> LocalDateTime 
        LocalDateTime newYorkLocalDateTime = newYorkZoneTime.withZoneSameInstant(ZoneId.of("Asia/Hong_Kong")).toLocalDateTime(); 
        System.out.println(newYorkLocalDateTime); // 2026-01--1T12:59:59

        // newYorkTime (ZoneDateTime) -> LocalDateTime (Approach 2)
        ZoneId hongkong = ZoneId.of("Asia/Hong_Kong"); 
        LocalDateTime hongkongLocalDateTime = newYorkZoneTime.withZoneSameInstant(hongkong).toLocalDateTime(); 
        System.out.println(hongkongLocalDateTime); // 2026-01--1T12:59:59

        System.out.println(LocalDateTime.now()); // current time
        System.out.println(LocalDate.now()); // current date

        // Epoch Second -> the total second since 1970 1 1 00:00:00 
        System.out.println(LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8))); // ! UTC+8

        System.out.println(LocalDateTime.now().getNano()); 
        System.out.println(LocalDateTime.now().truncatedTo(ChronoUnit.MICROS)); // 2025-12-08T12:36:20.621601

        }
}

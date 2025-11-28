import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.io.IOException;

public class ExceptionLogger {
    private static final String logFile = "Labs\\Lab4\\task3\\exceptions_logs.txt";

    public static void logException(Exception exception) {

        try (FileWriter fileWriter = new FileWriter(logFile, true); PrintWriter writer = new PrintWriter(fileWriter)) {

            String time = LocalDateTime.now().toString();
            String exceptionType = exception.getClass().getName();

            writer.println("[" + time + "] " + exceptionType + ": " + exception.getMessage());

        } catch (IOException ex) {
            System.out.println("Ошибка логирования: " + ex.getMessage());
        }
    }
}
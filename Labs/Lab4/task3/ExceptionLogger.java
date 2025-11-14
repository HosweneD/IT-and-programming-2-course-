import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class ExceptionLogger {
    private static final String logFile = "exceptions.log";
    
    public static void logException(Exception ex) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFile, true))) {
            writer.print(new Date() + " " + ex.getClass().getSimpleName() + " " + ex.getMessage());
        } catch (IOException ioException) {
            System.err.println("Ошибка в процессе логирования: " + ioException.getMessage());
        }
    }
}
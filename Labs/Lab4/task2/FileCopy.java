import java.io.IOException;
import java.nio.file.*;

public class FileCopy {
    public static void main(String[] args) {

        Path sourceFile = Paths.get("Labs\\Lab4\\task2\\source.txt");
        Path destinationFile = Paths.get("Labs\\Lab4\\task2\\destination.txt");

        try {
            if (!Files.exists(sourceFile)) {
                throw new java.nio.file.NoSuchFileException("исходный файл не найден (" + sourceFile + ")");
            }
            if (!Files.exists(destinationFile)) {
                throw new java.nio.file.NoSuchFileException("целевой файл не найден (" + destinationFile + ")");
            }

            Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Содержимое файла скопировано.");

        } catch (java.nio.file.NoSuchFileException ex) {
            System.out.println("Ошибка открытия: файл не существует - " + ex.getMessage());
        } catch (java.nio.file.AccessDeniedException ex) {
            System.out.println("Ошибка: нет прав на изменение файла - " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Ошибка ввода / вывода при чтении / записи: " + ex.getMessage());
        }
    }
}
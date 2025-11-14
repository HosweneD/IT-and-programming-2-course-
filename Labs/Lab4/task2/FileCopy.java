package Labs.Lab4;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        
        String sourceFile = "Labs\\Lab4\\source.txt";
        String destinationFile = "Labs\\Lab4\\destination.txt";

        try {
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("Файл успешно скопирован.");
            
            fis.close();
            fos.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка открытия файла: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи: " + e.getMessage());
            }
        }
    }
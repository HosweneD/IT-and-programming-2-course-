import java.util.HashMap;
import java.util.Map;

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageGrade;

    public Student(String firstName, String lastName, int age, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public double getAverageGrade() { return averageGrade; }

    @Override
    public String toString() {
        return String.format("Студент: %s %s, возраст: %d, средний балл: %.2f", 
                           firstName, lastName, age, averageGrade);
    }
}

public class StudentDatabase {
    private Map<String, Student> students = new HashMap<>();

    public void addStudent(String recordBookNumber, Student student) {
        students.put(recordBookNumber, student);
        System.out.println("Студент добавлен: " + recordBookNumber);
    }

    public Student findStudent(String recordBookNumber) {
        Student student = students.get(recordBookNumber);
        if (student != null) {
            System.out.println("Найден: " + recordBookNumber + " - " + student);
        } else {
            System.out.println("Не найден: " + recordBookNumber);
        }
        return student;
    }

    public boolean removeStudent(String recordBookNumber) {
        Student student = students.remove(recordBookNumber);
        if (student != null) {
            System.out.println("Удален: " + recordBookNumber + " - " + student);
            return true;
        } else {
            System.out.println("Не найден для удаления: " + recordBookNumber);
            return false;
        }
    }

    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();

        db.addStudent("001", new Student("Святослав", "Аксенов", 20, 4.5));
        db.addStudent("002", new Student("Ирина", "Колпакова", 19, 4.8));

        db.findStudent("001");
        db.findStudent("003");

        db.removeStudent("002");
        db.findStudent("002");
    }
}
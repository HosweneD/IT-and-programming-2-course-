public class AgeValidator {
    public static void validateAge(int age) throws CustomAgeException {
        if (age < 0 || age > 120) {
            throw new CustomAgeException("Недопустимый возраст (" + age + "). Возраст должен быть 0 до 120 лет.");
        } else {
            System.out.println("Возраст " + age + " допустим.");
        }
    }
}
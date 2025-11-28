public class Main {
    public static void main(String[] args) {

        int[] ages = {52, -1, 121};

        String[] emails = {"biba12@gmail.com", "das@d@", "EEE", "boba13@yandex.ru"};

        for (int age : ages) {
            try {
                AgeValidator.validateAge(age);
            } catch (CustomAgeException ex) {
                System.out.println(ex);
                ExceptionLogger.logException(ex);
            }
        }

        for (String email : emails) {
            try {
                EmailValidator.validateEmail(email);
            } catch (CustomEmailFormatException ex) {
                System.out.println(ex);
                ExceptionLogger.logException(ex);
            }
        }
    }
}
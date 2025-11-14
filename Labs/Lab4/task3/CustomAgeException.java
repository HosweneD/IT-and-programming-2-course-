class CustomAgeException extends Exception {
    public CustomAgeException(int age) {
        super("Некоректный возраст " + "(" + age + ")," + " возраст должен быть не меньше 0 и не больше 120.");
    }
}
class CustomFileNotFoundException extends Exception {
    public CustomFileNotFoundException(String fileName) {
        super("Файл не найден " + "(" + fileName + ")");
    }
}
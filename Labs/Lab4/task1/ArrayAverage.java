public class ArrayAverage {
    public static void main(String[] args) {

        Object[] arr = {"Mouse", 92, 3.15, 18, 84.3, "word", 31, "OBJECT"};
        // Object[] arr = null;

        double sum = 0;
        int count = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Number) {
                    sum += ((Number)arr[i]).doubleValue();
                    count++;
                } else {
                    System.out.println("Элемент с индексом " + i + " не является числом.");
                }
            }

            double average = sum / count;
            System.out.println(" > Среднее арифметическое массива: " + average);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка: выход за границы массива.");
        } catch (NullPointerException ex) {
            System.out.println("Ошибка: массив не инициализирован.");
        }
    }
}
package Labs.Lab4;

public class ArrayAverage {
    public static void main(String[] args) {
        
        Object[] arr = {1, "Bobr", 2, 3, 18, 84, "Bombom", 31};
        
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
            System.out.println("Среднее арифметическое массива: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за границы массива.");
        }
    }
}
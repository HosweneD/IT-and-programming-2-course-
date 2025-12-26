public class ArraySumMultithreaded {

    static class ArraySumThread extends Thread {
        private int[] array;
        private int startIndex;
        private int endIndex;
        private int partialSum;
        
        public ArraySumThread(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.partialSum = 0;
        }
        
        @Override
        public void run() {
            for (int i = startIndex; i < endIndex; i++) {
                partialSum += array[i];
            }
        }
        
        public int getPartialSum() {
            return partialSum;
        }
    }
    
    public static void main(String[] args) {
        // Создаем массив для тестирования
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        
        // Вычисляем сумму в одном потоке для проверки
        int singleThreadSum = 0;
        for (int i = 0; i < array.length; i++) {
            singleThreadSum += array[i];
        }
        System.out.println("Сумма в одном потоке: " + singleThreadSum);
        
        // Разделяем массив на две части
        int mid = array.length / 2;
        
        // Создаем два потока (наследники Thread)
        ArraySumThread thread1 = new ArraySumThread(array, 0, mid);
        ArraySumThread thread2 = new ArraySumThread(array, mid, array.length);
        
        // Запускаем потоки
        thread1.start();
        thread2.start();
        
        try {
            // Ждем завершения обоих потоков
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Поток был прерван: " + e.getMessage());
        }
        
        // Суммируем результаты
        int totalSum = thread1.getPartialSum() + thread2.getPartialSum();
        
        System.out.println("Сумма первой половины: " + thread1.getPartialSum());
        System.out.println("Сумма второй половины: " + thread2.getPartialSum());
        System.out.println("Общая сумма в двух потоках: " + totalSum);
        
        // Проверяем корректность
        if (singleThreadSum == totalSum) {
            System.out.println("Результаты совпадают!");
        } else {
            System.out.println("Ошибка: результаты не совпадают!");
        }
    }
}
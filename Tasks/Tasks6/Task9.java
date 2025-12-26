import java.util.Scanner;
import java.util.HashMap;
import java.util.Collection;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String result = isValid(input);
        System.out.println(result);
    }

    private static String isValid(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        HashMap<Integer, Integer> freqOfFreq = new HashMap<>();
        for (int freq : freqMap.values()) {
            freqOfFreq.put(freq, freqOfFreq.getOrDefault(freq, 0) + 1);
        }

        if (freqOfFreq.size() == 1) {
            return "YES";
        }

        if (freqOfFreq.size() == 2) {

            Collection<Integer> frequencies = freqOfFreq.keySet();
            Integer[] freqArray = frequencies.toArray(new Integer[2]);
            int freq1 = freqArray[0];
            int freq2 = freqArray[1];

            int count1 = freqOfFreq.get(freq1);
            int count2 = freqOfFreq.get(freq2);

            if (freq1 > freq2) {
                int temp = freq1;
                freq1 = freq2;
                freq2 = temp;

                temp = count1;
                count1 = count2;
                count2 = temp;
            }

            if ((freq1 == 1 && count1 == 1) || 
                (freq2 == freq1 + 1 && count2 == 1)) {
                return "YES";
            }
        }

        return "NO";
    }
}
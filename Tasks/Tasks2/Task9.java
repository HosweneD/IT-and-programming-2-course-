package Tasks.Tasks2;

import java.util.*;

public class Task9 {
    public static int[] mergeUniqueSorted(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();
        for (int num : a) set.add(num);
        for (int num : b) set.add(num);
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) result[i++] = num;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\], \\[");
        
        String firstPart = parts[0].substring(1);
        int[] array1;
        if (firstPart.isEmpty()) {
            array1 = new int[0];
        } else {
            String[] nums1 = firstPart.split(",");
            array1 = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                array1[i] = Integer.parseInt(nums1[i].trim());
            }
        }
        
        String secondPart = parts[1].substring(0, parts[1].length() - 1);
        int[] array2;
        if (secondPart.isEmpty()) {
            array2 = new int[0];
        } else {
            String[] nums2 = secondPart.split(",");
            array2 = new int[nums2.length];
            for (int i = 0; i < nums2.length; i++) {
                array2[i] = Integer.parseInt(nums2[i].trim());
            }
        }
        
        int[] result = mergeUniqueSorted(array1, array2);
        
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]);
            if (i < result.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
        
        scanner.close();
    }
}
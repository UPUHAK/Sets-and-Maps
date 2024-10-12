import java.util.*;

public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("\n------------\ntask 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        // task 2
        System.out.println("\n------------\ntask 2");

        List<Integer> nums2 = new ArrayList<>(List.of(4, 5, 2, 7, 3, 5, 9, 2, 3, 8));
        System.out.println(nums2);

        Set<Integer> set = new HashSet<>(nums2);
        System.out.println(set);

        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        // task 3
        System.out.println("\n------------\ntask 3");

        String text = "гуси гуси га га га есть хотите да да да";
        System.out.println(text);

        String[] words = text.split("\\s+");
        System.out.println(Arrays.toString(words));

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println(uniqueWords);

        // task 4
        System.out.println("\n------------\ntask 4");

        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        for (Integer value : wordCount.values()) {
            System.out.println(value);
        }

    }


}
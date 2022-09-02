import java.util.*;

public class Main {

    public static void quest1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println();
    }

    public static void quest2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        int origNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != origNum) {
                System.out.println(num);
                origNum = num;
            }
        }
        System.out.println();
    }

    public static void quest3() {
        List<String> words = new ArrayList<>(List.of("Корабли", "лавировали", "лавировали", "да", "не", "вылавировали"));
        Set<String> origWords = new HashSet<>(words);
        System.out.println(origWords);
    }

    public static void quest4() {
        List<String> words = new ArrayList<>(List.of("Корабли", "лавировали", "лавировали", "лавировали", "да", "не", "вылавировали"));
        Set<String> origWords = new HashSet<>(words);
        System.out.println(words.size() - origWords.size());
    }

    public static void main(String[] args) {
        //Задание 1
        quest1();

        //Задание 2
        quest2();

        //Задание 3
        quest3();

        //Задание 4
        quest4();
    }
}
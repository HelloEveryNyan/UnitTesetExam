package programm1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements first list separated by spaces:");
        List<Integer> list1 = readIntegerList(scanner);

        System.out.println("Enter elements second list separated by spaces:");
        List<Integer> list2 = readIntegerList(scanner);

        ListComparator listComparator = new ListComparator();
        String result = listComparator.compareLists(list1, list2);

        System.out.println(result);
    }

    private static List<Integer> readIntegerList(Scanner scanner) {
        List<Integer> list = new ArrayList<>();
        String[] elements = scanner.nextLine().split(" ");

        for (String element : elements) {
            list.add(Integer.parseInt(element));
        }

        return list;
    }
}

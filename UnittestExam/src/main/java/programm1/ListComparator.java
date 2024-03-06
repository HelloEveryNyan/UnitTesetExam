package programm1;

import java.util.List;

public class ListComparator {
    private final AverageCalculator averageCalculator;

    public ListComparator() {
        this.averageCalculator = new AverageCalculator();
    }

    public String compareLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Lists cannot be null");
        }

        double averageList1 = averageCalculator.calculateAverage(list1);
        double averageList2 = averageCalculator.calculateAverage(list2);

        if (averageList1 > averageList2) {
            return "The first list has a higher average value";
        } else if (averageList2 > averageList1) {
            return "The second list has a higher average value";
        } else {
            return "The average values are";
        }
    }
}
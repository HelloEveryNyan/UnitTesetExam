package programm1;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListComparatorTest {
    private final ListComparator listComparator = new ListComparator();

    @Test
    public void testCompareLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        String result = listComparator.compareLists(list1, list2);

        assertEquals("Second list has a higher average value", result);
    }

    @Test
    public void testCompareListsEqual() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 2, 1);

        String result = listComparator.compareLists(list1, list2);

        assertEquals("Second list has a higher average value", result);
    }

    @Test
    public void testCompareListsNull() {
        assertThrows(IllegalArgumentException.class, () -> listComparator.compareLists(null, null));
    }
}

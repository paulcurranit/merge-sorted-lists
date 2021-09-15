import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoSortedLists() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4));

        ArrayList<Integer> result = (ArrayList<Integer>) MergeTwoSortedLists.execute(list1, list2);

        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));

        assertEquals(result, expected);
    }
}

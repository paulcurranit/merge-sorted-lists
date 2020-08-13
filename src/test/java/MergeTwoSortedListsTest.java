
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoSortedLists() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,4));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,3,4));

        ArrayList<Integer> result = (ArrayList<Integer>) MergeTwoSortedLists.execute(list1, list2);

        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,4));

        assertTrue(result.equals(expected));
    }

}

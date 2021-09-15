import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {

    public static List<Integer> execute(List<Integer>list1, List<Integer> list2) {
        ArrayList<Integer>mergedList = new ArrayList<>();

        int index1 = 0;
        int index2 = 0;

        while(index1 < list1.size() || index2 < list2.size()) {
            if(index1 >= list1.size()) {
                mergedList.add(list2.get(index2));
                index2++;
            } else if(index2 >= list2.size()) {
                mergedList.add(list1.get(index1));
                index1++;
            } else {
                int int1 = list1.get(index1);
                int int2 = list2.get(index2);
                if(int1 < int2) {
                    mergedList.add(int1);
                    index1++;
                } else {
                    mergedList.add(int2);
                    index2++;
                }
            }
        }

        return mergedList;
    }
}

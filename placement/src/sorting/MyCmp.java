package sorting;

import java.util.Comparator;

public class MyCmp implements Comparator<PointComparator> {


    @Override
    public int compare(PointComparator o1, PointComparator o2) {
       return o1.x -o2.x;
    }
}

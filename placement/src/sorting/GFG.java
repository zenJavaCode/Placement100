package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GFG {

    public static void main(String[] args) {
        List<PointComparator> list = new ArrayList<>();
        list.add(new PointComparator(5,10));
        list.add(new PointComparator(2,20));
        list.add(new PointComparator(10,30));
        Collections.sort(list,new MyCmp());


        for(PointComparator p : list){

            System.out.println(p.x + " "+p.y);
        }

    }
}

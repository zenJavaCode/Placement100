package sorting;

public class Point implements  Comparable<Point>{

    int x,y;

    @Override
    public int compareTo(Point o) {
        return this.x - o.x;
    }
}

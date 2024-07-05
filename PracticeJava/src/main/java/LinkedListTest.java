import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(1); l.add(2); l.add(4);
        System.out.println(l);
        l.set(2,3);
        System.out.println(l.get(2));//3
        l.remove(1);
        System.out.println(l);


    }
}

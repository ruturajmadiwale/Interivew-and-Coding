import java.util.ArrayList;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {
        List<Integer> la = new ArrayList<Integer>();
        List<Integer> la1 = new ArrayList<Integer>();
        la1.add(4);
        la1.add(5);
        la1.add(6);

        la.add(1);
        la.add(2);
        la.add(3);

        la.addAll(la1);

        System.out.println(la.remove(0));
        System.out.println(la);
        System.out.println(la.get(1));
    }
}

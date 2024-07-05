import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(15); list.add(13); list.add(11); list.add(8); list.add(9);

        System.out.println(list);

        System.out.println(list.get(1));

        list.add(1,12);
        System.out.println(list);

        //modify
        list.set(0,10);
        System.out.println(list);
        //Collections.sort(list);
        for(int i=0; i<list.size(); i++) {
            for (int j=i+1; j<list.size();j++) {
                if(list.get(j)<list.get(i)) {
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);

                }
            }
        }

        System.out.println(list);
    }

}

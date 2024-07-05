import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String s = "Bread butter bread butter hi hi";
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        Set<String> set = new HashSet<String>();

        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }

        Iterator<String> itr= set.iterator();
        while (itr.hasNext()) {
            int count=0;
            String text = itr.next();
            for(int j=0; j<arr.length; j++) {
                if(text.equals(arr[j])) {
                    count++;
                }
            }
            if(count>1) {
                System.out.println(text+":"+count);
            }
        }
    }
}

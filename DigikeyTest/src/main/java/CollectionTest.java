import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("hi"); ls.add("hello"); ls.add("there");
        for(String s: ls){
            System.out.println(s);
        }
        System.out.println("---------------------------");
        Set<String> ss = new HashSet<String>();
        ss.add("hi"); ss.add("hello"); ss.add("there"); ss.add("hello");
        Iterator<String> it = ss.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------------------------");
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"rutu"); map.put(2,"raj"); map.put(3,"shruti");
        for(Map.Entry<Integer, String> baapu: map.entrySet()) {
            System.out.println(baapu.getKey()+" "+baapu.getValue());
        }

        System.out.println("-------------------------------");
        Stack<String> st = new Stack<String>();
        st.push("hi"); st.push("hello"); st.push("there");
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);

        System.out.println("---------------------------------");
        Queue<String> qq = new PriorityQueue<String>();
        qq.add("hi"); qq.add("hello"); qq.add("there");
        System.out.println(qq.peek());
        qq.remove();
        System.out.println(qq);
    }
}

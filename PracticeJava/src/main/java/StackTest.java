import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.push(1); s.push("hi");
        s.push("20");
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.search("Hi"));

    }

}

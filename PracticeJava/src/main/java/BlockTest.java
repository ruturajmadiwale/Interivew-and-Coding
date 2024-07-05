public class BlockTest {
    int a;
    int b;

    static int z; static int y;
    {
        a=10;
        b=20;
    }
    static {
        z=20;
        y=30;
        System.out.println(z+""+y);
    }

    public  void test1() {
        String a = "Abca";
        String b = "abca";
        StringBuffer sb = new StringBuffer("dfg");
        System.out.println(b.compareTo(a));
        System.out.println("UpperCase:"+a.toUpperCase());
        System.out.println("Lower Case:"+a.toLowerCase());
        System.out.println("trim:"+a.trim());
        System.out.println("indexOf a:"+a.indexOf('a'));
        System.out.println("last index of a:"+a.lastIndexOf('a'));
        System.out.println("char at of character:"+a.charAt(1));
        System.out.println("string length:"+a.length());
        System.out.println("substring with only start index:"+a.substring(0));
        System.out.println("substring with end index too:"+a.substring(1,3));
        System.out.println("replace of character:"+a.replace('a','d'));
        System.out.println("startWith:"+a.startsWith("ab"));
        System.out.println("endsWith:"+a.endsWith("cad"));
        System.out.println("isEmpty:"+a.isEmpty());
        System.out.println(a.compareToIgnoreCase(b));
        System.out.println(a.equalsIgnoreCase(b));
    }

    public static void main(String[] args) {
        BlockTest bb = new BlockTest();
        //System.out.println(bb.a+" "+bb.b);
        bb.test1();
    }
}

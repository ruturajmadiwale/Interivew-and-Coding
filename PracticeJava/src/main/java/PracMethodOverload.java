public class PracMethodOverload {

    static int z; int y;

       PracMethodOverload() {

         z=25;
        System.out.println("constructor");
    }

    PracMethodOverload(int a, int b) {
        this();
        System.out.println("constructor="+a+b);
    }

    void method1(String c, int a){
        System.out.println(c+""+a);
    }

    int method1(int c, String a){
        System.out.println(c+""+a);
        return c;
    }

    public  void normalMethod() {
        System.out.println("Testing the abstraction");
    }

    public static void main(String[] args) {
        PracMethodOverload p1 = new PracMethodOverload(20,20);
//        p1.method1("raj",30);
//        System.out.println(p1.method1(20,"raj2"));
        System.out.println(z);
        //Math.sqrt(16);
        Encap en = new Encap();



    }
}

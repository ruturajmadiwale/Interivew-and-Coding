public class Prac2 extends  PracMethodOverload {
static int d = 10;
int g = 10;
    void show(Prac2 p) {
        System.out.println("method="+p);
    }
    void display(){
        System.out.println(d);
        show(this);
        System.out.println(z);
    }

    @Override
    public   void  method1(String c, int a) {
        System.out.println();
    }

    @Override
    public  void normalMethod() {
        System.out.println("Testing the abstraction");
    }

    public static void main(String[] args) {
       // PracMethodOverload p1 = new PracMethodOverload();
        Prac2 pp = new Prac2();
        pp.display();
    }
}

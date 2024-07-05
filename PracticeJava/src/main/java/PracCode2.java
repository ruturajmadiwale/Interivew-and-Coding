import org.testng.annotations.Test;

public  class PracCode2 extends PracCode {

    public static void main(String[] args) {
        //System.out.println();
        PracCode pp = new PracCode();
        //System.out.println(pp.getX());
        String x = "abc";
        String y = "abc";
        System.out.println(x.concat(y));
        System.out.println(x);
        System.out.println(y);
        System.out.println(act);
        System.out.println(y);

    }

    @Override
    public void testStart() {


        try {

        }
        finally{
            System.out.println();
        }
    }

    public void test1() {

    }

    public void test2() {
        int x=10;
        Integer y = new Integer(x);

        int z =Integer.valueOf(y);

    }


   // public abstract static void check();

    @Test(invocationCount = 100)
    public  void testngtest1() {

    }

}

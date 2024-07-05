public class Pyramids {

    public static void rightAngleNumber() {
/*      1
        2 3
        4 5 6
        7 8 9 10      */
        //i = rows  j = columns
        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
                number++;
            }
            System.out.println();
        }
    }

    public static void rightAngleNumber2() {
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=4; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pyramidNumber() {
        int number=4;
        for(int i=1; i<=4; i++) {
            for (int k=1; k<number; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            number--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //rightAngleNumber();
        //rightAngleNumber2();
        pyramidNumber();
    }

}

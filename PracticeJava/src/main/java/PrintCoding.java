import java.util.*;

public class PrintCoding {

    public static void printFibonacciSeries(int n) {
        //0,1,1,2,3,5,8
        int prev=0; int cur=1;
        System.out.print(prev+" "+cur+" ");
        for(int i=2; i<n; i++) {
            int temp=cur;
            cur = prev+cur;
            prev=temp;
            System.out.print(cur+" ");
        }
    }

    public static void iterateOverList() {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(2); intList.add(6); intList.add(4);
        Iterator<Integer> it = intList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        ListIterator<Integer> list = intList.listIterator();
        while (list.hasNext()) {
            System.out.print(list.next()+" ");
            //System.out.println(list.previous());
        }

    }

    public static void generatePermutation() {
        String a = "ABC";
        genPer(a,0,a.length());

    }

    public static String swap(String a,int i,int j) {
        char[] c = a.toCharArray();
        char ch = c[i];
        c[i]=c[j];
        c[j]=ch;
        return String.valueOf(c);
    }

    public static void genPer(String a, int start, int end) {

        if(start==end-1)
            System.out.println(a);
        else {
            for(int i=start; i<end; i++) {
                a = swap(a,start,i);
                genPer(a,start+1,end);
                a = swap(a,start,i);
            }
        }
    }

    public static void main(String[] args) {
       // printFibonacciSeries(7);
        //iterateOverList();
        generatePermutation();
    }

}

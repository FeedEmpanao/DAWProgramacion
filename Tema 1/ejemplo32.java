import java.util.Scanner;

public class ejemplo32 {
    public static void main(String[] args) {
        Scanner llenararray = new Scanner(System.in);
        int [] a = new int[10];

        for (int i = 0; i<a.length ; i++) {
            a[i] = llenararray.nextInt();
        }
        
        llenararray.close();

        for (int j = a.length-1; j>=0; j--) {
            System.out.println(a[j]);
        }




    }
}

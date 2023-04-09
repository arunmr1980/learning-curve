import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
	scan.nextLine();
        String s = scan.nextLine();
        /*while(scan.hasNext()){
	    String str = scan.next();
	    if(str.equals("q")){
	       break;
	    }
            s = s + str + " ";
        }
        s.trim();*/

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

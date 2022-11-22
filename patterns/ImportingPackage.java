//import package
import java.io.PrintStream;
import java.lang.*;
import java.util.Arrays;
package myPackage;
import java.util.*;
public class ImportingPackage {
           public static void main(String[] args) {
               Scanner read = new Scanner(System.in);
               int i = read.nextInt();
               System.out.println("You have entered a number " + i);
               Random rand = new Random();
               int num = rand.nextInt(100);
               System.out.println("Randomly generated number " + num);
        }
}

//system classes
class SystemDemo
{
    public static void main(String args[])
    {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};

        System.arraycopy(a, 0, b, 2, 2);

        // array b after arraycopy operation
        System.out.println(Arrays.toString(b));

    }
}

//stream classes
class Main {
    public static void main(String[] args) {

        String data = "This is a text inside the file.";

        try {
            PrintStream output = new PrintStream("output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}


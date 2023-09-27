import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class inp {

    public static void main(String[] args) throws IOException{
        
        System.out.println("Enter a number : ");

        // using buffered reader to take input from user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        // BufferedReader is a resource which is used to take input from user

        // using scanner to take input from user
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        
        System.out.println("You entered : " + a);

        // closing the buffered reader
        br.close();
        // closing the scanner
        sc.close();

    }
    
}

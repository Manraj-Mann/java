
import java.io.*;
public class inp2 {
    

    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;
        
        // this way automatically closes the resource
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
){

            j = Integer.parseInt(br.readLine());
            System.out.println("You entered : " + j);


        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{

            // br.close();// manually closing
            
            System.out.println(" irrespective of the exception, this block will be executed");
            System.out.println("This is the finally block");
        }
         
    }
}

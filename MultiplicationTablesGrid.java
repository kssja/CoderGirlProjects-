import static java.lang.System.out;
import java.util.Scanner;
import java.util.Formatter;

public class MultiplicationTablesGrid{

    public static void getTopRow(int size){

        out.print("     ");
        
        for(int x = 0; x<=size; x++){
            
            out.printf("%5d",x);

        }
        out.println("");

    }

    public static void getLeftColumn(int size){

        for(int x=0; x<=size; x++){
            out.println(x);
        }
    }

    
    public static void getSize(int size){

        for(int y =0; y <=size; y++){
          //  if(y==0){
            //out.print("    ");
         //}else{ 
            out.printf("%5d",y);
        
          for(int x=0; x <=size;x++){
                    
                    out.printf("%5d",x *(y+0) );

                }
                
                out.println("");
            }  
        }     
        

    

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        out.println("Welcome to Mutliplication Tables");
        out.println("Enter a number less than 21 to see a table");

        int size = keyboard.nextInt();
        while(size>20){
            out.println("Sorry your number is too large.  Please try again.");
            size=keyboard.nextInt();
        }
        getTopRow(size);
        getSize(size);
    }
}

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;

public class MultidimensionalArrays{

    public static void printHeader(String days[]){
        for(int  row=0; row<days.length; row++){
            System.out.print(days[row]+"\t");

        }System.out.println("");
    }

    public static void printTable(int temps[][]){
        String time[][] = new String[4][1];
        time[0][0]="7:00 am";
        time[1][0]="3:00 pm";
        time[2][0]="7:00 pm";
        time[3][0]="3:00 am";

        for( int row=0; row<4; row++){
            for(int column=0; column<1; column++){
                System.out.print(time[row][column]+"\t");
            }
            for(int j = 0; j<7; j++){

                System.out.print(temps[row][j]+"\t");
            }
            System.out.println("");

        }
    }

    public static void printRowAverage(int temps[][]){
        int sum=0;

        String time[][] = new String[4][1];
        time[0][0]="7:00 am";
        time[1][0]="3:00 pm";
        time[2][0]="7:00 pm";
        time[3][0]="3:00 am";

        for(int row=0; row < 4 ;row++){
            for(int column=0; column<7; column++){

                sum += temps[row][column];

            }
           DecimalFormat df = new DecimalFormat("#,###,##0.00");
        
            float ravg=sum/(float)7;

            System.out.println("\n\t\t" +time[row][0]+": Average "+df.format(ravg));

            sum=0;
        }
    }

    public static void printColumnAverage(int temps[][]){
        int ccount=1;
        int sum=0;
        String days[] = new String[8];
        days[0]="";
        days[1]="Sun";
        days[2]="Mon";
        days[3]="Tues";
        days[4]="Wed";
        days[5]="Thurs";
        days[6]="Fri";
        days[7]="Sat";
        for(int column=0; column<7;column++){
            for(int row=0; row<4; row++){
                sum += temps[row][column];
            }           
            DecimalFormat df = new DecimalFormat("#,###,##0.00");

            float cavg=sum/(float)4;
            System.out.println("\n\t\t"+days[ccount]+": Average " +df.format( cavg));
            ++ccount;
            sum = 0;
        }
    }

       
    public static void printTableTotal(int temps[][]){
        int sum=0;
        for(int row=0; row<4; row++){
            for(int column=0; column<7; column++){

                sum += temps[row][column];
            }

        }
        
        DecimalFormat df = new DecimalFormat("#,###,##0.00");
        float tavg = sum/(float)28;
        System.out.println("\n\t\tTable Average: " +df.format(tavg));
    }

    public static void main(String[] args){
        String days[] = new String[8];
        days[0]="";
        days[1]="Sun";
        days[2]="Mon";
        days[3]="Tues";
        days[4]="Wed";
        days[5]="Thurs";
        days[6]="Fri";
        days[7]="Sat";

        int temps[][] = new int[4][7];

        temps[0][0]=68;
        temps[0][1]=70;
        temps[0][2]=76;
        temps[0][3]=70;
        temps[0][4]=68;
        temps[0][5]=71;
        temps[0][6]=75;

        temps[1][0]=76;
        temps[1][1]=76;
        temps[1][2]=87;
        temps[1][3]=84;
        temps[1][4]=82;
        temps[1][5]=75;
        temps[1][6]=83;

        temps[2][0]=73;
        temps[2][1]=72;
        temps[2][2]=81;
        temps[2][3]=78;
        temps[2][4]=76;
        temps[2][5]=73;
        temps[2][6]=77;

        temps[3][0]=64;
        temps[3][1]=65;
        temps[3][2]=69;
        temps[3][3]=68;
        temps[3][4]=70;
        temps[3][5]=74;
        temps[3][6]=72;

        printHeader(days);
        printTable(temps);
        printRowAverage(temps); 
        printColumnAverage(temps);
        printTableTotal(temps);   

    }
}


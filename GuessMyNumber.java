import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random; 

public class GuessMyNumber{

    public static void main(String[] args){
        long seed = System.currentTimeMillis();
        int max = 100;
        boolean pn = true;

        Random num = new Random(seed);
        String entry="yes";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("I am thinking of a number between 1 and 100.  Can you guess it?");
        int number = num.nextInt(max);

        out.println("Hi, player number one!  What's your name?");
        String name= keyboard.nextLine();

        out.println("\nHi player number two!! What's your name?");
        String name2= keyboard.nextLine();

        while(entry.equalsIgnoreCase("yes")){
            String nm="";
            int count = 0;
            int count1 =0;
            int guess = 0;

            while(entry.equalsIgnoreCase("yes")&& (count!= 6 && count1!=6)){

                if(pn == true){
                    nm = name;

                }else nm = name2;
                out.println("\n"+ nm + " ,what is your guess?");
                guess = keyboard.nextInt();

                if( (guess <1 || guess>100)){
                    System.out.println("\n" + nm +"  ,your number is not between 1 and 100."  + 
                        "Your turn is over.");

                    if (pn == true){
                        count = count +1;
                        pn = false;
                    }else{

                        count1 = count1 +1; 

                        pn=true;
                    } 
                }

                if((guess>1 && guess<100) && guess < number){
                    System.out.println("\n" + nm + "  ,sorry your number is tooooo low!!  Your turn has ended ....better luck next time");
                    if (pn == true){
                        count = count +1;
                        pn = false;
                    }else{
                        pn = true;
                        count1 = count1 +1;    
                    }    
                } 

                if( (guess >1 && guess <100) && guess > number){
                    System.out.println("\n" + nm +" ,your number is too high!  Your turn is over....sorry");
                    if (pn == true){
                        count = count +1;
                        pn = false;
                    }else{
                        count1 = count1 +1;    
                        pn = true;
                    }
                }

                if( (guess>1 && guess < 100) && guess == number){

                    System.out.println("\nPerfect "+ nm + "!! You guessed correctly!! ");

                    System.out.println("Would you like to play again?  If so, answer Yes and make a guess or No.");
                    entry = keyboard.nextLine();
                    entry = keyboard.nextLine();    
                    number = num.nextInt(max);
                    count = 0;
                    count1=0;

                }
                if(count ==5 && count1 ==5){

                    out.println("\n" + name +", "+ name2 + "  Game over for you both.....need lessons on guessing????"+
                        "\n\nWould you like to play again?  If so answer Yes and make a guess or No to end the game");
                    entry = keyboard.nextLine();
                    entry = keyboard.nextLine();
                    number = num.nextInt(max);
                    count =0;
                    count1=0;
                }}}}

}


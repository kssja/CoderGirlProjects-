import static java.lang.System.out;
import java.util.Scanner;

public class TicTacTo{
    private char currentPlayer;

    public static void printBoard(char[][]board)
    {
        System.out.println(" — — — — — — ");
        for (int i = 0; i < 3; i++)
        {
            System.out.print("| ");
            for( int j=0;j<3;j++){
                System.out.print(board[i][j]+ " |");

            }
            System.out.println();
            System.out.println("— — — — — — ");
        }
    }

    public static char[][] startBoard()
    {  char[][] gboard = new char[3][3];

        for (int i=0; i < 3; i++) 
        {   for (int j = 0; j < 3; j++) {
                gboard[i][j] = '-';
            }

        }   return gboard;
    }

    public static boolean isNotFullBoard(char[][]board){

        for(int i= 0 ; i<3; i++){
            for (int j =0; j<3; j++){
                if(board[i][j] =='-')
                {
                    return true;
                }

            }
        }      return false;
    }

    public static boolean isWinner(char [][]board)
    {
        return (checkRows(board) || checkColumns(board) || checkDiagonals(board));
    }

    private static boolean checkRows(char[][] board)
    { 
        for (int i = 0; i < 3; i++)
        {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns(char[][] board)
    {

        for (int i = 0; i < 3; i++)
        {
            if (checkRowCol(board[0][i] ,board[1][i], board[2][i]) == true)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals(char board[][])
    {  if
        ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true))
        { return true;
        }
        return false;
    }

    private static boolean checkRowCol(char c1, char c2, char c3)
    {
        if(c1 != '-'  && (c1 == c2 ) && (c2 ==c3)){
            return true;
        }    return false;
    }

    public static char changePlayer(char currentPlayer)
    {    
        if (currentPlayer == 'X')
        {  
            currentPlayer = 'O';
        }
        else
        {
            currentPlayer = 'X'; 

        }
        return currentPlayer;  
    }

    public static char placeMark(int row, int col, char currentPlayer, char[][] board){

        if ((row >= 0) && (row < 3)) {
            if ((col >= 0) && (col <3))
            {
                if (board[row][col] == '-'){
                    board[row][col] = currentPlayer;

                }
            }
        }        return board[row][col];
    }

    public static boolean isNumGood(int place){
        boolean number=true;
        if(place < 0 || place>9){
            number = false; 
            return number;
        }
        number =true;
        return number;
    }

    public static boolean isPosOpen(int row, int col, char[][]gboard){
        if(gboard[row][col]!='-'){

            return false;
        }return true;

    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        char currentPlayer = 'O';
        boolean gameIsOn = true;
        int xcount=0;
        int ocount=0;
        int ties=0;    
        String play;
        System.out.println("Welcome to TicTacToe:");
        System.out.println("To play, enter a number for which box to play in");
        System.out.println("1 2 3 ");
        System.out.println("4 5 6");
        System.out.println("7 8 9");
        System.out.println("Grab a friend and let's play TicTacToe!!");

        do{
            play = "yes";
            char[][] gboard = startBoard();
            printBoard(gboard);
            gameIsOn = true;
            int row=0;
            int col=0;
            int place;
            do{
                do{    

                    System.out.println("Player " +currentPlayer + ", enter a number between 1 and 9 ");
                    place =(keyboard.nextInt()-1);

                    if(isNumGood(place)){        

                        row = place/3;
                        col = place%3;
                        if(isPosOpen(row,col,gboard)){
                            placeMark(row,col,currentPlayer,gboard);
                            printBoard(gboard);
                            currentPlayer = changePlayer(currentPlayer);
                        } else {
                            System.out.println("Position is not available");
                        }

                    }else {
                        System.out.println("Invalid Entry!!!!!  Try again!! Enter another number");
                    }

                }while(isNumGood(place) && isPosOpen(row,col,gboard));
                if(!isWinner(gboard) && isNotFullBoard(gboard))
                    gameIsOn = true;
                else gameIsOn=false;
            }while (gameIsOn);
            if(!isNotFullBoard(gboard) && !isWinner(gboard))
            {   System.out.println("The game was a tie!");
                ++ties;
            }
            else if(isWinner(gboard)){

                currentPlayer = changePlayer(currentPlayer);
                if(currentPlayer=='X'){
                    ++xcount;
                }else
                {
                    ++ocount;}
                System.out.println(Character.toUpperCase(currentPlayer) + " wins!!");
                System.out.println("Player X has won "+ xcount+ " game(s), " + " Player O has won "+ocount+" game(s) and there has been "+ ties+ " tie(s)" ); 

            }                   
            System.out.println("Do you want to play again? yes/no");
            currentPlayer=changePlayer(currentPlayer);
            play = keyboard.nextLine();
            play = keyboard.nextLine();
        }while(play.equalsIgnoreCase("yes"));

    }
}


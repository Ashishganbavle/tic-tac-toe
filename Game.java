import java.util.Scanner ;
class Game{
    public static void main(String [] args){
        char [][] bord = new char[3][3];
        for(int row=0;row < bord.length;row++){
            for(int col=0;col < bord[row].length;col++){
                bord[row][col]= ' ';
            }
        }
    char player ='x';
    boolean gameOver =false;
    Scanner scanner=new Scanner(System.in);
     
    while( !gameOver ){
        printBord(bord);
        System.out.println("player" + player+"enter :");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        System.out.println();

    if(bord[row][col]== ' '){
        bord[row][col]= player;
        gameOver = haveWon(bord, player);
    if (gameOver){
        System.out.println("player" + player+"has won:");
    }
    else{
        if(player == 'x'){
            player = 'o';
        }else{
            player = 'x';
        }
    }
    }else{
        System.out.println("invalid move");
    }
    }
    printBord(bord);
    }
    public static boolean haveWon(char[][] bord, char player){
        // check for row
      for(int row = 0;row<bord.length;row++){
        if(bord[row][0] == player && bord[row][1] == player && bord[row][2] == player){
            return true;
        }
      }
      // check for col
    
    
      for(int col = 0;col<bord[0].length;col++){
        if(bord[0][col] == player && bord[1][col] == player && bord[2][col] == player){
            return true;
    }
      }
      // check for diagnoal
     if (bord[0][0] == player && bord[1][1] == player && bord[2][2] == player){
        return true;
     }
     if (bord[0][2] == player && bord[1][1] == player && bord[2][0] == player){
        return true;
    }
    return false;
}

    public static void printBord(char[][] bord){
       for(int row=0; row < bord.length; row++){
            for(int col=0; col < bord[row].length; col++){
                System.out.println(bord[row][col]+ " | ");
            }
        System.out.println();
        }
    
    
    }
}

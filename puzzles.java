import java.util.Scanner;



public class puzzles {
    cavestuff logik = new cavestuff();
    public void room_1 () {
        String player_name = logik.name;
        
        fight_1(player_name);
        
        
       
        

    }


    public void fight_1(String l) {
        
        boolean onedone = false;
        Scanner answer_one = new Scanner(System.in);
        if (onedone == false){
        int tries = 3;
       
        logik.textHelper("Wow so you're " + l + " ,the guy who fell in, *stares*, gotta say you don't look that tough but it's whatever");
        logik.textHelper("\n\n get the right answer this and you win, whats the name of something that belongs to you but other people use it more?");

        while (tries != 0 && onedone != true) {
            String answer = answer_one.nextLine();

            if (answer.equalsIgnoreCase(l)) {
                logik.textHelper("dang that was impressive, you're pretty good at this, here's the key");
                logik.games_won++;
                onedone = true;
            }
            else if (answer != l) {
                logik.textHelper("oooh, that is not the answer, try again");
                tries--;

                if(tries == 0) {
                    logik.textHelper("you suck at this bro");
                    logik.textHelper("\n\n YOU LOSE");
                }

            }
            
            
           
            
        }
       
        answer_one.close();
    }
    else if ( onedone == true)  {
        logik.textHelper("you've already fought this boss");
        logik.action();
        }
        
    }

    public void room_2() {
        fight_2();
    }

    public void fight_2() {
        boolean twodone = false;
        Scanner answer_two = new Scanner(System.in);
        int tries = 3;
        if (twodone == false){
        logik.textHelper("yeah I'm just as werided out as you are, woke up in this room and now I have to give you a riddle");

        while (tries != 0 && twodone != true) {
            logik.textHelper("find the mode of these numbers, nerd");
        int rows = 4;
        int cols = 4;
        for (int row = 1; row <= rows; row++) {
            for (int col = 0; col < cols; col++) {
                int number = row + (col * cols);
                System.out.print(number + "\t");

            
         }
    System.out.println();
}
            /*while(twodone != true){
            String answer = answer_two.nextLine();
            
            }*/

        }
      }
    }
}

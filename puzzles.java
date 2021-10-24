import java.util.Scanner;

public class puzzles {
    cavestuff logik = new cavestuff();
    public void room_1 () 
    {
        String player_name = logik.name;
        
        fight_1(player_name);
        
        
       
        

    }


    public void fight_1(String l) {
        
        boolean onedone = false;
        if (onedone = false){
        int tries = 3;
        Scanner answer_one = new Scanner(System.in);
        logik.textHelper("Wow so you're the new guy who fell in, *stares*, gotta say you don't look that tough but it's whatever");
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


            }
        }

    }
    else if ( onedone == true)  {
        logik.textHelper("you've already fought this boss");
        logik.action();
    }

    }
  
}

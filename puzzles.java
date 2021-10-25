import java.util.Scanner;

import javax.swing.Action;



public class puzzles {
    cavestuff logik = new cavestuff();
    Room room = new Room();
    int wayfinder = logik.action();
    
    public void decision() {
        if (wayfinder == 1) {
            if (room.room_num == 1) {
                
            }
        }
    }

    public void room_1 () {
        String player_name = logik.name;
        logik.action();
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
          logik.textHelper("find the mean of these numbers, nerd");
          
        int rows = 4;
        int cols = 4;
        for (int row = 1; row <= rows; row++) {
            for (int col = 0; col < cols; col++) {
                int number = row + (col * cols);
                System.out.print(number + "\t");
                
         
           
        }
      
    System.out.println();
   
  
}
String answer = answer_two.nextLine();
     if (answer.equals("8.5")) {
        logik.textHelper("wasn't expecting that, you got me there, heres your key");
        logik.games_won++;
        twodone = true;
     }   

     else if (answer != "8.5") {
        logik.textHelper("not the right answer pal");
        tries--;

        if (tries == 0) {
            logik.textHelper("yeah dude, you are not it");

            logik.textHelper("\n\n YOU LOSE");
        }
     }

        }
      }

    else if (twodone == true) {
        logik.textHelper("you've already fought this boss");
        logik.action();
        }
    }

    public void room_3(){
        fight_3();
        
    }

    public void fight_3() {
        boolean threedone = false;
        Scanner answer_three = new Scanner(System.in);

        if(threedone == false) {
            int tries = 3;
            
            logik.textHelper("hey before I ask you about some riddle can I ask you if you prefer donda or clb?");
            

            while (tries != 0 && threedone != true) {
                logik.textHelper("What type of coat is always wet when you put it on?");
                String answer = answer_three.nextLine();

                if (answer.equals("a coat of paint")) {
                    logik.textHelper("you have good taste my dude");
                    logik.games_won++;
                    threedone = true;
                }
                else if(answer != "a coat of paint") {
                    logik.textHelper("come on my guy, that's not even close");
                    tries--;


                    if(tries == 0) {
                        logik.textHelper("you probably think clb is a good album");
                        logik.textHelper("\n\n YOU LOSE");
                    }
                }
               
               
                }      
          
            }
            else if (threedone == true) {
                logik.textHelper("you've already fought this boss");
                logik.action();
        }
    }

    public void room_4() {
        fight_4();
    }
    public void fight_4() {
        boolean fourdone = false;
        Scanner answer_four = new Scanner(System.in);
        int tries = 3;
        if(fourdone == false){
            logik.textHelper("dropped out of highschool and now I have to give riddles to randos in a cave");

            while (tries != 0 && fourdone !=true) {
                logik.textHelper("I have branches yet I have no leaves, no trunk and no fruit what am I?");
                String answer = answer_four.nextLine();

                if (answer.equals("a bank") || answer.equals("bank")) {
                    logik.textHelper("yup you got it right");
                    logik.games_won++;
                    fourdone = true;
                }
                else if (answer != "a bank" || answer != "bank") {
                    logik.textHelper("yeah dude I don't think that's right");
                    tries--;

                    if(tries == 0) {
                        logik.textHelper("you're not great at this");
                        logik.textHelper("\n\n YOU LOSE");
                    }
                }
            }
        }
        else if (fourdone == true) {
            logik.textHelper("you've already fought this boss");
            logik.action();
        }
    }

}


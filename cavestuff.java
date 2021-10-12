import java.util.Scanner;


public class cavestuff {
 public String name;
 public int games_won;
 public String boss_name;
 public int[] room = {1,2,3,4,5};
 public boolean game_over = false;
 public int playerPos = 1;
  Scanner input = new Scanner(System.in);

  public void action() {
    textHelper("To move nsew press the respective keys");
    textHelper("To look around press l");
    textHelper("To interact with room boss press q");

   String answer = input.nextLine();

   if (answer.equals("n")) {

    }

   if (answer.equals("s")){

    }

   if (answer.equals("w")){

    }
    
   if (answer.equals("e")) {

    }
   if (answer.equals("a")) {

    }
   if (answer.equals("l")) {

    }
    if (answer.equals("q")) {

    
    }
  
   }
  
  public void Intro() {
    textHelper("you wake up in the dark, you can't see anything, you decide to look around");
  }
  //SETS NAME FOR PUBLIC VARIABLE NAME , call this when in room 1
  public void setname() {
    textHelper("please enter in your name ");
    this.name = input.nextLine();
    textHelper("please enter the boss name");
     
    this.boss_name = input.nextLine();
    input.close();

  
  }
  // place in room one when you meet the boss
  public void bossIntro() {

    textHelper("Hello there " + this.name + " You can refer to me as " + this.boss_name + " (couldn't you come up with a better name?), you are now my prisoner in this elaborate cave...... that only has 5 roooms. go forth and  fight your inner demons, dual them in a battle to the end *disappears*");
  }



  
  // helps with text (I don't feel like typing out system every fricking time)
  public void textHelper(String x) {
    System.out.println(x);
  }

}
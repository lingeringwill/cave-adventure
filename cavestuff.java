import java.util.Scanner;


public class cavestuff {
 public String name = "beevus";
 public int games_won;
 public String boss_name = "butthead";
 public boolean game_over = false;
 public int playerPos = 1;

  Scanner input = new Scanner(System.in);

  public void action() {
    textHelper("press m to change rooms");
    textHelper("press l to check what room you're in");
    textHelper("To interact with room boss press q");

   String decision = input.nextLine();
    Room room = new Room();
   if (decision.equals("m")) {
    room.room_changer();
   }
   if (decision.equals("l")) {
     System.out.println("you are in room number " +room.room_num);
   }
  if (decision.equals("q")) {

  }
  
   }
  
  public void Intro() {
    games_won = 0;
    textHelper("you wake up in the dark, you can't see anything, you decide to look around");
  }
  //SETS NAME FOR PUBLIC VARIABLE NAME , call this when in room 1
  public void setname() {
    textHelper("please enter in your name ");
    name = input.nextLine();
    textHelper("please enter the boss name");
     
    boss_name = input.nextLine();
    input.close();

  
  }
  // place in room one when you meet the boss
  public void bossIntro() {

    textHelper("Hello there " + name + " You can refer to me as " + boss_name + " (couldn't you come up with a better name?), you are now my prisoner in this elaborate cave...... that only has 5 roooms. go forth and  fight your inner demons, dual them in a battle to the end *disappears*");
  }



  
  // helps with text (I don't feel like typing out system every fricking time)
  public void textHelper(String x) {
    System.out.println(x);
  }

}
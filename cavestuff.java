import java.util.Scanner;


public class cavestuff {
 public String name;
 public int games_won;
 public String boss_name;
 public
  Scanner input = new Scanner(System.in);
  
  public void Intro() {
    textHelper("you wake up in the dark, you can't see anything, you decide to look around");
  }
  //SETS NAME FOR PUBLIC VARIABLE NAME , call this when in room 0
  public void setname() {
    textHelper("please enter in your name ");
    this.name = input.nextLine();
    textHelper("please enter the boss name");
    input.close();

    textHelper("please insert the preferred boss name");
    this.boss_name = input.nextLine();
    input.close();

  
  }
  // place in room one when you meet the boss
  public void bossIntro() {

    textHelper("Hello there " + this.name + " You can refer to me as" + this.boss_name + " (couldn't you come up with a better name?), you are now my prisoner in this elaborate cave...... that only has 5 roooms. go forth and  fight your inner demons, dual them in a battle to the end *disappears*");
  }



  
  // helps with text (I don't feel like typing out system every fricking time)
  public void textHelper(String x) {
    System.out.println(x);
  }

}
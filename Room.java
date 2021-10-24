import java.util.Scanner;
public class Room   {

  public int room_num;
    Scanner player_input = new Scanner(System.in);
    cavestuff x;
    void room_changer(){
        String answer = player_input.nextLine();
        if(room_num == 1) {
            x.textHelper("to move press n s e or w");
            if (answer.equals("n")) {
                room_num = 5;
            }
            if (answer.equals("e")) {
                room_num = 3;
            }
            if (answer.equals("s")) {
                x.textHelper("ah a wall, wonderfully constructed too");
            
            }
            if (answer.equals("w")) {
                room_num = 2;
            }
        }

        else if (room_num == 2) {
            
            x.textHelper("to move press n s e or w");
            if (answer.equals("n")) {
                room_num = 6;
            }
            if (answer.equals("e")) {
                x.textHelper("You ran straight into a wall even though you knew it was there, you have a feeling your actions are not your own....");
              
            }
            if (answer.equals("s")) {
                x.textHelper("ah a wall, wonderfully constructed too");
               
            }
            if (answer.equals("w")) {
                room_num = 1;
                }
            }

            else if (room_num == 3) {
                x.textHelper("to move press n s e or w");
                if (answer.equals("n")) {
                    room_num = 4;
                }
                if (answer.equals("e")) {
                   room_num = 4;
                }
                if (answer.equals("s")) {
                    x.textHelper("the wall has a cold yet reassuring feeling to it");
                    
                }
                if (answer.equals("w")) {
                    x.textHelper("unfortunitely the power of intangibility was not graced upon you");
                 }
            } 

            else if (room_num == 4) {
                x.textHelper("to move press n s e or w");
                if (answer.equals("n")) {
                    x.textHelper("limits were meant to be broken....unlike this wall");
                    

                }
                if (answer.equals("e")) {
                   room_num = 5;
                }
                if (answer.equals("s")) {
                    room_num = 3;
                }
                if (answer.equals("w")) {
                    x.textHelper("looks like you've a creative block, but literally");
                   
                 }
            }

            else if (room_num == 5) {
                x.textHelper("to move press n s e or w");
                if (answer.equals("n")) {
                    x.textHelper("limits were meant to be broken....unlike this wall");
                    

                }
                if (answer.equals("e")) {
                    x.textHelper("no where for you to go in this direction");
                    
                }
                if (answer.equals("s")) {
                    room_num = 1;
                }
                if (answer.equals("w")) {
                    room_num = 4;
                 }
              }

            else if (room_num == 6) {
                x.textHelper("to move press n s e or w");
                if (answer.equals("n")) {
                    x.textHelper("life is like this wall, cold, unfeeling, pretty hard and most of all pretty annyoing to deal with");
                    room_changer();

                }
                if (answer.equals("e")) {
                    x.textHelper("no where for you to go in this direction");
                   
                }
                if (answer.equals("s")) {
                    room_num = 2;
                }
                if (answer.equals("w")) {
                   x.textHelper("your dissapointment is immeasurable and your day is ruined");
                   
                 }
                }

                 }

            

        
       
       

    }
    


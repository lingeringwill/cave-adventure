import java.util.Scanner;
public class Room   {

    int room_num;
    Scanner player_input = new Scanner(System.in);
    x cavestuff;
    void room_changer(String x){
        String answer = player_input.nextLine();
        if(room_num == 1) {
            x.textHelper("to move press n s e or w");
            if (answer.equals(n)) {
                room_num == 5;
            }
            if (answer.equals(e)) {
                room_num == 3;
            }
            if (answer.equals(s)) {
                x.textHelper("ah a wall, wonderfully constructed too");
                room_changer(x);
            }
            if (answer.equals(w)) {
                room_num == 2;
            }
        }

        else if (room_num == 2) {
            x.textHelper("to move press n s e or w");
            if (answer.equals(n)) {
                room_num == 6;
            }
            if (answer.equals(e)) {
                x.textHelper("You ran straight into a wall even though you knew it was there, you have a feeling your actions are not your own....");
            }
            if (answer.equals(s)) {
                x.textHelper("ah a wall, wonderfully constructed too");
                room_changer(x);
            }
            if (answer.equals(w)) {
                room_num == 1;
                }
            }

            
        }
       
       

    }
    
}
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        boolean active = true;
        Scanner input = new Scanner(System.in);
        GorrillaDreams gorrillafeathers = new GorrillaDreams();
        CountdownSong countdown = new CountdownSong();
        int response = 0;
        while(active==true){
            System.out.println("-------------");
            System.out.println("Pick a program");
            System.out.println("1. Gorrilla Dreams");
            System.out.println("2. Countdown Song");
            System.out.println("-------------");
            response = input.nextInt();
            if(response == 1){
                gorrillafeathers.play();
                //break;
            }
            else if(response == 2){
                countdown.play();
                //break;
            }
            else{
                System.out.println("Pick a number, 1 or 2");
            }
        }
    }
}

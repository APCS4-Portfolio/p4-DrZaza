import java.util.Scanner;

    public class GorrillaDreams 
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);//defined all variables
            boolean dreaming = true;
            String ask = "Have you ever wanted to be a weird gorrilla?";
            String response = " ";
            int feathers = 1;
            while(dreaming == true){
                System.out.println(ask);//asks if the user wants to play
                System.out.println("--Yes-- --No--");
                while(1==1){
                    response = input.next();
                    
                    if(response.length() == 3){
                        System.out.println("Great, you are one.");
                        break;
                    }
                    else if(response.length() == 2){
                        System.out.println("Well too bad you are one.");
                        break;
                    }
                    else{
                        System.out.println("Try Again");
                    }
                }
                
                while(2==2){
                    System.out.println("Press any key to continue");
                    response = input.next();
                    break;
                    }
                
                System.out.println("So now you're going to have some feathers alright?");
                while(3==3){
                    System.out.println("Pick an integer between 1 and 10");
                    feathers = input.nextInt();//takes user integer
                    System.out.println("You now have " + feathers*10 +" feathers");//multiplies integer by 10
                    break;

                }
                System.out.println("Congrats, you're now a feathered gorilla");
                while(4==4){
                    System.out.println("-------------");
                    System.out.println("Would you like to play again?");
                    System.out.println("--Yes-- --No--");
                    response = input.next();//takes response
                    if(response.length() == 3)//checks response length
                    {
                        System.out.println("-------------");
                        ask = "So you chose to be a gorrilla again?";
                        break;
                    }
                    else if(response.length() == 2){
                        System.out.println("Come again!");
                        dreaming = false;//breaks first loop and ends cycle
                        break;
                    }
                    else{
                        System.out.println("Try Again");
                    }
                }
            }
    }
}

import java.util.Scanner;
public class random {
    public static void main(String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
          int userNumber=0;


        do {
             System.out.println("Enter a number you want to guess(1-100):");
             userNumber=sc.nextInt();

             if(userNumber==myNumber){
             System.out.println("wohooo...... your is correct");
             break;
             }
             else if(userNumber>myNumber){
                System.out.println("sorry number is greater ....try again");

             }
             else{
                System.out.println("sorry number so small");
             }

            }
            while(userNumber >= 0);
            
                System.out.println("the number was");
                System.out.println(myNumber);//guessing number will be printed
            

        }
       
        


    }
    

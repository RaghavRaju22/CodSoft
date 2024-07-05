import java.util.*;
class task1
{
    public static void main(String[] args) {
        int i,num,guess,ch=1,round=0;
        Random rand=new Random();
        num=rand.nextInt(100) + 1;
        Scanner sc=new Scanner(System.in);
        while(ch==1)
        {
        System.out.println("WE HAVE SELECTED A NUMBER BETWEEN 1 AND 100\nGUESS THE NUMBER.(TOTAL 5 CHANCES)");
        for(i=0;i<5;i++)
        {
            System.out.println("Guess "+(i+1)+" : ");
            guess=sc.nextInt();
            if(num==guess)
            {
                round++;
                System.out.println("Congratulations, you have guessed the right number.");
                System.out.println("Your Score : "+(5-i));
                System.out.println("Rounds Won : "+round);
                break;
            }
            else if (guess>num) {
                if((guess-num)<=10)
                {
                    System.out.println("Guessed number is HIGH");
                }
                else
                {
                    System.out.println("Guessed number is TOO HIGH");
                }
            }
            else
            {
                if((num-guess)<=10)
                {
                    System.out.println("Guessed number is LOW");
                }
                else
                {
                    System.out.println("Guessed number is TOO LOW");
                }
            }
        }
        if(i==5)
        {
            System.out.println("SORRY, You used all your chances.");
        }
        System.out.println("DO YOU WANT TO PLAY AGAIN (1:YES 0:NO) : ");
        ch=sc.nextInt();
    }
    }
}

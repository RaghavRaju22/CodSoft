import java.util.Scanner;

class account
{
    public int bal;
    account(int initial)
    {
        bal=initial;
    }
    public void dep(int dep)
    {
        bal+=dep;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY.");
    }
    public void wid(int wid)
    {
        if(bal>=wid)
        {
            bal-=wid;
            System.out.println("AMOUNT WIDTHDRAWED SUCCESSFULLY.");
        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE.");
        }
    }
    public void check()
    {
        System.out.println("CURRENT BALANCE : "+bal);
    }    
}
class ATM 
{
    account a=new account(2000);
    void run()
    {
    Scanner sc=new Scanner(System.in);
    int ch=1;
    while(ch!=4)
    {
        System.out.println("\t--------------------");
        System.out.println("\tATM MENU");
        System.out.println("1. CHECK BALANCE");
        System.out.println("2. DEPOSIT");
        System.out.println("3. WITHDRAW");
        System.out.println("4. EXIT");
        System.out.println("\nEnter your choice");
        ch=sc.nextInt();
        switch (ch) {
            case 1: a.check();
                    break;
            case 2: System.out.println("Enter the amount you want to deposit : ");
                    int d=sc.nextInt();
                    a.dep(d);
                    break;
            case 3: System.out.println("Enter the amount you want to withdraw : ");
                    int w=sc.nextInt();
                    a.wid(w);
                    break;
            case 4: System.out.println("------------------------------------"); 
                    System.out.println("THANK YOU FOR USING THE ATM. ");
            default://System.out.println("INVALID INPUT");
                    break;
        }
    }
}
}
public class task3 {
    public static void main(String[] args) {
        ATM acc=new ATM();
        acc.run();
    }
    
}

import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,totalmarks=0;
        float average;
        char grade;
        System.out.println("\tSTUDENT GRADE CALCULATOR");
        System.out.println("Enter the total number of subjects : ");
        n=sc.nextInt();
        int[] marks=new int[n];
        System.out.println("\tENTER MARKS");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the marks obtained in Subject "+(i+1)+" : ");
            marks[i]=sc.nextInt();
            totalmarks+=marks[i];
        }
        average=totalmarks/n;
        if(average>=90)
        {
            grade='O';
        }    
        else if(average<90 && average>=80)
        {
            grade='A';
        }
        else if(average<80 && average>=70)
        {
            grade='B';
        }
        else if(average<70 && average>=60)
        {
            grade='C';
        }
        else
        {
            grade='D';
        }
        System.out.println("\nSTUDENT MARKS DETAILS");
        System.out.println("TOTAL MARKS : "+totalmarks);
        System.out.println("AVERAGE PERCENTAGE : "+average+"%");
        System.out.println("GRADE : "+grade);
    }
}

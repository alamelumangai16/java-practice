import java.util.Scanner;
public class ExpenseTracker{
  public static void main(String[]args){
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter your food expense:Rs ");
    double food=Sc.nextDouble();
    System.out.println("Enter your travel expense:Rs ");
    double travel=Sc.nextDouble();
    System.out.println("other expense:Rs ");
    double other=Sc.nextDouble();
    double totl=food+travel+other;
    System.out.println("Total Expense=Rs "+total);
    Sc.close();
  }
}

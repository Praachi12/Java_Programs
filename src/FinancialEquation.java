import java.util.Scanner;

public class FinancialEquation {
    String name;
    int yearOfBirth;
    int age;

    public static void displayServiceList()
    {
        double assets, netIncome,breakEvenVolume,currentRatio;
        double liability = 33;
        double stockHoldersEquity= 44.5;
        //double

        System.out.println("Services available:");
        System.out.println("Case  1:    Assets");
        System.out.println("Case  2:    Net Income");
        System.out.println("Case  3:    Break-Even Volume");
        System.out.println("Case  4:    Current Ratio");
        System.out.println("Case  5:    Cash Ratio");
        System.out.println("Case  6:    Profit Margin");
        System.out.println("Case  7:    Debt-to-Equity Ratio");
        System.out.println("Case  8:    Gross Margin");
        System.out.println("Case  9:    COGS");
        System.out.println("Case 10:    Retained Earnings ");
        System.out.println("Case 11:    Simple Interest Formula");

        Scanner sc = new Scanner(System.in);
        System.out.println("Select choice of service from the list:");
        int choice= sc.nextInt();
        System.out.println("Your selected choice is:" +choice);
        switch(choice)
        {
            case 1: assets=liability +stockHoldersEquity;
                System.out.println("Your assets are:" + assets);
            case 2:

            }
        }
        //choseyourService(choice);


    //}
   /// public void choseyourService(int choice)
    public void securityAccess(){
        if(age<18) {
            System.out.println("Access is denied");
        }else
            System.out.println("Access is granted");

        }



    public static void main(String[] args){


    }
}

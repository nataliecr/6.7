import java.util.Scanner;

public class InvestmentValue {
    public static void main(String[] args){  
      Scanner input = new Scanner(System.in);
      System.out.print("The amount invested: ");
      double investmentAmount = input.nextDouble();
      System.out.print("Annual interest rate: ");
      double monthlyInterestRate = input.nextDouble();
      monthlyInterestRate /= 12;
      
      System.out.println("Years     Future Value");
      for(int years = 1; years <= 30; years++){
         System.out.printf("%-10d", years);
         System.out.printf("%11.2f", (futureInvestmentValue(investmentAmount, 
                 monthlyInterestRate, years)));
         System.out.println();
      } // for
      
    } // main
    
    public static double futureInvestmentValue(double investmentAmount, 
            double monthlyInterestRate, int years){
        return (long)(investmentAmount * 
              (Math.pow((1+(monthlyInterestRate/100)), (years * 12)))*1e2)
                / 1e2;
    } // futureInvesmentValue
}


package lab1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab1 {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);


System.out.print("Enter annual return: ");
	double AnnualReturn = input.nextDouble();
System.out.print("Enter payback rate of annuity: ");
	double PaybackRate = input.nextDouble();
System.out.print("Enter years to work: ");
	double YrsToWork = input.nextDouble();
System.out.print("Enter years retired: ");
	double YrsRetired = input.nextDouble();
System.out.print("Enter required monthly income: ");
	double RequiredIncome = input.nextDouble();
System.out.print("Enter estimated social security income: ");
	double SSI = input.nextDouble();

double MonthlySavings1 = (RequiredIncome-SSI);
double MonthlySavings2 = Math.pow((1+PaybackRate/12), -YrsRetired*12);
double MonthlySavings3 = Math.pow(1+AnnualReturn/12,YrsToWork*12);
double MonthlySavingsNum = MonthlySavings1*(1-MonthlySavings2)/(PaybackRate/12);
double MonthlySavingsDen = (MonthlySavings3-1)/(AnnualReturn/12);
double MonthlySavings = MonthlySavingsNum/MonthlySavingsDen;

DecimalFormat MonthlySavingsRounded = new DecimalFormat("0.00");
String MonthlySavingsFinal = MonthlySavingsRounded.format(MonthlySavings);

System.out.print("You need to save $" + MonthlySavingsFinal + " every month to have a monthly income of $" + RequiredIncome + " . ");

}}


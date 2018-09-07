import java.util.Scanner;

public class TaxCode{
  public static void main(String[] args) {

    //Setup scanner and variables
    Scanner scan = new Scanner(System.in);
    double salary;
    int age;
    int kids;
    double taxDue = 0;
    int taxReturn = 0;
    int min = 0;

    //Collect user data
    System.out.println("Enter annual salary:");
    salary = scan.nextDouble();
    System.out.println("Enter your age:");
    age = scan.nextInt();
    System.out.println("Enter amount of kids you have:");
    kids = scan.nextInt();

    if (salary < 10000){
      if (kids >= 1){
        taxReturn = taxReturn + 1000;
        kids = kids - 1;
        taxReturn = taxReturn * kids;
        System.out.println("Tax return:" + taxReturn);
      }
    }

    if (salary < 25000 ){
      taxDue = (salary - 10000)/10;
    }

    if (salary < 75000){
      taxDue = taxDue + ((salary-25000)/10)*2;
    }

    if (salary < 250000){
      taxDue = taxDue + ((salary - 75000)/10);
    }



    if (kids > 1){
      taxReturn = taxReturn + 1000;
      kids = kids - 1;
      taxReturn = taxReturn * kids;
      taxDue = taxDue - taxReturn;
    }

    else if (kids == 1){
      taxReturn = taxReturn + 1000;
      kids = kids - 1;
      taxDue = taxDue - taxReturn;
    }

    if (age <= 15){
      taxDue = taxDue/2;
    }
    else if (age >=16 && age <= 21){
      taxDue = taxDue/4;
    }
    else if (age >= 22 && age <= 63){
      taxDue = taxDue;
    }
    else if (age >= 64 && age <= 72){
      taxDue = taxDue - (taxDue/3);
    }
    else if (age >= 73 && age <= 80){
      taxDue = taxDue/3;
    }
    else if (age >= 81){
      taxDue = 0;
    }

    System.out.println("You have to pay" + taxDue + "in taxes.");

  }
}

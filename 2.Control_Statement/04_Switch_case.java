⭐⭐⭐⭐⭐⭐⭐ CODECRAFT BY ASHIKA ⭐⭐⭐⭐⭐⭐⭐

🟢 Language ➡ Java
🟢 Topic ➡ switch-Case statement


🔹 🧠1. WAP which takes the month number as input and displays the number of days in that month.
  
  import java.util.Scanner;
   class DaysInMonth{
     
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of month");
    int month=sc.nextInt();
    
    switch (month) {
        case 1:
            System.out.print("31 days in month 1.\n");
            break;
        case 2:
            System.out.print("February has 28 or 29 days (depending on leap year).\n");
            break;
        case 3:
            System.out.print("31 days in month 3.\n");
            break;
        case 4:
            System.out.print("30 days in month 4.\n");
            break;
        case 5:
            System.out.print("31 days in month 5.\n");
            break;
        case 6:
            System.out.print("30 days in month 6.\n");
            break;
        case 7:
            System.out.print("31 days in month 7.\n");
            break;
        case 8:
            System.out.print("31 days in month 8.\n");
            break;
        case 9:
            System.out.print("30 days in month 9.\n");
            break;
        case 10:
            System.out.print("31 days in month 10.\n");
            break;
        case 11:
            System.out.print("30 days in month 11.\n");
            break;
        case 12:
            System.out.print("31 days in month 12.\n");
            break;
        default:
            System.out.print("Invalid month number.\n");
    }
}
}
🖥️ Sample Output:
Enter month number (1-12): 2
28 or 29 days in February (leap year consideration).


  
  🔹 🧠2. Write a menu driven program for basic arithmetic operations.
  
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;

        while (true) {
            System.out.println("\n--- Basic Arithmetic Operations Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: "  + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: "  + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option (1-5).");
            }
        }
        scanner.close();
    }
}
🖥️ Sample Output:
Menu:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Enter your choice: 1
Enter two numbers: 5 3
Result: 8.00



  🔹 🧠3. WAP which takes the day number of the week and displays a unique greeting message for the day.

  import java.util.Scanner;

public class DayGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day number of the week (1 for Sunday, 2 for Monday, ..., 7 for Saturday): ");
        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Happy Sunday! Relax and enjoy your day!");
                break;
            case 2:
                System.out.println("Happy Monday! Let's start the week on a positive note!");
                break;
            case 3:
                System.out.println("Happy Tuesday! Keep going strong!");
                break;
            case 4:
                System.out.println("Happy Wednesday! Halfway through the week!");
                break;
            case 5:
                System.out.println("Happy Thursday! Almost the weekend!");
                break;
            case 6:
                System.out.println("Happy Friday! The weekend is here!");
                break;
            case 7:
                System.out.println("Happy Saturday! Enjoy your day off!");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}

🖥️ Sample Output:
Enter day number (1-7): 3
Wednesday - Halfway there!


  🔹 🧠4. Menu-driven program to check triangle types.
  import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("\nMenu:");
        System.out.println("1. Check Isosceles Triangle");
        System.out.println("2. Check Right Angled Triangle");
        System.out.println("3. Check Equilateral Triangle");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        // Check for exit
        if (choice == 4) {
            System.out.println("Exiting...");
            scanner.close();
            return;
        }

        System.out.print("Enter lengths of three sides: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        // Validate if sides can form a triangle
        if (!isValidTriangle(a, b, c)) {
            System.out.println("The provided sides do not form a valid triangle.");
            scanner.close();
            return;
        }

        switch (choice) {
            case 1:
                // Check Isosceles
                if (a == b || b == c || a == c)
                    System.out.println("The triangle is isosceles.");
                else
                    System.out.println("The triangle is not isosceles.");
                break;

            case 2:
                // Check Right-Angled
                if (isRightAngled(a, b, c))
                    System.out.println("The triangle is right angled.");
                else
                    System.out.println("The triangle is not right angled.");
                break;

            case 3:
                // Check Equilateral
                if (a == b && b == c)
                    System.out.println("The triangle is equilateral.");
                else
                    System.out.println("The triangle is not equilateral.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static boolean isValidTriangle(float a, float b, float c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    public static boolean isRightAngled(float a, float b, float c) {
        // Sort sides to identify hypotenuse
        float[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        float aSq = sides[0] * sides[0];
        float bSq = sides[1] * sides[1];
        float cSq = sides[2] * sides[2];

        final float EPSILON = 1e-5f;
        return Math.abs(aSq + bSq - cSq) < EPSILON;
    }
}

🖥️ Sample Output:
Menu:
1. Check Isosceles Triangle
2. Check Right Angled Triangle
3. Check Equilateral Triangle
4. Exit
Enter your choice: 1
Enter lengths of three sides: 5 5 8
The triangle is isosceles.







🔹 🧠5. Convert if-else-if construct into switch case.
  import java.util.Scanner;

public class NumberResponse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-3): ");
        int var = scanner.nextInt();

        switch (var) {
            case 1:
                System.out.println("good");
                break;
            case 2:
                System.out.println("better");
                break;
            case 3:
                System.out.println("best");
                break;
            default:
                System.out.println("invalid");
        }

        scanner.close();
    }
}

🖥️ Sample Output:
Enter a number (1-3): 2
better







🔹 🧠6. Program to check whether a year is a leap year using switch statement.
  import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        boolean isLeap = ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) );

        switch (isLeap ? 1 : 0) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            case 0:
                System.out.println(year + " is not a leap year.");
                break;
        }

        scanner.close();
    }
}

🖥️ Sample Output:
Enter year: 2020
2020 is a leap year.





  🔹 🧠7. Program to calculate total electricity bill.
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter electricity units used: ");
        int units = scanner.nextInt();
        float bill;

        switch (units / 100) {
            case 0:
                bill = units * 0.50f;
                break;
            case 1:
                bill = 50 * 0.50f + (units - 50) * 0.75f;
                break;
            case 2:
                bill = 50 * 0.50f + 100 * 0.75f + (units - 150) * 1.20f;
                break;
            default:
                bill = 50 * 0.50f + 100 * 0.75f + 100 * 1.20f + (units - 250) * 1.50f;
                break;
        }

        bill += bill * 0.20f; // add 20% surcharge
        System.out.printf("Total electricity bill: Rs. %.2f\n", bill);

        scanner.close();
    }
}

🖥️ Sample Output:
Enter electricity units used: 270
Total electricity bill: Rs. 168.00







🔹 🧠8. Program to convert positive to negative and vice versa.
  import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int isNegative = (number < 0) ? 1 : 0;

        switch (isNegative) {
            case 1:
                System.out.println("Positive number: " + (-number));
                break;
            case 0:
                System.out.println("Negative number: " + (-number));
                break;
        }

        scanner.close();
    }
}

🖥️ Sample Output:
Enter an integer: -5
Positive number: 5








🔹 🧠9. Program to convert even number to upper nearest odd number.
  import java.util.Scanner;

public class EvenToNearestOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        switch (number % 2) {
            case 0:
                System.out.println("Upper nearest odd number: " + (number + 1));
                break;
            case 1:
                System.out.println("The number is already odd.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        scanner.close();
    }
}
 Sample Output:
Enter a positive number: 8
Upper nearest odd number: 9








🔹 🧠10. C program to find all roots of a quadratic equation using switch case.

🔹 🧠10. C program to find all roots of a quadratic equation using switch case.

#include <stdio.h>
#include <math.h>
int main() {
    float a, b, c, discriminant, root1, root2;
    printf("Enter coefficients a, b, c of the quadratic equation (ax^2 + bx + c = 0): ");
    scanf("%f %f %f", &a, &b, &c);
    discriminant = b*b - 4*a*c;
    switch (discriminant > 0) {
        case 1:
            root1 = (-b + sqrt(discriminant)) / (2 * a);
            root2 = (-b - sqrt(discriminant)) / (2 * a);
            printf("Roots are real and distinct: %.2f, %.2f\n", root1, root2);
            break;
        case 0:
            switch (discriminant == 0) {
                case 1:
                    root1 = -b / (2 * a);
                    printf("Roots are real and equal: %.2f\n", root1);
                    break;
                case 0:
                    printf("Roots are imaginary.\n");
                    break;
            }
            break;
    }
    return 0;
}
🖥️ Sample Output:
Enter coefficients a, b, c of the quadratic equation (ax^2 + bx + c = 0): 1 -3 2
Roots are real and distinct: 2.00, 1.00



  

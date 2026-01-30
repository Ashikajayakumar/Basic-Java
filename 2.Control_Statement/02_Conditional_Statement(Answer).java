⭐⭐⭐⭐⭐⭐⭐ CODECRAFT BY ASHIKA ⭐⭐⭐⭐⭐⭐⭐
🟢 Language ➡ Java
🟢 Topic ➡ Conditional Statements Questions

🔹 🧠 01. Check whether a number is even or odd

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}





🔹 🧠 02. Check whether a number is even or odd without % operator

import java.util.Scanner;
public class EvenOddWithoutMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}






🔹 🧠 03. Check whether a number is divisible by 5

import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not divisible by 5");
    }
}






🔹 🧠 04. Check whether a number is positive or non-positive

import java.util.Scanner;

public class PositiveOrNonPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive Number");
        else
            System.out.println("Non-Positive Number");
    }
}






🔹 🧠 05. Check whether a number is a three-digit number

import java.util.Scanner;

public class ThreeDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999)
            System.out.println("Three-digit Number");
        else
            System.out.println("Not a Three-digit Number");
    }
}





🔹 🧠 06. Print greater between two numbers (print one if same)

import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Greater Number: " + a);
        else if (b > a)
            System.out.println("Greater Number: " + b);
        else
            System.out.println("Both numbers are same: " + a);
    }
}







🔹 🧠 07. Print greatest among three numbers (print one if same)

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Greatest Number: " + a);
        else if (b >= a && b >= c)
            System.out.println("Greatest Number: " + b);
        else
            System.out.println("Greatest Number: " + c);
    }
}






🔹 🧠 08. Check whether a year is a leap year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}







🔹 🧠 09. Calculate profit or loss percentage

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        if (sp > cp)
            System.out.println("Profit: " + ((sp - cp) / cp * 100) + "%");
        else if (cp > sp)
            System.out.println("Loss: " + ((cp - sp) / cp * 100) + "%");
        else
            System.out.println("No Profit No Loss");
    }
}






🔹 🧠 10. Check if alphabet is uppercase or lowercase

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Alphabet");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase Alphabet");
        else
            System.out.println("Not an Alphabet");
    }
}







🔹 🧠 11. Pass or fail (marks in 5 subjects)

import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSubjects = 5;
        int passMark = 33;
        boolean pass = true;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            if (marks < passMark)
                pass = false;
        }

        if (pass)
            System.out.println("Candidate Passed");
        else
            System.out.println("Candidate Failed");
    }
}





🔹 🧠 12. Check vowel or consonant

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Consonant");
        else
            System.out.println("Not an Alphabet");
    }
}





🔹 🧠13. Divisible by 3 and 2

import java.util.Scanner;

public class Div3And2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 2 == 0)
            System.out.println("Divisible by both 2 and 3");
        else
            System.out.println("Not divisible by both 2 and 3");
    }
}






🔹 🧠14. Divisible by 7 or 3

import java.util.Scanner;

public class Div7Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 3 == 0)
            System.out.println("Divisible by 7 or 3");
        else
            System.out.println("Not divisible by 7 or 3");
    }
}





🔹 🧠 15. Check positive, negative or zero

import java.util.Scanner;

public class NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}





🔹 🧠 16. Check character type

import java.util.Scanner;

public class CharTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
            System.out.println("Uppercase Alphabet");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase Alphabet");
        else if (Character.isDigit(ch))
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }
}






🔹 🧠 17. Check triangle validity

import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}






🔹 🧠 18. Days in a month

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 2)
            System.out.println("28 or 29 days");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30 days");
        else if (month >= 1 && month <= 12)
            System.out.println("31 days");
        else
            System.out.println("Invalid Month");
    }
}






🔹 🧠 19. Nature of roots of quadratic equation

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = b * b - 4 * a * c;

        if (d > 0)
            System.out.println("Real and Distinct Roots");
        else if (d == 0)
            System.out.println("Real and Equal Roots");
        else
            System.out.println("Imaginary Roots");
    }
}




🔹 🧠 20. Compare two dates

import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (dd mm yyyy): ");
        int d1 = sc.nextInt(), m1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter second date (dd mm yyyy): ");
        int d2 = sc.nextInt(), m2 = sc.nextInt(), y2 = sc.nextInt();

        if (y1 > y2 || (y1 == y2 && m1 > m2) || (y1 == y2 && m1 == m2 && d1 > d2))
            System.out.println("First date is later");
        else if (y1 == y2 && m1 == m2 && d1 == d2)
            System.out.println("Dates are same");
        else
            System.out.println("Second date is later");
    }
}





🔹 🧠 21. Divisible by 2 & 3 but not by 5

import java.util.Scanner;

public class Div2And3Not5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0 && num % 5 != 0)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}






🔹 🧠 22. Check vowel using logical OR

import java.util.Scanner;

public class VowelLogicalOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Not a Vowel");
    }
}







🔹 🧠 23. Number lies between 10 and 100

import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 10 && num <= 100)
            System.out.println("In Range [10, 100]");
        else
            System.out.println("Out of Range");
    }
}








🔹 🧠 24. Check not a leap year using logical NOT

import java.util.Scanner;

public class NotLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (!((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
            System.out.println("Not a Leap Year");
        else
            System.out.println("Leap Year");
    }
}

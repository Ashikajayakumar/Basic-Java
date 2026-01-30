⭐⭐⭐⭐⭐⭐⭐ CODECRAFT BY ASHIKA ⭐⭐⭐⭐⭐⭐⭐
🟢 Language ➡ Java
🟢 Topic ➡ Jumping Statements Questions (break and continue)



  
🔹 1. Print natural numbers 1 to 20, skipping those divisible by 3

public class SkipDivisibleBy3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0) {
                continue;  // Skip numbers divisible by 3
            }
            System.out.print(i + " ");
        }
    }
}




🔹 2. Print first 10 Fibonacci numbers > 0 and < 100

public class FibonacciBreak100 {
    public static void main(String[] args) {
        int a = 0, b = 1, count = 0;
        while(true) {
            int c = a + b;
            if(c >= 100) break;
            System.out.print(c + " ");
            a = b;
            b = c;
            count++;
            if(count == 10) break;
        }
    }
}







🔹 3. Find first 5 prime numbers less than 100

public class First5Primes {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
                count++;
            }
            if(count == 5) break;
        }
    }
}






🔹 4. Print multiplication table of a number, skip multiples of 8

import java.util.Scanner;
public class TableSkipMultiplesOf8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            int product = num * i;
            if(product % 8 == 0) continue;
            System.out.println(num + " x " + i + " = " + product);
        }
        sc.close();
    }
}






🔹 5. Sum natural numbers from 1 to 100, break if sum exceeds 200

public class SumBreakOn200 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            sum += i;
            if(sum > 200) break;
        }
        System.out.println("Sum before exceeding 200 = " + sum);
    }
}







🔹 6. Print first 20 odd numbers, break if number > 40

public class OddBreakAfter40 {
    public static void main(String[] args) {
        int count = 0, i = 1;
        while(count < 20) {
            if(i > 40) break;
            if(i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
}




🔹 7. Print numbers 1 to 30, skip numbers ending in 5

public class SkipEndingWith5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++) {
            if(i % 10 == 5) continue;
            System.out.print(i + " ");
        }
    }
}





🔹 8. Print 1 to 50, break if number is perfect square

public class BreakOnPerfectSquare {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++) {
            int sqrt = (int)Math.sqrt(i);
            if(sqrt * sqrt == i) break;
            System.out.print(i + " ");
        }
    }
}





🔹 9. Find first 5 even numbers, stop if any number > 50

public class EvenBreakOver50 {
    public static void main(String[] args) {
        int num = 2, count = 0;
        while(count < 5) {
            if(num > 50) break;
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}






🔹 10. Print primes from 1 to 50, skip even numbers (except 2)

public class PrimesSkipEven {
    public static void main(String[] args) {
        for(int i = 2; i <= 50; i++) {
            if(i % 2 == 0 && i != 2) continue;
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.print(i + " ");
        }
    }
}

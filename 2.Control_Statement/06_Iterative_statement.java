⭐⭐⭐⭐⭐⭐⭐ CODECRAFT BY ASHIKA ⭐⭐⭐⭐⭐⭐⭐

🟢 Language ➡ Java
🟢 Topic ➡ Iterative Control Instructions



🔹 1. Print "C-Programming" 10 times

public class PrintCProgramming {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("C-Programming");
        }
    }
}


🔹 2. Print first 10 natural numbers

public class First10Naturals {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}




🔹 3. Print first 10 natural numbers in reverse

public class Reverse10Naturals {
    public static void main(String[] args) {
        for(int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}



🔹 4. Print first 10 odd natural numbers
public class First10Odd {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.print((2*i - 1) + " ");
        }
    }
}



🔹 5. Print first 10 odd natural numbers in reverse
public class Reverse10Odd {
    public static void main(String[] args) {
        for(int i = 10; i >= 1; i--) {
            System.out.print((2*i - 1) + " ");
        }
    }
}



🔹 6. Print first 10 even natural numbers
public class First10Even {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.print((2*i) + " ");
        }
    }
}



🔹 7. Print first 10 even natural numbers in reverse

public class Reverse10Even {
    public static void main(String[] args) {
        for(int i = 10; i >= 1; i--) {
            System.out.print((2*i) + " ");
        }
    }
}




🔹 8. Print squares of first 10 natural numbers

public class SquaresOf10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "^2 = " + (i*i));
        }
    }
}





🔹 9. Print cubes of first 10 natural numbers

public class CubesOf10 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "^3 = " + (i*i*i));
        }
    }
}




🔹 10. Print multiplication table of 8

public class TableOf8 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + " = " + (8*i));
        }
    }
}











🟢 Language ➡ Java
🟢 Topic ➡ Iterative Control ➡ while & do-while versions



🔹 1. Print "C-Programming" 10 times
✅ Using while

public class WhilePrintCProgramming {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println("C-Programming");
            i++;
        }
    }
}
✅ Using do-while

public class DoWhilePrintCProgramming {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("C-Programming");
            i++;
        } while(i <= 10);
    }
}





🔹 2. Print first 10 natural numbers
✅ Using while

public class WhileFirst10Naturals {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}
✅ Using do-while

public class DoWhileFirst10Naturals {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while(i <= 10);
    }
}





🔹 3. Print first 10 natural numbers in reverse
✅ Using while

public class WhileReverseNaturals {
    public static void main(String[] args) {
        int i = 10;
        while(i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}
✅ Using do-while

public class DoWhileReverseNaturals {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.print(i + " ");
            i--;
        } while(i >= 1);
    }
}




🔹 4. Print first 10 odd natural numbers
✅ Using while

public class WhileFirst10Odd {
    public static void main(String[] args) {
        int i = 1, count = 0;
        while(count < 10) {
            System.out.print(i + " ");
            i += 2;
            count++;
        }
    }
}
✅ Using do-while

public class DoWhileFirst10Odd {
    public static void main(String[] args) {
        int i = 1, count = 0;
        do {
            System.out.print(i + " ");
            i += 2;
            count++;
        } while(count < 10);
    }
}




🔹 5. Print first 10 even natural numbers
✅ Using while

public class WhileFirst10Even {
    public static void main(String[] args) {
        int i = 2, count = 0;
        while(count < 10) {
            System.out.print(i + " ");
            i += 2;
            count++;
        }
    }
}
✅ Using do-while

public class DoWhileFirst10Even {
    public static void main(String[] args) {
        int i = 2, count = 0;
        do {
            System.out.print(i + " ");
            i += 2;
            count++;
        } while(count < 10);
    }
}

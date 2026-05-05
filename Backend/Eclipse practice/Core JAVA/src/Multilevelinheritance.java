import java.util.Scanner;

class A {
    int a;
    
    void getA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        a = sc.nextInt();
    }
    
    void putA() {
        System.out.println("A = " + a);
    }
}

class B extends A {
    int b;
    
    void getB() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter B: ");
        b = sc.nextInt();
    }
    
    void putB() {
        System.out.println("B = " + b);
    }
}

class C extends B {
    int c;
    
    void getC() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C: ");
        c = sc.nextInt();
    }
    
    void putC() {
        System.out.println("C = " + c);
    }
}

public class Multilevelinheritance {
    public static void main(String[] args) {
        C obj = new C();
        
        obj.getA();
        obj.getB();
        obj.getC();
        
        System.out.println("\n--- Output ---");
        obj.putA();
        obj.putB();
        obj.putC();
    }
}
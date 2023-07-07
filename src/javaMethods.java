public class javaMethods {
    public static void myMethod() {
        System.out.println("methods");
    }

    // Create a checkAge() method with an integer parameter called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    static void parametre(String fname, int yas) {  // method parametre
        System.out.println(fname + " " + yas + " yaşında ");
    }

    static int toplam(int u) {
        return 5 + u;
    }

    static int two(int a, int b) {
        return a + b;
    }

    static int toplam(int c, int d) { // method overloading
        return (c + d);
    }

    /* public static int sum(int e) {   # method Recursion
         if (e > 0) {
             return e + sum(e - 1);
         } else {
             return 0;
         }
     } */
    public static int sum(int start, int end) {  //method Recursion   # Halting Condition
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static void main(String[] args) {
        myMethod();
        checkAge(20); //checkAge(20); // Call the checkAge method and pass along an age of 20
        parametre("umutcan", 24);
        System.out.println(toplam(18));

        int c = two(9, 8);
        System.out.println(c);

        int sayi = toplam(4, 4);
        System.out.println("int:" + sayi);

        int sonuc = sum(5, 15);         // int result = sum(50);
        System.out.println(sonuc);       //   System.out.println(result);
    }
}

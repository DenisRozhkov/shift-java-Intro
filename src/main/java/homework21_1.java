package main.java;

public class homework21_1 {
    void main() {
        System.out.println("P\t\tQ\t\tP AND Q\tP OR Q\tP XOR Q\tNOT P");
        boolean p = false;
        boolean q = false;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = true;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
    }
}

package methoden;

import java.util.Scanner;

public class Exercises {

    /**
     * Schritt 1: Debugge Dein Programm: gehe jede Zeile Deines Programms Schritt für Schritt durch.
     *
     * Schritt 2: Erweitere die 'add'-Methode, um auch Gleitkommazahlen (double) zu unterstützen.
     * (Recherchiere dazu, wie eine Java-Methode verschiedene Parameter-/Rückgabetypen unterstützen kann)
     *
     * Schritt 3: Schreibe eine weitere Methode namens 'subtract', die zwei int-Parameter entgegennimmt
     * und die Differenz der beiden Zahlen zurückgibt.
     *
     * Schritt 4: Schreibe eine weitere Methode namens 'makePositive', die positive Zahlen einfach
     * zurückgibt und negative Zahlen zu positiven Zahlen umwandelt. (bei Argument '5' wird '5' zurückgegeben,
     * aber bei Argument '-28' wird '28' zurückgegeben)
     */

    public static void main(String[] args) {
        int a = 2, b = 3;
        double c = 2.5, d = 3.5;

        // 1.
        System.out.println(add(a, b));
        System.out.println(add(c, d));

        // 2.
        System.out.println(subtract(a, b));

        // 3.
        System.out.println(makePositive(-28));
    }

    private static int makePositive(int i) {
        if(i < 0) {
            return i * -1;
        } else {
            return i;
        }
    }

    // methods
    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }
    private static double add(double a, double b) {
        return a + b;
    }
}

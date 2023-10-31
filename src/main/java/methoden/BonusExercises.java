package methoden;

public class BonusExercises {
    /**
     * Erstelle eine bedingte Anweisung, um die Methode 'subtract' aufzurufen,
     * wenn die erste Zahl größer ist als die zweite, andernfalls rufe die Methode 'add' auf.
     *
     * Schreibe eine Methode, die prüft, ob eine Zahl gerade ist.
     * Gerade Zahlen sollen einfach zurückgegeben werden, ungerade Zahlen sollen verdoppelt werden.
     *
     * Schreibe eine Methode, die eine Zeichenkette als Parameter entgegennimmt und prüft,
     * ob sie ein Palindrom ist (also von vorne und hinten gelesen gleich ist).
     * Gib true zurück, wenn es ein Palindrom ist, sonst gib false zurück.

     *Hallo Sergej
     */

    public static void main(String[] args) {
        // 1.
        int a = 4, b = 3;

        System.out.println((a > b) ? substract(a, b) : add(a, b));

        // 2.
        if (isEven(a)) {
            System.out.println(4);
        } else {
            System.out.println(4 * 2);
        }

        // 3.
        String checkIt = "anna";
        String checkIt2 = "alpha";
        String checkIt3 = "Was it a car or a cat I saw?";
        System.out.println(checkIt3);
        System.out.println(isPalindrome(clearString(checkIt3)));
        System.out.println(isPalindrome2(checkIt));
        System.out.println(isPalindrome(checkIt2));

    }

    private static String clearString(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-z]", "");
        return str;
    }


    private static boolean isPalindrome(String checkIt) {

        int left = 0;
        int right = checkIt.length() - 1;

        while (left < right) {
            if (checkIt.charAt(left) != checkIt.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    private static boolean isPalindrome2(String checkIt) {
        String reverse = "";
        for (int i = checkIt.length() - 1; i >= 0; i--) {
            reverse += checkIt.charAt(i);
        }
        if (checkIt.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }
    private static boolean isEven(int i) {
        if (i % 2 == 0) return true;
        return false;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int substract(int a, int b) {
        return a - b;
    }
}



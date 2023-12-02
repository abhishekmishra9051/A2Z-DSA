/*
Each method countDigit, countDigitRecursive, and countDigitLoop performs the same task but uses a different 
approach to count the digits in a number.
*/
class Digits {
    // Method 1: Using logarithm
    public static int countDigit(long n) {
        return (int) (Math.floor(Math.log10(n)) + 1);
    }

    // Method 2: Using recursion
    public static int countDigitRecursive(long n) {
        if (n == 0) return 0;
        return 1 + countDigitRecursive(n / 10);
    }

    // Method 3: Using a loop
    public static int countDigitLoop(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 123456;
        System.out.println("Using logarithm: " + countDigit(number));
        System.out.println("Using recursion: " + countDigitRecursive(number));
        System.out.println("Using loop: " + countDigitLoop(number));
    }
}

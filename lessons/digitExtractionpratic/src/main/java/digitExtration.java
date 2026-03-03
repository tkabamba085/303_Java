// ⭐ SBA CRITICAL: The While + Modulus Pattern
// This is directly tested on the SBA.

public class digitExtration {
    public static void main(String[] args) {

        // ============================================
        // PATTERN: Extract digits one at a time
        // num % 10  → gets the LAST digit
        // num / 10  → removes the LAST digit
        // ============================================
        // 2+3+4+5+6 = 20
        int num = 23456;
        int sum = 0;


        System.out.println("Extracting digits from " + num + ":");

        //divide 23456 by 10 = 2345 - remainder of 6
        while (num > 0) {
            int digit = num % 10;    // get last digit
            sum += digit;             // add to sum 6+5+4+3+2
            System.out.println("  digit: " + digit + ", running sum: " + sum);
            num /= 10;               // remove last digit
            // num = num/10
        }

        System.out.println("Sum of digits: " + sum); // 20


        // ============================================
        // TRACE THROUGH:
        // num = 23456  → digit = 6, sum = 6,  num becomes 2345
        // num = 2345  → digit = 5 , sum = 11,  num becomes 234
        // num = 23   → digit = 4, sum = 14 , num becomes 23
        // num = 2   → digit = 3, sum = 19 , num becomes 2
        // num = 0  → digit = 2, sum = 20 , num becomes 1 → STOP
        // ============================================


        // NOTE: In JS you'd need Math.floor(num / 10) because
        // JS division always returns a decimal.
        // In Java, int / int = int (truncates automatically!)
    }
}

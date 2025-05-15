import org.counter.demo.Counter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println();
        int result = c.countOddElementInCollection(List.of(3,4,12.5,8,9.2,5.5,2.5,1.5));
        System.out.println("WHEN FINDING THE COUNT OF ODD ELEMENT" +
                " IN THE COLLECTION , IT WAS FOUND OUT THAT THE COUNT IS: "+result);

        System.out.println();

        int pResult = c.countPrimeNumbersElementInCollection(List.of(2,3,4,5,6,7,8,9));
        System.out.println("THE TOTAL COUNT OF PRIME NUMBER" +
                " IN THE COLLECTION IS : "+pResult);

        System.out.println();
        int palindromeResult = c.countPalindromeElementInCollection(List.of("madam", "spoon", "chestnut", "racecar"));
        System.out.println("BASED ON PALINDROME CHECK, THE TOTAL" +
                " COUNT OF PALINDROME IN THE COLLECTION IS :"+palindromeResult);
    }
}
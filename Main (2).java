public class Main {
    public static void main(String[] args) {
        Take tak = new Take();

  
        System.out.println("Is prime? " + Take.isPrime(29));
        System.out.println("GCD: " + Take.gcd(23, 99));
        System.out.println("LCM : " + Take.lcm(18, 30));
        System.out.println("Fibonacci number: " + Take.fibonacci(9));
        System.out.println("Factorial: " + Take.factorial(9));

        System.out.println("/n");
        System.out.println("Is perfect number? " + tak.isPerfectNumber(6));
        System.out.println("digits: " + tak.sumOfDigits(3414));
        System.out.println("Reverse: " + tak.reverseNumber(132456789));
        System.out.println("Armstrong number? " + tak.isArmstrongNumber(370));
        System.out.println("Next prime: " + tak.nextPrime(29));
    }
}

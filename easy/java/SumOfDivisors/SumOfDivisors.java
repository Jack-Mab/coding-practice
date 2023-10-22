public class SumOfDivisors {
    public static int sumOfDivisors(int n) {
        int sum = n; // The Number divides itself

        for (int i = 1; i <= n / 2; i++) {
            sum += (n % i == 0) ? i : 0;
        }
        return sum;
    }

    public static int processN(int n) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= n; i++) {
            sumOfDivisors += sumOfDivisors(i);
        }

        return sumOfDivisors;
    }

    public static void main(String[] args) {
        System.out.println(processN(4));
    }
}

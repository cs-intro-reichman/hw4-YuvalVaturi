public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char[] nums = new char[n + 1];
        int p = 2;
        int counter = (n - 1);
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == 1) {
                nums[i] = 'F';
            } else
                nums[i] = 'T';
        }
        while (p <= Math.sqrt(n)) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 'T' && i % p == 0 && i / p != 1) {
                    nums[i] = 'F';
                    counter--;
                }
            }
            p++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 'T') {
                System.out.println(i);
            }
        }

        System.out.println(
                    "There are " + counter + " primes between 2 and " + n + "(" + (int) (((double) counter / (double) n)*100) + "% are primes)");
            

            // System.out.println("Prime numbers up to " + n + ":");
            // int[] primes = new int[counter];
            // int j = 0;

            // for (int i = 0; i < nums.length; i++) {
            // if (nums[i] == 'T') {
            // primes[j] = i;
            // j++;
            // System.out.println(primes[j]);
            // }
            // }
            // java Primes.java 30
        

    }
}

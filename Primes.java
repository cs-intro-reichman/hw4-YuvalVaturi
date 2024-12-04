public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] nums = new boolean[n + 1];
        int p = 2;
        int counter = (n - 1);
        System.out.println("Prime numbers up to " + n + ":");
        
        for (int i = 2; i < nums.length; i++) {
                nums[i] = true;
        }


        while (p <= Math.sqrt(n)) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == true && i % p == 0 && i / p != 1) {
                    nums[i] = false;
                    counter--;
                }
            }
            p++;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == true) {
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

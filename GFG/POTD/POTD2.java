package GFG.POTD;

// https://practice.geeksforgeeks.org/problems/primes-sum5827/1

class POTD2 {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=(int)Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    static String isSumOfTwo(int N){
        if(N <= 3) {
            return "No";
        }
        for(int i=2;i<=N/2;i++) {
            if(isPrime(i) && isPrime(N-i)) {
                return "Yes";
            }
        }
        return "No";
    }
}
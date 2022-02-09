class printPrimeNumbersSOEAlgo {
    public static void main(String[] args) {
        int N = 100;
        int primearr[] = new int[N + 1];
        for (int num = 2; num <= N; num++) {
            primearr[num] = 1;
        } // fill all array considering all numbers as prime
        for (int val = 2; val * val <= N; val++) { // val*val because we are not checking for all numbers in the array
            if (primearr[val] == 1) { // optimization
                for (int num = val * val; num <= N; num = num + val) {
                    primearr[num] = 0;
                }
            }
        }

        for (int num = 2; num <= N; num++) {
            if (primearr[num] == 1) {
                System.out.print(num + " ");
            }

        }
    }
}
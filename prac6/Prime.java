class Prime {
	int arr[] = {5,9,11,13,85,100,89};
	
	// main methid for calling diff methods 
	public static void main(String[] args) {
		Prime obj = new Prime();
		int arr[] = new int[10_00_000];
		
		long startTime1 = System.nanoTime();
		obj.isPrimeOrNot();
		long endTime1 = System.nanoTime();
		
		long startTime2 = System.nanoTime();
		obj.countPrimeOrNonPrime();
		long endTime2 = System.nanoTime();
		
		// final time calculation
		long finalTime1 = endTime1 - startTime1;
		long finalTime2 = endTime2 - startTime2;
		
		// printing the final time using nanoTime
		System.out.println("\n" + "Approaches" + "\t" + "Time" + "\n");
		System.out.println("Final Time 1" + "\t" + finalTime1);
		System.out.println("Final Time 2" + "\t" + finalTime2);
		
		
		int i, j;
		i = j = 0;
		while(i < 5) {
			long startTime3 = System.nanoTime();
			int p1 = obj.primeCount(arr, arr.length);
			int p2 = 10_00_000 - p1;
			long endTime3 = System.nanoTime();
			long finalTime3 = endTime3 - startTime3;
			System.out.println("Final Time 3" + "\t" + finalTime3);	
			i++;
		}
		
		// reverse the condition
		while(j < 5) {
			long startTime4 = System.nanoTime();
			int z1 = obj.nonPrimeCount(arr, arr.length);
			int z2 = 10_00_000 - z1;
			long endTime4 = System.nanoTime();
			long finalTime4 = endTime4 - startTime4;
			System.out.println("Final Time 4" + "\t" + finalTime4);	
			j++;
		}	
	}
	
	// check prime or non-prime
	public void isPrimeOrNot() {
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 1; j <= arr[i]; j++) {
				if(arr[i] % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(arr[i] + " is a prime number");
			}
			else {
				System.out.println(arr[i] + " is not a prime number");
			}
		}
	}
	
	// count of prime or non-prime
	public void countPrimeOrNonPrime() {
		int validCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 1; j <= arr[i]; j++) {
				if(arr[i] % j == 0) {
					count++;
				}	
			}
			if(count == 2) {
				validCount++;
			}
		}
		System.out.println("\n" + "Count of Prime no's is " + validCount);
		System.out.println("Count of Non-Prime no's is " + (arr.length - validCount) + "\n");
	}
	
	/*// generated sequenced array 
	public int getRandomArray() {
		int arr[] = new int[10_00_000];
		
		int random = 1234567;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = random + i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		return 0;
	}*/
	
	// generate random array
	public void generator(int[] arr, int length) {
		long num = System.nanoTime(); 
		
		for (int i = 0; i < length; i++) {
		num += 1234567; 
			
		if (num % 9999999 < 1000000) {
			num += System.nanoTime();
		}
			arr[i] = (int) Math.abs(num % 9999999); 
		}
	}
	
	// count prime
	public int primeCount(int arr[], int length) {
        int count =0;

        for(int i = 0; i < length; i++) {
        	if(checkPrime(arr[i])) {
                	count++;
            	}
        }
        return count;
	}
	
	// check prime
	public boolean checkPrime(int num) {
	for(int i = 2; i*i < num; i++) {
		if(num % i == 0) {
			return false;
		}
	}
	return true;
	}
	
	
	// reverse the condition
	// count non-prime
	public int nonPrimeCount(int arr[], int length) {
	int noncount = 0;
				
	for (int i = 0; i < length; i++) {
		if (checkNonPrime(arr[i])) {
			noncount++;
		}
	}
	return noncount;
	}
	
	// check non-prime
	public boolean checkNonPrime(int num) {
	for (int i = 2; i*i < num; i++) {
		if (num % i == 0) {
			return true; 
		}
	}
	return false; 
	}
	
}

import java.util.Random;

class SY2022bit061 {
	String reg_no[] = {"2022bit061", "2022bcs100", "2022bch023", "2022bme056", "2022bit149"};
	
	public static void main(String[] args) {
	
		//long startTime = System.nanoTime();
		
		SY2022bit061 obj = new SY2022bit061();
		
		int validCount = obj.isValidRegistrationsCount();
		System.out.println(validCount);
		
		// get approach 1 
		long startTime1 = System.nanoTime();
		long validCountLE50_approach1 = obj.isValidRegistrationsCountLE50_approach1();
		System.out.println(validCountLE50_approach1);
		long endTime1 = System.nanoTime();
		
		
		// to get approach 2
		long startTime2 = System.nanoTime();
		long validCountLE50_approach2 = obj.isValidRegistrationsCountLE50_approach2();
		System.out.println(validCountLE50_approach2);
		long endTime2 = System.nanoTime();
		
		
		// to get approach 3
		long startTime3 = System.nanoTime();
		long validCountLE50_approach3 = obj.isValidRegistrationsCountLE50_approach3();
		System.out.println(validCountLE50_approach3);	
		long endTime3 = System.nanoTime();
		
		
		// to get approach 4
		long startTime4 = System.nanoTime();
		long validCountLE50_approach4 = obj.isValidRegistrationsCountLE50_approach4();
		System.out.println(validCountLE50_approach4);	
		long endTime4 = System.nanoTime();
		
		
		// to get approach 5
		long startTime5 = System.nanoTime();
		long validCountLE50_approach5 = obj.isValidRegistrationsCountLE50_approach5();
		System.out.println(validCountLE50_approach5);
		long endTime5 =  System.nanoTime();
		
		
		// to print 50_000 different random reg no's
		
       		int n = 5_00_000;
        	Random random = new Random();	// used random class 
        	for(int i = 0; i < n; i++) {
            	int number = random.nextInt(5_00_000);
           	System.out.println("Random String: " + "2022bit" + number);
          	}
          	
          	// nanoTime
          	
          	long finalTime1 = endTime1 - startTime1;
          	long finalTime2 = endTime2 - startTime2;
          	long finalTime3 = endTime3 - startTime3;
          	long finalTime4 = endTime4 - startTime4;
          	long finalTime5 = endTime5 - startTime5;
          	
          	// final time 
          	System.out.println("\t" + finalTime1);
          	System.out.println("\t" + finalTime2);
          	System.out.println("\t" + finalTime3);
          	System.out.println("\t" + finalTime4);
          	System.out.println("\t" + finalTime5);
	}
	
	
	// to check whether cse, it, mech, chem reg nos are valid
	public int isValidRegistrationsCount() {
		int  validCount = 0;
		for(int i = 0; i < reg_no.length; i++) {
			if(reg_no[i].contains("bit") || reg_no[i].contains("bcs") || reg_no[i].contains("bch") || reg_no[i].contains("bme")) {
				validCount++;
			}
		}
		return validCount;
	}
	
	
	// Approach 1 - to check reg no which is less than 50
	
	public long isValidRegistrationsCountLE50_approach1() {
		long  validCount = 0;
		for(long i = 0; i < reg_no.length; i++) {
			String regNo = reg_no[(int)i];
			if(regNo.startsWith("2022") && (regNo.substring(4, 7).equals("bit") || regNo.substring(4, 7).equals("bcs") || regNo.substring(4, 7).equals("bch") ||
			regNo.substring(4, 7).equals("bme")) && regNo.charAt(7) == '0' && regNo.charAt(8) < '5') {
				validCount++;
			}
		}
		return validCount;
	}
	
	
	// approach 2 - to check reg no which is less than 50
	public long isValidRegistrationsCountLE50_approach2() {
		long validCount = 0;
		for(long i = 0; i < reg_no.length; i++) {
			String regNo = reg_no[(int)i];
			if((regNo.startsWith("2022bit") || regNo.startsWith("2022bcs") || regNo.startsWith("2022bch") || regNo.startsWith("2022bme")) && regNo.charAt(7) == '0'
			 && regNo.charAt(8) < '5') {
				validCount++;
			}
		}
		return validCount;
	}
	
	
	// approach 3 - to check reg no which is less than 50
	public long isValidRegistrationsCountLE50_approach3() {
		long validCount = 0;
		for(long i = 0; i < reg_no.length; i++) {
			String regNo = reg_no[(int)i];
			if((regNo.contains("2022bit") || regNo.contains("2022bcs") || regNo.contains("2022bch") || regNo.contains("2022bme")) && regNo.charAt(7) == '0'
			 && regNo.charAt(8) < '5') {
				validCount++;
			}
		}
		return validCount;
	}
	
	
        // approach 4 - to check reg no which is less than 50
	public long isValidRegistrationsCountLE50_approach4() {
		long validCount = 0;
		for(long i = 0; i < reg_no.length; i++) {
			String regNo = reg_no[(int)i];
			if(regNo.charAt(7) == '0'&& regNo.charAt(8) < '5') {
				validCount++;
			}
		}
		return validCount;
	}
	
	
        // approach 5 - to check reg no which is less than 50    
	public long isValidRegistrationsCountLE50_approach5() {
		long validCount = 0;
		for(long i = 0; i < reg_no.length; i++) {
			String regNo = reg_no[(int)i];
			if((regNo.contains("2022bit0") || regNo.contains("2022bcs0") || regNo.contains("2022bch0") || regNo.contains("2022bme0")) && regNo.charAt(8) < '5') {
				validCount++;
			}
		}
		return validCount;
	}
}

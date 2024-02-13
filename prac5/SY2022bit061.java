class SY2022bit061 {
	String reg_no[] = {"2022bit061", "2022bcs100", "2022bch023", "2022bme056", "2022bit149"};
	
	public static void main(String[] args) {
		SY2022bit061 obj = new SY2022bit061();
		
		int validCount = obj.isValidRegistrationsCount();
		System.out.println(validCount);
		
		long validCountLE50_approach1 = obj.isValidRegistrationsCountLE50_approach1();
		System.out.println(validCountLE50_approach1);
		
		long validCountLE50_approach2 = obj.isValidRegistrationsCountLE50_approach2();
		System.out.println(validCountLE50_approach2);	
		
		long validCountLE50_approach3 = obj.isValidRegistrationsCountLE50_approach3();
		System.out.println(validCountLE50_approach3);	
				

		long validCountLE50_approach4 = obj.isValidRegistrationsCountLE50_approach4();
		System.out.println(validCountLE50_approach4);	
		
		long validCountLE50_approach5 = obj.isValidRegistrationsCountLE50_approach5();
		System.out.println(validCountLE50_approach5);
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

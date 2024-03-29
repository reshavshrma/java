class SY2022bit061 {
	String reg_no[] = {"2022bit061", "2022bcs100", "2022bch023", "2022bme056", "2022bit149"};

    	public static void main(String[] args) {

        	SY2022bit061 obj = new SY2022bit061();

        	long timearray1[] = new long[10];
        	long timearray2[] = new long[10];
        	long timearray3[] = new long[10];
        	long timearray4[] = new long[10];
        	long timearray5[] = new long[10];

        	gettime1(timearray1, obj.reg_no);
        	double avg1 = avgtime(timearray1);
        	System.out.println("Avg1: " + avg1);

        	gettime2(timearray2, obj.reg_no);
       		double avg2 = avgtime(timearray2);
        	System.out.println("Avg2: " + avg2);

        	gettime3(timearray3, obj.reg_no);
        	double avg3 = avgtime(timearray3);
        	System.out.println("Avg3: " + avg3);

        	gettime4(timearray4, obj.reg_no);
        	double avg4 = avgtime(timearray4);
        	System.out.println("Avg4: " + avg4);

        	gettime5(timearray5, obj.reg_no);
        	double avg5 = avgtime(timearray5);
        	System.out.println("Avg5: " + avg5);
    }


	// to check whether cse, it, mech, chem reg nos are valid
	public int isValidRegistrationsCount() {
        	int validCount = 0;
        	for (int i = 0; i < reg_no.length; i++) {
            		if (reg_no[i].contains("bit") || reg_no[i].contains("bcs") || reg_no[i].contains("bch") || reg_no[i].contains("bme")) {
                	validCount++;
            	}
        }
        return validCount;
	}


    	// Approach 1 - to check reg no which is less than 50

    	public long isValidRegistrationsCountLE50_approach1() {
        	long validCount = 0;
        	for (long i = 0; i < reg_no.length; i++) {
            		String regNo = reg_no[(int) i];
            		if (regNo.startsWith("2022") && (regNo.substring(4, 7).equals("bit") || regNo.substring(4, 7).equals("bcs") || regNo.substring(4, 7).equals("bch") ||
                    regNo.substring(4, 7).equals("bme")) && regNo.charAt(7) == '0' && regNo.charAt(8) < '5') {
                	validCount++;
        	}
        }
        return validCount;
	}


    	// approach 2 - to check reg no which is less than 50
    	public long isValidRegistrationsCountLE50_approach2() {
        	long validCount = 0;
        	for (long i = 0; i < reg_no.length; i++) {
            		String regNo = reg_no[(int) i];
            		if ((regNo.startsWith("2022bit") || regNo.startsWith("2022bcs") || regNo.startsWith("2022bch") || regNo.startsWith("2022bme")) && regNo.charAt(7) == '0'
                    && regNo.charAt(8) < '5') {
                	validCount++;
            	}
        }
        return validCount;
    	}


    	// approach 3 - to check reg no which is less than 50
    	public long isValidRegistrationsCountLE50_approach3() {
        	long validCount = 0;
        	for (long i = 0; i < reg_no.length; i++) {
            		String regNo = reg_no[(int) i];
            		if ((regNo.contains("2022bit") || regNo.contains("2022bcs") || regNo.contains("2022bch") || regNo.contains("2022bme")) && regNo.charAt(7) == '0'
                    && regNo.charAt(8) < '5') {
                	validCount++;
            	}
        }
        return validCount;
    	}


    	// approach 4 - to check reg no which is less than 50
    	public long isValidRegistrationsCountLE50_approach4() {
        	long validCount = 0;
        	for (long i = 0; i < reg_no.length; i++) {
            		String regNo = reg_no[(int) i];
            		if (regNo.charAt(7) == '0' && regNo.charAt(8) < '5') {
                		validCount++;
            	}
        }
        return validCount;
    	}


    	// approach 5 - to check reg no which is less than 50
    	public long isValidRegistrationsCountLE50_approach5() {
        	long validCount = 0;
        	for (long i = 0; i < reg_no.length; i++) {
            		String regNo = reg_no[(int) i];
            		if ((regNo.contains("2022bit0") || regNo.contains("2022bcs0") || regNo.contains("2022bch0") || regNo.contains("2022bme0")) && regNo.charAt(8) < '5') {
                	validCount++;
            	}
        }
        return validCount;
    	}
  
    	// for approach 1 - timetaken for 10 times

    	static void gettime1(long[] timetaken, String[] a) {
        	int i = 0;
        	while (i < 10) {
            		long t1 = System.nanoTime();
            		long p = new SY2022bit061().isValidRegistrationsCountLE50_approach1();
            		long t2 = System.nanoTime();
            		long total = t2 - t1;
            		timetaken[i] = total;
            		i++;
        	}
    	}

    	// for approach 2 - timetaken for 10 times

    	static void gettime2(long[] timetaken, String[] a) {
        	int i = 0;
        	while (i < 10) {
            		long t1 = System.nanoTime();
            		long p = new SY2022bit061().isValidRegistrationsCountLE50_approach2();
            		long t2 = System.nanoTime();
            		long total = t2 - t1;
            		timetaken[i] = total;
            		i++;
        	}
    	}

    	// for approach 3 - timetaken for 10 times

    	static void gettime3(long[] timetaken, String[] a) {
        	int i = 0;
        	while (i < 10) {
            		long t1 = System.nanoTime();
            		long p = new SY2022bit061().isValidRegistrationsCountLE50_approach3();
            		long t2 = System.nanoTime();
            		long total = t2 - t1;
            		timetaken[i] = total;
            		i++;
         	}
    	}
    
    	// for approach 4 - timetaken for 10 times

    	static void gettime4(long[] timetaken, String[] a) {
        	int i = 0;
        	while (i < 10) {
            		long t1 = System.nanoTime();
            		long p = new SY2022bit061().isValidRegistrationsCountLE50_approach4();
            		long t2 = System.nanoTime();
            		long total = t2 - t1;
            		timetaken[i] = total;
            		i++;
         	}
    	}
    
    	// for approach 5 - timetaken for 10 times

    	static void gettime5(long[] timetaken, String[] a) {
        	int i = 0;
        	while (i < 10) {
            		long t1 = System.nanoTime();
            		long p = new SY2022bit061().isValidRegistrationsCountLE50_approach5();
            		long t2 = System.nanoTime();
            		long total = t2 - t1;
            		timetaken[i] = total;
            		i++;
         	}
    	}
    
    	// avg time btw two approach 
    	static double avgtime(long[] timetaken) {
        	int i = 0;
        	int sum = 0;
        	while (i < 10) {
            		sum = sum + (int)timetaken[i]; 
            		i++;
        	}
        	double avg = sum / 10.0; 
        	return avg;
    	}
}

public int diff21(int n) {
	if(n > 21) {
		return (Math.abs(n - 21))*2;
	}
	return (Math.abs(n - 21));
}

public boolean parrotTrouble(boolean talking, int hour) {
	return (talking && (hour < 7 || hour > 20));
}

public boolean makes10(int a, int b) {
	return (a == 10 || b == 10) || (a + b == 10); 
}

public boolean nearHundred(int n) {
	return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
}

public boolean posNeg(int a, int b, boolean negative) {
	if(negative){
		return (a < 0 && b < 0);
	} else {
		return (a < 0 || b < 0) && (a >= 0 || b >= 0);	
	}
}


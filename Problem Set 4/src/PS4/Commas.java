package PS4;

import acm.program.*;

public class Commas  extends ConsoleProgram {

/**	public Commas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public void run() {
		while (true) {
			String digits = readLine ("Enter a numeric string: ");
			if (digits.length() == 0) {
				println ("bye bye");
				break;
			}
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString (String somenumber) {
		String result="";
		int l = somenumber.length();
		for (int i=0; i<l; i++) {
			char ch = somenumber.charAt(i);
			if ((i !=0) && (l-i)%3==0){
				result += "," + ch;
			}
			else {
				result += ch;
			}
		}
		return result;
		
	}
}

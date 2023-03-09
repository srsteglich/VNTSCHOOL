  package Aula5;

public class exer2TrueFalse {

	public static void main(String[] args) {		 
		
		boolean v1 = (10 == 10 && 10 == 20) ? true:false; 
		boolean v2 = (11 == 12 && 20 == 20) ? true:false;
		boolean v3 = (15 == 15 && 16 == 16) ? true:false;
		boolean v4 = (12 == 11 && 23 == 24) ? true:false; 
		
		boolean v5 = (10 == 10 || 10 == 20) ? true:false; 
		boolean v6 = (11 == 12 || 20 == 20) ? true:false;
		boolean v7 = (15 == 15 || 16 == 16) ? true:false;
		boolean v8 = (12 == 11 || 23 == 24) ? true:false;   
		
		System.out.println();
		System.out.println(" a) verificou que é = " + v1);
		System.out.println(" b) verificou que é = " + v2);		
		System.out.println(" c) verificou que é = " + v3);		
		System.out.println(" d) verificou que é = " + v4);
		
		System.out.println(" e) verificou que é = " + v5);
		System.out.println(" f) verificou que é = " + v6);		
		System.out.println(" g) verificou que é = " + v7);		
		System.out.println(" h) verificou que é = " + v8);   
		
	}
}



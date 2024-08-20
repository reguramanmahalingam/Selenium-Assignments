package week1.day2;

public class LeanIfElseStatements {
	public static void main(String [] augs) {
		int mark=45;
		char GradeA = 'A';
		
		if (mark<20) {
			System.out.println("C Grade");
		}
		else if (mark<40) {
			System.out.println("B Grade");
		}
		else if (mark<50) {
			System.out.println("A Grade");
		}
		else {
			System.out.println("O Grade" + GradeA);
		}
			
		
	}
}

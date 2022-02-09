package S102n1Exercici3;

public class Main {

	public static void main(String[] args) {
		
		String[] name = { "Pere", "David", "Josep" };
		try {
			for (int i = 0; i <= name.length; i++) {
			    System.out.println(name[i]);
			}	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} finally {
			
		}
	}
}

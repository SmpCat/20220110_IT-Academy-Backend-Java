package S104n1Exercici3;

public class LlegirArray {

	private int[] taula = new int[]{1,2,3,4,5,6,7,8,9,10};
	
	public LlegirArray() {

	}
	
	public void lectura(int index) throws Exception {
		
		try {
			for(int x=0; x < index; x++) {
				System.out.print(" " + taula[x]);
			}	
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new Exception("Índex fora de rang");
		}
	}
}


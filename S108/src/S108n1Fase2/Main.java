package S108n1Fase2;

public class Main {

	public static void main(String[] args) {
		
		/*
		IPiValue iPiValue = new IPiValue() {
			@Override
            public double getPiValue() {
				return 3.1415;
            }
        };
        */
		
		IPiValue iPiValue = () -> 3.1415;
        
        System.out.println(iPiValue.getPiValue());
	}
}

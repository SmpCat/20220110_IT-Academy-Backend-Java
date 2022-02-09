package S104n1Exercici2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestCase {

	//Test de NIFs correctes
	@Test
	void test1() {
		
		String[] nifsOk = new String[] {
				"72532363T",
				"46340579H",
				"03242424E",
				"67657555L",
				"93425352L"
		};
		
		for(byte x = 0; x < nifsOk.length; x++) {
			assertEquals(true, CalculoNif.calculaNif(nifsOk[x]));
		}
	}
	
	//Test de NIFs incorrectes
	@Test
	void test2() {
		
		String[] nifsKo = new String[] {
				"",
				"1",
				"45",
				"1d",
				"93425352K"
		};
		
		for(byte x = 0; x < nifsKo.length; x++) {
			assertEquals(false, CalculoNif.calculaNif(nifsKo[x]));
		}
	}
}

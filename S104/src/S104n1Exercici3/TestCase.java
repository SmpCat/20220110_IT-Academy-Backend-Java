package S104n1Exercici3;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test1() throws Exception {
		
		LlegirArray llegirArray = new LlegirArray();
	
		try {
			llegirArray.lectura(56);
			fail("No ha saltat l'excepció");
		} catch (Exception e) {
			assertEquals("Índex fora de rang", e.getMessage() );	
		}	
	}
}

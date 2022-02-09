package S104n1Exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	void test() {
		LlistaMesos llistaMesos = new LlistaMesos();
		llistaMesos.omplirLlistaMesos();
		
		assertNotNull(llistaMesos.getMesos());
		assertEquals(12, llistaMesos.numeroElements());
		assertEquals("Agost", llistaMesos.valorPosicio(8));	
	}
}

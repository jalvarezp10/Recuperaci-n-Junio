import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaTest {

	@Test
	public void testDivide1() {
		prueba calcu = new prueba(20,10);
		int resultado = calcu.divide();
		assertEquals(2, resultado);
	}
}

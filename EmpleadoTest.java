package ExamenEntorno;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmpleadoTest {
	@Test
	public void comprobarSalario() {
		System.out.println("Division de enteros...");
		Empleado d= new Empleado("daysha", 1233, "Vallecas", 150);
		assertTrue(d.getNombre()=="daysha");
	}
	


}

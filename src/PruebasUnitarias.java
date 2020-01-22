import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class PruebasUnitarias {

	private Radio r = new Radio();
	
	
	@Test
	public void test1() {
		
		r.estacionActual();
		
	}
	
	@Test
	public void test2() {
		
		r.cambiarFrecuencia();
		r.avanzar();
		
	}
	
	@Test
	public void test3() {
		
		
		r.guardar(0);
		r.onOff();
	}
	
	
	
	
	
	
	

}

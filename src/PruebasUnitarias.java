import static org.junit.Assert.*;


import org.junit.Test;


/**
 * 
 * 	@author Andrei Portales Okrassa 19825
 *	@author Mariana Morales Ponce 17235
 */

public class PruebasUnitarias {

	private Radio r = new Radio();
	
	
	/**
	 * 
	 */
	@Test
	public void test1() {
		
		String d = r.estacionActual();
		String h = "87.9";
		
		assertEquals(h, d);
		
	}
	
	@Test
	public void test2() {
		r.onOff();
		boolean estadoActual = r.estado();
		boolean esperado = true;
		
		assertEquals(esperado,estadoActual);
	
	}
	
	@Test
	public void test3() {
		r.cambiarFrecuencia();
		r.avanzar();
		r.avanzar();
		String esperado = "550";
		String estado = r.estacionActual();
		
		assertEquals(esperado, estado);
			
	}
	
	
	
	
	
	
	

}

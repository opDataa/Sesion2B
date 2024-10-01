package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	
	@Test
	void calculoNominaBruta(){
		
		// Vendedor
		assertEquals(2000+200+60,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.VENDEDOR,1501 , 2)); // limite superior
		assertEquals(2000+100+60,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.VENDEDOR,1499 , 2)); // limite medio
		assertEquals(2000+0+60,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.VENDEDOR,999, 2));	    // limite inferior
		assertEquals(2000+0+0,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.VENDEDOR,-9999, 0));	// ventas negativas
		assertEquals(2000+0+0,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.VENDEDOR,0 , 0));		// ventas a cero 

		// Encargado
		assertEquals(2500+200+60,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.ENCARGADO,1501 , 2)); // limite superior
		assertEquals(2500+100+60,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.ENCARGADO,1499 , 2)); // limite medio
		assertEquals(2500+0+60,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.ENCARGADO,999, 2));	 // limite inferior
		assertEquals(2500+0+0,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.ENCARGADO,-9999, 0));	 // ventas negativas
		assertEquals(2500+0+0,Empleado.calculoMonimaBruta(Empleado.TipoEmpleado.ENCARGADO,0 , 0));		 // ventas a cero 		
	}
	
	@Test
	void calculoNominaNeta(){
		assertEquals(2501f*(1-0.18f),Empleado.calculoNominaNeta(2501));	// Limite superior
		assertEquals(2499f*(1-0.15f),Empleado.calculoNominaNeta(2499)); // Limite medio
		assertEquals(2099f,Empleado.calculoNominaNeta(2099));			// Limite inferior
		assertEquals(-9999,Empleado.calculoNominaNeta(-9999));			// Valor negativo 
		assertEquals(-0,Empleado.calculoNominaNeta(0));					
	}
}

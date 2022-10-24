package testes;

import junit.framework.TestCase;
import util.Calculadora;

 

public class CalculadoraTeste extends TestCase {

	Calculadora t = new Calculadora (); 
	protected void setUp() throws Exception {
		super.setUp();
		 
	}

	public void testSoma() {
		assertEquals(20.0, t.soma(10,10)); 
	}

	public void testSubtracao() {
		assertEquals(8.0, t.subtracao(10,2));
	}

	public void testDivisao() {
		assertEquals(3.0, t.divisao(15,5));
	}

	public void testMultiplicacao() {
		assertEquals(10.0, t.multiplicacao(5,2));
	} 
    public void testeRaizquadrada() {
    	assertEquals(6.0, t.raizquadrada(36));
    }
    public void testeExponencial() {
    	assertEquals(4.0, t.exponencial(2,2));
    }
    public void testePiso() {
    	assertEquals(3.0, t.piso(3.4));
    }
    public void testeTeto() {
    	assertEquals(4.0, t.teto(3.8));
    }
}

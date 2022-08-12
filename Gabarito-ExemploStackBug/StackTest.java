/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Teste que reproduz o bug da classe Stack
*
*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {
	
  Stack<Integer> stack;

	@Test
	public void testPushPopStack() {
    stack = new Stack<Integer>();
    
		// continue a escrever aqui o código do teste
    // GABARITO
    stack.push(10);                // stacK: 10
    stack.push(20);                // stacK: 10 20
    int resultado = stack.pop();   // stacK: 10
    stack.push(30);                // stack: 10 30
    resultado = stack.pop();       // resultado = 30
		assertEquals(30, resultado);
	}

}
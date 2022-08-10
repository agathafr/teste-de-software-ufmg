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
    stack.push(10);
    stack.push(20);
    int desempilha = stack.pop();
    stack.push(30);
    desempilha = stack.pop();
    assertEquals(30, desempilha);
	}

}
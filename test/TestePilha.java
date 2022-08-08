import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPilha {

    @Test // anotação que indica que é um método de teste
    public void testEmptyStack() { // não tem retorno e são públicos 
        Stack<Integer> stack = new Stack<Integer>(); // criar objeto que será usado no teste, dado, contexto(fixture)
        boolean empty = stack.isEmpty(); // chamada do método que será testado
        assertTrue(empty); // chama o comando assert que verifica se o resultado é o esperado, senão, lança uma exceção
    }

    @Before // anotação que indica que o método que ela anota será executado antes de qualquer método anotado como @Test
    public void init() {
        stack = new Stack<Integer>(); 
    }

    @Test
    public void testEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNotEmptyStack() {
        stack.push(10); // adiciona o elemento 10
        assertFalse(stack.isEmpty()); // testa se o valor retornado pelo método para o objeto instânciado em init() é falso
    }

    @Test 
    public void testSizeStack() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int size = stack.size();
        assertEquals(3, size);
    }

    @Test
    public void testPushPopStack() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int result = stack.pop();
        result = stack.pop();
        assertEquals(20, result);
    }

    @Test(expected = java.util.EmptyStackException.class) // testa uma exceção, teste passa se a execução do método terminar com a exceção
    public void testEmptyStackException() {
        stack.push(10);
        int result = stack.pop();
        result = stack.pop();
    }
}
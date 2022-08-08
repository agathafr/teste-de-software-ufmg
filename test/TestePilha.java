import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestPilha {

    @Test // anotação que indica que é um método de teste
    public void testEmptyStack() { // não tem retorno e são públicos 
        Stack<Integer> stack = new Stack<Integer>(); // criar objeto que será usado no teste, dado, contexto(fixture)
        boolean empty = stack.isEmpty(); // chamada do método que será testado
        assertTrue(empty); // chama o comando assert que verifica se o resultado é o esperado, senão, lança uma exceção
    }
}
/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Exemplo de teste de uma calculadora com parâmetros do tipo String
*
*/

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
* Classe com os métodos de teste
*/
public class TesteCalculadora {
  
    @Test
    public void testeSoma1() {
      Calculadora calc = new Calculadora();

      int resultado = calc.soma("2,3");
      assertEquals(5,resultado);
      
      resultado = calc.soma("  2, 3");
      assertEquals(5,resultado);
      
      resultado = calc.soma("  2,3  ");
      assertEquals(5,resultado);
      
      resultado = calc.soma("  2,  3  ");
      assertEquals(5,resultado);

    }
  
    @Test
    public void testeSoma2() {
      // Complete agora com os testes dos seguintes casos
      Calculadora calc = new Calculadora();
      // 1. testar soma de string vazia (""), que deve dar zero
      int resultado = calc.soma("");
      assertEquals(0, resultado);

      // 2. testar a soma de uma string com apenas brancos, que deve dar zero
      resultado = calc.soma("  ,  ");
      assertEquals(0, resultado);
      
      // 3. testar a soma de 3 inteiros, separados por vírgulas 
      resultado = calc.soma("5,6,4");
      assertEquals(15, resultado);
      
      // 4. testar a soma de 4 inteiros, separados por vírgulas e com brancos antes ou depois de algumas das vírgulas
      resultado = calc.soma("8 , 7 , 9");
      assertEquals(24, resultado);
    }

    // 5. testar a soma quando um dos inteiros da string de entrada é negativo; essa soma deve lançar uma exceção RuntimeException 
    // Veja que já deixamos a anotação @Test pronta
    // Dica: neste teste, não vamos ter comando assert (ou seja, esse teste é parecido com o teste do método pop da classe Stack, que vimos antes)

    @Test(expected = RuntimeException.class)
    public void testeSoma3() {
      Calculadora calc = new Calculadora();
      int resultado = calc.soma("-5, 4");
    }   
}
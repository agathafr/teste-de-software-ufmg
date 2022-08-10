/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Teste da classe Prova
*
*/

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.Map;

/**
* Classe com os métodos de teste
*/
public class TesteProva {
    
    private Prova prova;

    @Before
    public void init() {
      prova = new Prova();
      prova.addNota("joao", 85);
      prova.addNota("maria", 87);
      prova.addNota("jose", 74);
      prova.addNota("guilherme", 90);
      prova.addNota("alice", 98);
    }

    @Test
    public void testeGetNota() {
      assertEquals(85, prova.getNota("joao"));
      assertEquals(98, prova.getNota("alice"));
    }


    @Test
    public void testeAlteraNota() {
      prova.alteraNota("jose", 75);
      assertEquals(75, prova.getNota("jose"));
    }

    @Test 
    public void testeCalcMedia() {
      assertEquals(86.8, prova.calculaNotaMedia(), 0.0001);
      // como os valores são double, pode existir uma pequena diferença entre eles; no caso, estamos admitindo uma diferença de até 0.0001 (terceiro parâmetro do assertEquals)
      // (85+87+74+90+98) / 5 = 86.8
    }

    // Testa o funcionamento do método getMaioresNotas()
    // usando o objeto "prova" criado no métdo "init"
    // veja que neste teste a prova tem uma única maior nota
    @Test
    public void testeGetMaioresNotas() {
      Map<String, Integer> maiores;
      maiores = prova.getMaioresNotas();
      assertEquals(1, maiores.size());
      assertEquals(98, maiores.get("alice").intValue());
    }

    // Testa o funcionamento do método getMaioresNotas()
    // usando o objeto "prova" criado no métdo "init"
    // veja que um nova nota é adicionada neste objeto
    // com isso temos agora o cenário de uma "prova" com duas
    // notas maiores (alice e luis, 98 pontos)
    @Test
    public void testeGetMaioresNotas2() {
      Map<String, Integer> maiores;
      prova.addNota("luis", 98);
      maiores = prova.getMaioresNotas();

      // escreva aqui o código dos comandos assert
      // GABARITO
      assertEquals(2, maiores.size());
      assertEquals(98, maiores.get("alice").intValue());
      assertEquals(98, maiores.get("luis").intValue());
    }
}
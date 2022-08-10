/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
*
*/

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
*  Classe que vai rodar os testes
*  Necessária quando o JUnit é usado via Repl.it
*  Quando se usa uma IDE como Eclipse, NetBeans, IntelliJ etc, 
*  essa classe não é necessária
* 
*  IMPORTANTE: não altere o código abaixo
* 
*/
public class TestRunner {
  public static void main() {
    Result result = JUnitCore.runClasses(StackTest.class);
    int count;
    String msg;
    long time = result.getRunTime();

    System.out.println("\n\nRESULTADO DOS TESTES");
    System.out.println("Tempo: " + time + " ms");

    if (result.wasSuccessful()) {
       count = result.getRunCount();
       if (count == 1)
          msg = count + " teste executado com sucesso";
       else
          msg = count + " testes executados com sucesso";      
       
    }    
    else {
       count = result.getFailureCount();
       if (count == 1)
          msg = count + " teste falhou";
       else
          msg = count + " testes falharam";      
    }

    System.out.println(msg);

    for (Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
    
  }
}
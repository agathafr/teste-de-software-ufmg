/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Exemplo de teste de uma calculadora com parâmetros do tipo String
*
*/

/**
* Classe que será testada
*/

public class Calculadora {

  // Soma todos os inteiros contidos em uma string
  // params: string contendo inteiros, separados por vírgula
  // Exemplo: soma("2,3,5") = 10
  
  public int soma(String params) {
    int soma = 0;
    String[] operandos = params.split(","); 
    for (String op: operandos) {
        op = op.trim();
        if (!op.isEmpty()) {
            int n = Integer.parseInt(op);
            if (n < 0)
               throw new RuntimeException("Números negativos não são aceitos: " + n);
            soma = soma + n ;
        }
    }
    return soma;
  }
}
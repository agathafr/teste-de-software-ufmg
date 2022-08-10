/**
* Engenharia de Software Moderna - Testes  (Cap. 8)
* Prof. Marco Tulio Valente
* 
* Teste de uma classe Prova
*
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

// classe que armazena as notas de uma prova
public class Prova {

  private Map<String, Integer> notas;
  // armazena as notas de um aluno
  // isto é, dado um aluno (String) retorna sua nota (Integer)

  public Prova() {
    notas = new HashMap<String, Integer>();
  }

  public void addNota(String nome, Integer nota) {
    notas.put(nome, nota);
  }

  public void alteraNota(String nome, Integer nota) {
    notas.put(nome, nota);
  }

  public int getNota(String nome) {
    return notas.get(nome);
  }

  public double calculaNotaMedia() {
    double soma = 0.0;
    for (String nome : notas.keySet()) {
      soma = soma + notas.get(nome);
    }
    return soma / notas.size();
  }

  // retorna um novo mapa, com as maiores notas da turma
  // o retorno é um mapa porque pode existir mais de um aluno com a mesma maior nota
  public Map<String, Integer> getMaioresNotas() {
    Map<String, Integer> maiores = new HashMap<String, Integer>();
    int max = Collections.max(notas.values());
    for (String nome : notas.keySet()) {
      int valor = notas.get(nome); 
      if (valor == max) {
          maiores.put(nome,valor);
      }
    }
    return maiores;    
  }

}
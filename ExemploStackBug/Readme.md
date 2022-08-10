## Engenharia de Software Moderna - Testes  (Cap. 8)

Prof. Marco Tulio Valente

Exemplo de Teste de uma classe Stack com um bug

* `Stack.java`: classe que será testada; ela tem um **bug** no método pop(), que será corrigido neste exercício.
* `StackTest.java`: teste da classe Stack

* * * 

**Exercício:**

1. Um usuário da classe `Stack` reclamou que a pilha apresentava um bug, quando ele fazia as seguintes operações:
   - criava uma pilha vazia
   - empilhava 10 e 20
   - desempilhava um valor
   - empilhava 30
   - desempilhava um valor, que deveria ser 30; mas devido ao bug era um outro valor


  2. Escreva um teste que reproduza o bug descrito pelo usuário. Na verdade, já começamos a escrever esse teste, no método `testPushPopStack()` do arquivo `StackTest.java`.
  
  Veja que, inicialmente, o seu teste vai falhar, pois a classe `Stack.java` tem um bug! A mensagem de falha deve ser a seguinte:  *expected:<30> but was:<20>*
  

  3. Agora, no método `pop` da classe `Stack` (arquivo Stack.java):
     - comente a linha com o bug (comando `get`)
     - descomente a linha com o código correto (comando `remove`)
     - Com isso estamos aplicando a correção do bug!
  

  4. Rode o teste de novo, agora ele vai passar!

* * * 

**Moral da história:** 
  
Sempre que um usuário reportar um bug, tente se possível escrever um teste que reproduza-o. Com isso, você vai entedender bem o cenário do bug, o que vai te ajudar na correção. 

E, por tabela, você acrescenta mais um teste no seu sistema, o qual vai evitar que esse bug seja reintroduzido no futuro. Em alguns casos, isso acontece com mais frequência do que a gente imagina.
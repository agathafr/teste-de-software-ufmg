import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pilha<T> {
    private ArrayList<T> elements = new ArrayList<T>(); // lista que armazena os elementos da pilha
    private int size = 0; // tamanho da pilha (número de elementos empilhados inicialmente 0)

    public int size() {
        return size // retorna o número de elementos da pilha
    }

    public boolean isEmpty() {
        return (size == 0); // retorna um boleano que indica se a pilha está vazia ou não
    }

    public void push(T elem) { // empilha elemento na pilha
        elements.add(elem); // adiciona elemento ao fim do vetor, lista que comtém os elementos da pilha
        size++; // incrementa número de elementos empilhados
    }

    public T pop() throws EmptyStackException { // retorna um elemento da pilha
        if (isEmpty()) // se tiver vazia
            throw new EmptyStackException(); // retorna exceção porque não tem como retornar nada
        T elem = elements.remove(size-1); // se houver elemento, remove o último elemento da lista (top da pilha) e guarda na variável
        size--; // decrementa o elemento retirado do tamanho da lista, pilha
        return elem; // retorna o elemento retirado do topo da pilha 
    }
}
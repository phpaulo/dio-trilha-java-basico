package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    //construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        System.out.println("Exibindo a lista de números adicionados:");
        numeros.exibirNumeros();
        System.out.println("================");

        // Ordenando e exibindo em ordem ascendente
        System.out.println("Ordenando e exibindo em ordem ascendente:");
        System.out.println(numeros.ordenarAscendente());
        System.out.println("================");

        // Exibindo a lista
        System.out.println("Exibindo a lista:");
        numeros.exibirNumeros();
        System.out.println("================");

        // Ordenando e exibindo em ordem descendente
        System.out.println("Ordenando e exibindo em ordem descendente:");
        System.out.println(numeros.ordenarDescendente());
        System.out.println("================");

        // Exibindo a lista
        System.out.println("Exibindo a lista:");
        numeros.exibirNumeros();
        System.out.println("================");
    }
}

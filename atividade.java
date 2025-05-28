//14 - Crie um método para verificar se um elemento existe em uma fila circular estática:

import java.util.Stack;

public boolean existeElemento(int elemento) {
    int i = inicio;
    while (i != fim) {
        if (fila[i] == elemento) return true;
        i = (i + 1) % tamanhoMaximo;
    }
    return false;
}

//15 - Crie um método que dado um valor, retorne a posição que o mesmo se encontra na fila linear com implementação dinâmica:

public int encontrarPosicao(int valor) {
    No atual = inicio;
    int posicao = 0;
    while (atual != null) {
        if (atual.valor == valor) return posicao;
        atual = atual.proximo;
        posicao++;
    }
    return -1; // Valor não encontrado
}

//16 - Crie uma função para apresentar o último elemento da fila:

public int ultimoElemento() {
    if (fim == null) throw new RuntimeException("Fila vazia");
    return fim.valor;
}

//17 - Crie uma função para mostrar a quantidade de elementos da fila:

public int quantidadeElementos() {
    int contador = 0;
    No atual = inicio;
    while (atual != null) {
        contador++;
        atual = atual.proximo;
    }
    return contador;
}

//18 - Utilizando uma pilha crie um programa que converta um número decimal em qualquer base de 2 a 8:

public void converterDecimal(int numero, int base) {
    if (base < 2 || base > 8) throw new IllegalArgumentException("Base inválida");

    Stack<Integer> pilha = new Stack<>();
    while (numero > 0) {
        pilha.push(numero % base);
        numero = numero / base;
    }
    System.out.print("Resultado: ");
    while (!pilha.isEmpty()) {
        System.out.print(pilha.pop());
    }
    System.out.println();
}

// 19 - Escreva uma função que verifique se uma fila encadeada que contém números inteiros está em ordem crescente:  

public boolean estaCrescente() {
    if (inicio == null || inicio.proximo == null) return true;

    No atual = inicio;
    while (atual.proximo != null) {
        if (atual.valor > atual.proximo.valor) return false;
        atual = atual.proximo;
    }
    return true;
}

// 20 - Crie a função para mostrar o topo da pilha que utiliza estrutura encadeada:

public int topo() {
    if (topo == null) throw new RuntimeException("Pilha vazia");
    return topo.valor;
}
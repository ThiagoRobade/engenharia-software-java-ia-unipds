/**
 * Exercício da Aula 4: Calcula a média de um array de notas usando o for tradicional.
 */
void main() {
    // Array de notas
    double[] notas = {8.5, 9.0, 7.2, 6.0, 10.0};
    double soma = 0.0;

    // For tradicional (usando o índice 'i')
    for (int i = 0; i < notas.length; i++) {
        soma += notas[i]; // Soma a nota na posição 'i'
    }

    // A média é a soma dividida pela quantidade de itens (tamanho do array)
    double media = soma / notas.length;
    IO.println("A média do aluno é: " + media);
}
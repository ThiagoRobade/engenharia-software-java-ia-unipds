/**
 * Código oficial da Aula 4: Demonstra arrays e laços de repetição (for-each e break).
 */
void main() {
    // Array de preços (o índice vai de 0 a 6)
    double[] precos = {2.99, 3.50, 12.99, 4.99, 2.50, 4.99, 25.90};

    // 1. Somando todos os preços usando for-each
    double totalDePrecos = 0.0;
    for (double preco : precos) {
        totalDePrecos += preco; // O operador += soma e atribui
    }
    IO.println("Soma dos preços: " + totalDePrecos);

    // 2. Usando break para encontrar o primeiro preço acima de 10
    double precoLimite = 10.0;
    for (double preco : precos) {
        if (preco > precoLimite) {
            IO.println("Primeiro preço maior que 10: " + preco);
            break; // Achou, então para o laço imediatamente
        }
    }
}
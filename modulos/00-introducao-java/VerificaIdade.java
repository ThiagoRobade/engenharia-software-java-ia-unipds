/**
 * Exercício da Aula 3: Verifica se uma pessoa é maior de idade.
 * Usa estrutura condicional if-else.
 */
void main() {
    int idade = 17; // Idade a ser verificada

    // Se a idade for maior ou igual a 18...
    if (idade >= 18) {
        IO.println("Acesso permitido");
    } else {
        // Se for menor que 18...
        IO.println("Acesso negado");
    }
}
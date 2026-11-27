/**
 * Exercício da Aula 3: Calcula o Índice de Massa Corporal (IMC).
 * Fórmula: IMC = peso / (altura * altura)
 */
void main() {
    // Dados de entrada
    double peso = 75.5;   // Peso em kg
    double altura = 1.80; // Altura em metros

    // Cálculo do IMC
    double imc = peso / (altura * altura);

    // Exibindo o resultado
    IO.println("Seu IMC é: " + imc);
}
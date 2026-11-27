/**
 * Código oficial da Aula 3: Demonstra variáveis, inferência de tipo (var),
 * operadores e estruturas condicionais (if-else e switch-case).
 */
void main() {
    // 1. Modelando os dados com var (Inferência de tipo)
    var nome = "Sanduíche de Presunto do Chaves";
    var descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
    var emPromocao = true;
    var preco = 3.50;
    var precoComDesconto = 2.99;
    var id = 3_000_000_000L; // O 'L' indica que é long
    int categoria = 2;       // 2 = Pratos Principais

    IO.println("Produto: " + nome);
    IO.println("ID: " + id);

    // 2. Operadores e Precedência
    // Cálculo correto usando parênteses (se não usar, a divisão acontece primeiro)
    double porcentagemDesconto = (preco - precoComDesconto) / preco;
    IO.println("Porcentagem de desconto: " + porcentagemDesconto);

    // 3. Demonstração de divisão inteira e módulo (resto)
    int x = 11;
    int y = 2;
    IO.println("Divisão inteira (11/2): " + (x / y)); // Resultado: 5
    IO.println("Resto da divisão (11%2): " + (x % y)); // Resultado: 1

    // 4. Estruturas Condicionais (if-else)
    IO.println("\n--- Usando if-else ---");
    if (categoria == 1) {
        IO.println("Categoria: Entradas");
    } else if (categoria == 2) {
        IO.println("Categoria: Pratos Principais");
    } else if (categoria == 3) {
        IO.println("Categoria: Sobremesas");
    } else if (categoria == 4) {
        IO.println("Categoria: Bebidas");
    } else {
        IO.println("Categoria não encontrada...");
    }

    // 5. Estruturas Condicionais (switch-case)
    IO.println("\n--- Usando switch-case ---");
    switch (categoria) {
        case 1:
            IO.println("Categoria: Entradas");
            break;
        case 2:
            IO.println("Categoria: Pratos Principais");
            break;
        case 3:
            IO.println("Categoria: Sobremesas");
            break;
        case 4:
            IO.println("Categoria: Bebidas");
            break;
        default:
            IO.println("Categoria não encontrada...");
    }
}
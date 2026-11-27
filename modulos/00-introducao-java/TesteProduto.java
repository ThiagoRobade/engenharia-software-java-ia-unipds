/**
 * Exercício da Aula 5: Cria e manipula objetos da classe Produto.
 */
void main() {
    // --- PRODUTO 1 ---
    Produto p1 = new Produto();
    p1.nome = "Teclado Mecânico";
    p1.preco = 250.00;
    p1.quantidadeEmEstoque = 15;
    p1.codigoDeBarras = "123456789";

    // --- PRODUTO 2 ---
    var p2 = new Produto();
    p2.nome = "Mouse Gamer";
    p2.preco = 150.50;
    p2.quantidadeEmEstoque = 30;
    p2.codigoDeBarras = "987654321";

    // Imprimindo os dados organizadamente
    IO.println("--- PRODUTO 1 ---");
    IO.println("Nome: " + p1.nome + " | Preço: R$ " + p1.preco + " | Estoque: " + p1.quantidadeEmEstoque);

    IO.println("\n--- PRODUTO 2 ---");
    IO.println("Nome: " + p2.nome + " | Preço: R$ " + p2.preco + " | Estoque: " + p2.quantidadeEmEstoque);
}
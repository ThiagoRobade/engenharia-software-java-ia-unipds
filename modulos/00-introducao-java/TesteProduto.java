void main() {

    Produto p1 = new Produto();
    p1.nome = "Teclado Mecânico";
    p1.preco = 250.00;
    p1.quantidadeEmEstoque = 15;
    p1.codigoDeBarras = "123456789";

    var p2 = new Produto();
    p2.nome = "Mouse Gamer";
    p2.preco = 150.50;
    p2.quantidadeEmEstoque = 30;
    p2.codigoDeBarras = "987654321";

    IO.println("--- PRODUTO 1 ---");
    IO.println("Nome: " + p1.nome + " | Preço: " + p1.preco + " | Estoque: " + p1.quantidadeEmEstoque + " | Código: " + p1.codigoDeBarras);

    IO.println("\n--- PRODUTO 2 ---");
    IO.println("Nome: " + p2.nome + " | Preço: " + p2.preco + " | Estoque: " + p2.quantidadeEmEstoque + " | Código: " + p2.codigoDeBarras);
}

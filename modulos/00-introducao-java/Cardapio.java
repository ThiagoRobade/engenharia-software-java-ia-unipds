void main() {
    var nome = "Sanduíche de Presunto do Chaves";
    var descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
    var emPromocao = true;
    var preco = 3.50;
    var precoComDesconto = 2.99;
    var id = 3_000_000_000L;
    int categoria = 2;

    IO.println("Produto: " + nome);
    IO.println("ID: " + id);

    double porcentagemDesconto = (preco - precoComDesconto) / preco;
    IO.println("Porcentagem de desconto: " + porcentagemDesconto);

    int x = 11;
    int y = 2;
    int z = x / y;
    IO.println("Divisão inteira (11/2): " + z);

    int w = x % y;
    IO.println("Resto da divisão (11%2): " + w);

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

    IO.println("\n--- Usando switch-case ---");
    switch(categoria) {
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
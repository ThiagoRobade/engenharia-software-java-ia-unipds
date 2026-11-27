// 1. O Molde (Classe)
public class ItemCardapio {
    String nome;
    String descricao;
    boolean emPromocao;
    double preco;
    double precoComDesconto;
    long id;
    int categoria;
}

// 2. O Programa Principal
void main() {
    // Criando o primeiro objeto
    ItemCardapio item1 = new ItemCardapio();
    item1.nome = "Refresco do Chaves";
    item1.descricao = "Suco de limão que parece de tamarindo...";
    item1.emPromocao = false;
    item1.preco = 2.99;
    item1.id = 1L;
    item1.categoria = 4;

    // Criando o segundo objeto
    var item2 = new ItemCardapio();
    item2.nome = "Sanduíche de Presunto do Chaves";
    item2.descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
    item2.emPromocao = true;
    item2.preco = 3.50;
    item2.precoComDesconto = 2.99;
    item2.id = 3_000_000_000L;
    item2.categoria = 2;

    // Imprimindo os dados (Exatamente como o PDF mostrou)
    IO.println("Nome do Item 1: " + item1.nome);

    IO.println("Nome do Item 2: " + item2.nome);
    if (item2.emPromocao) {
        var porcentagemDesconto = (item2.preco - item2.precoComDesconto) / item2.preco;
        IO.println("Porcentagem de desconto: " + porcentagemDesconto);
        IO.println("Preço: de " + item2.preco + " por " + item2.precoComDesconto);
    }
}

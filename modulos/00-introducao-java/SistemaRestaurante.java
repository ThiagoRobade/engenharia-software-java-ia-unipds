void main() {
    // --- CRIANDO E PREENCHENDO O ITEM 1 ---
    // Instanciando (criando) um novo objeto a partir do molde ItemCardapio
    ItemCardapio item1 = new ItemCardapio();

    // Atribuindo valores aos atributos do item1 usando a notação de ponto (.)
    item1.nome = "Refresco do Chaves";
    item1.descricao = "Suco de limão que parece de tamarindo e tem gosto de groselha.";
    item1.emPromocao = false;
    item1.preco = 2.99;
    item1.id = 1L; // O 'L' no final indica que é um tipo long
    item1.categoria = 4;

    // --- CRIANDO E PREENCHENDO O ITEM 2 ---
    // Usando 'var' para o Java inferir automaticamente que é um ItemCardapio
    var item2 = new ItemCardapio();

    item2.nome = "Sanduíche de Presunto do Chaves";
    item2.descricao = "Sanduíche de presunto simples, mas feito com muito amor.";
    item2.emPromocao = true;
    item2.preco = 3.50;
    item2.precoComDesconto = 2.99;
    item2.id = 3_000_000_000L;
    item2.categoria = 2;

    // --- IMPRIMINDO OS DADOS ---
    IO.println("--- DETALHES DOS ITENS DO CARDÁPIO ---");
    IO.println("Nome do Item 1: " + item1.nome);
    IO.println("Nome do Item 2: " + item2.nome);

    // Verifica se o item2 está em promoção antes de calcular o desconto
    if (item2.emPromocao) {
        // Cálculo matemático: (preço original - preço com desconto) / preço original
        var porcentagemDesconto = (item2.preco - item2.precoComDesconto) / item2.preco;

        IO.println("O item está em promoção!");
        // Multiplicamos por 100 para transformar o decimal em porcentagem (ex: 0.14 vira 14)
        IO.println("Porcentagem de desconto: " + (porcentagemDesconto * 100) + "%");
        IO.println("Preço: de R$ " + item2.preco + " por R$ " + item2.precoComDesconto);
    } else {
        IO.println("O item não está em promoção.");
    }
}
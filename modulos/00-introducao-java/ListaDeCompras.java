/**
 * Exercício da Aula 4: Demonstra iteração em um array de Strings usando for-each.
 */
void main() {
    // Array de Strings (itens da lista)
    var listaDeCompras = new String[]{"Arroz", "Feijão", "Macarrão", "Leite", "Café"};

    // Percorrendo o array com for-each
    for (var item : listaDeCompras) {
        IO.println("Não esquecer de comprar: " + item);
    }
}
void main() {

    imprimirTitulo("Arrays");

    double[] precos = new double[7];

    precos[0] = 2.99;
    precos[1] = 3.50;
    precos[2] = 12.99;
    precos[3] = 4.99;
    precos[4] = 2.50;
    precos[5] = 4.99;
    precos[6] = 25.90;

    boolean[] emPromocao = {false, true, true, true, true, true, false};

    IO.println("Preço do Item 2: " + precos[2]);
    IO.println("Tamanho do array de preços: " + precos.length);
    IO.println("Tamanho do array emPromocao: " + emPromocao.length);

    IO.println("O segundo item tem promoção? " + emPromocao[2] + "\n");

    imprimirTitulo("While");

    int i = 0;
    double totalDePrecos = 0.0;
    while (i < precos.length) {
        double preco = precos[i];
        totalDePrecos = totalDePrecos + preco;
        i = i + 1;
    }
    IO.println("Soma dos preços: " + totalDePrecos + "\n");

    imprimirTitulo("Do-While");

    int totalDeItensEmPromocao = 0;
    int j = emPromocao.length - 1;
    do {
        if (emPromocao[j]) {
            totalDeItensEmPromocao++;
        }
        j--;
    } while (j >= 0);
    IO.println("Total de itens em promoção: " + totalDeItensEmPromocao + "\n");

    imprimirTitulo("For");

    double totalDePrecosComFor = 0.0;
    for(int k = 0; k < precos.length; k++) {
        double preco = precos[k];
        totalDePrecosComFor += preco;
    }
    IO.println("Soma dos preços com for: " + totalDePrecosComFor + "\n");

    imprimirTitulo("ForEach");

    double totalDePrecosComForEach = 0.0;
    for (double preco : precos) {
        totalDePrecosComForEach += preco;
    }

    IO.println("Soma dos preços com forEach: " + totalDePrecosComForEach + "\n");

    imprimirTitulo("Encontrar o primeiro preço que é > 10.0");

    double precoLimite = 10.0;
    double precoMaiorQueLimite = -1.0;

    for ( double preco : precos) {
        if (preco > precoLimite) {
            precoMaiorQueLimite = preco;
            break;
        }
    }
    IO.println("O primeiro preço que é maior que " + precoLimite + ": " + precoMaiorQueLimite + "\n");

    imprimirTitulo("Imprimir todos os preços menores que o limite: ");

    for ( double preco : precos) {
        if (preco <= precoLimite) {
            IO.println("Preço menor que " + precoLimite + ": " + preco);
            continue;
        }
        IO.println("-----");
        IO.println("Processamento pesado para:" + preco + "\n");
    }
}

void imprimirTitulo(String titulo) {
    IO.println("\n=====================================================");
    IO.println(" " + titulo.toUpperCase());
    IO.println("=====================================================\n");
}


























void main() {
    String[] listaDeCompras = new String[5];

    listaDeCompras[0] = "Pão";
    listaDeCompras[1] = "Frango";
    listaDeCompras[2] = "Melão";
    listaDeCompras[3] = "Nescau";
    listaDeCompras[4] = "Leite de Soja";

    for (String item : listaDeCompras) {
        IO.println("Não esquecer de comprar " + item);
    }
}
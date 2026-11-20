void main() {
    double[] nota = new double[5];
    double soma = 0.0;

    nota[0] = 8.5;
    nota[1] = 9.0;
    nota[2] = 7.2;
    nota[3] = 6.0;
    nota[4] = 10.0;

    for (int i = 0; i < nota.length; i++) {
        soma += nota[i];
    }
    double media = soma / nota.length;
    IO.println("A média do aluno é " + media);
}
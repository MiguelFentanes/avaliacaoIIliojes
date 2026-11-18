    void main() {
    
    double C = Double.parseDouble(IO.readln("Insira as temperaturas em Celsius: "));
    int leituras = 0;
    double soma = 0.0;

    if (C == 999)
        IO.println("Aviso!!! O número inserido não é uma entrada válida, insira novamente!!!");
    else {
        while (C != 999) {
            leituras++;
            soma += C;
         C = Double.parseDouble(IO.readln("Insira as temperaturas em Celsius: "));

     }

        double media = soma/leituras;

        System.out.printf("A média das temperaturas é: %.1f%n", media);

        if (media < 18)
            IO.println("Temperatura Baixa: Ligar Aquecimento");
        else if (media <=28)
            IO.println("Temperatura Ideal");
        else 
            IO.println("Temperatura Alta: Ligar Ventilação");
     }
}

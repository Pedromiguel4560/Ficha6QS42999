package org.example;

public class QuantidadeDigitos {

    public double mediaDigitos(int num){

        int cont = 0;
        int somaDigitos = 0;

        while (num != 0){

            num /= 10;
            cont++;
            somaDigitos += num;

        }

        double media = somaDigitos/cont;

        return media;

    }

}

package aula7;

import java.util.Scanner;

public class executor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Delta delta = new Delta();
        EqXn x = new EqXn();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("valor de A?");
        delta.setA(entrada.nextDouble());

        System.out.println("Valor de B?");
        delta.setB(entrada.nextDouble());

        System.out.println("Valor de C?");
        delta.setC(entrada.nextDouble());

        delta.calculaDelta();
        System.out.println("----Resultado da Equação----");
        System.out.println("Delta: " + delta.getDelta());
        if (delta.getDelta() < 0) {
            System.out.println("-- Não existe x para delta negativo");
        } else {
            System.out.println("X| : " + x.calculaXn(delta));
            System.out.println("X|| : " + x.calculaXp(delta));

        }

    }
}
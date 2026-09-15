package Exercicios;

import java.util.Scanner;

public class exercicio02 {
    public static  void  main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        int minutos = sc.nextInt();

        double conta = 50.00;
        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2;
        }
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
    }
}

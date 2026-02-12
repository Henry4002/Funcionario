package Teste;

import Classes.Desenvolvedor;
import Classes.Gerente;

public class TesteFuncionario {

    public static void main(String[] args) {

        Gerente g1 = new Gerente(
                "Jonas",
                1000,
                "Bangladesh",
                1500,
                12
        );

        Desenvolvedor d1 = new Desenvolvedor(
                "Miller",
                2900,
                "França",
                "Java",
                12
        );

        d1.calcularSalario();
        System.out.println();
        g1.calcularSalario();

        System.out.println("\n============================\n");

        System.out.println(d1.exibirInfo());
        System.out.println();
        System.out.println(g1.exibirInfo());
    }
}

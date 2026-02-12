package Classes;

public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;
    private double bonusProjeto;

    public Desenvolvedor(String nome,
                         double salario,
                         String departamento,
                         String linguagemPrincipal,
                         double bonusProjeto) {

        super(nome, salario, departamento);
        this.linguagemPrincipal = linguagemPrincipal;
        this.bonusProjeto = bonusProjeto;
    }

    @Override
    public void calcularSalario() {

        double salarioAtualizado = getSalario() + bonusProjeto;

        System.out.println("Salário Base: " + getSalario());
        System.out.println("Bônus de Projeto: " + bonusProjeto);
        System.out.println("Salário Atualizado: " + salarioAtualizado);
    }

    @Override
    public String exibirInfo() {

        String infoPai = super.exibirInfo();

        double salarioAtualizado = getSalario() + bonusProjeto;

        String infoFilha = """
                Linguagem Principal: %s
                Bônus de Projeto: %.2f
                Salário Base: %.2f
                Salário Atualizado: %.2f
                """.formatted(
                linguagemPrincipal,
                bonusProjeto,
                getSalario(),
                salarioAtualizado
        );

        return infoPai + "\n" + infoFilha;
    }
}

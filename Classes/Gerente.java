package Classes;

public class Gerente extends Funcionario {

    private double bonusDesempenho;
    private int equipe;

    public Gerente(String nome,
                   double salario,
                   String departamento,
                   double bonusDesempenho,
                   int equipe) {

        super(nome, salario, departamento); // PRIMEIRO

        this.bonusDesempenho = bonusDesempenho;
        this.equipe = equipe;
    }

    @Override
    public void calcularSalario() {

        double salarioAtualizado = getSalario() + bonusDesempenho;

        System.out.println("Salário Base: " + getSalario());
        System.out.println("Bônus de Desempenho: " + bonusDesempenho);
        System.out.println("Salário Atualizado: " + salarioAtualizado);
    }

    @Override
    public String exibirInfo() {

        String infoPai = super.exibirInfo();

        double salarioAtualizado = getSalario() + bonusDesempenho;

        String infoFilha = """
                Tamanho da Equipe: %d
                Bônus de Desempenho: %.2f
                Salário Base: %.2f
                Salário Atualizado: %.2f
                """.formatted(
                equipe,
                bonusDesempenho,
                getSalario(),
                salarioAtualizado
        );

        return infoPai + "\n" + infoFilha;
    }
}

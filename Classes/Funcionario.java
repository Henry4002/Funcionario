package Classes;

public class Funcionario {

    private String nome;
    private double salario; // BASE
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularSalario() {
        System.out.println("Salário Base: " + salario);
    }

    public String exibirInfo() {

        return """
                |DADOS FUNCIONÁRIO|
                Nome: %s
                Departamento: %s
                Salário Base: %.2f
                """.formatted(nome, departamento, salario);
    }
}

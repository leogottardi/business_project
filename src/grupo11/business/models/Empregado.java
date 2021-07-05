package grupo11.business.models;

public class Empregado extends Pessoa {
    private int numeroSeccao;
    private float salarioBase;
    private float iRS;

    public Empregado(
        String nome,
        long contribuinte,
        int idade,
        int numeroSeccao,
        float salarioBase,
        float iRS,
        CodigoPostal codigoPostal) {
        super(nome, contribuinte, idade, codigoPostal);
        this.numeroSeccao = numeroSeccao;
        this.salarioBase = salarioBase;
        this.iRS = iRS;
    }

    public int getNumeroSeccao() {
        return numeroSeccao;
    }

    public void setNumeroSeccao(int numeroSeccao) {
        this.numeroSeccao = numeroSeccao;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getiRS() {
        return iRS;
    }

    public void setiRS(float iRS) {
        this.iRS = iRS;
    }

    public float calcularSalario(){

        return salarioBase - iRS;
    }

    public String mostrar() {
        String infoEmpregado = "\n    > Nome: " + this.getNome() +
                "\n    > Contribuinte: " + this.getContribuinte() +
                "\n    > Idade: " + this.getIdade() +
                "\n    > Numero de Secao: " + this.getNumeroSeccao() +
                "\n    > Salario Base: " + this.getSalarioBase() +
                "\n    > IRS: " + this.getiRS() +
                "\n    > Codigo Postal: " + this.getCodigoPostal().mostrar();

        return infoEmpregado;
    }
}

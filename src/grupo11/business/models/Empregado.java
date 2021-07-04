package grupo11.business.models;

public class Empregado extends Pessoa {

    private int numeroSeccao;

    private float salarioBase;

    private float iRS;

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
}

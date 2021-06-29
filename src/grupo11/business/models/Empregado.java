package grupo11.business.models;

public class Empregado extends Pessoa {

    private int numeroSeccao;

    private float salarioBase;

    private float iRS;

    public int getNumeroSeccao() {
        return numeroSeccao;
    }

    public void setNumeroSeccao(int n) {
        this.numeroSeccao = n;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float s) {
        this.salarioBase = s;
    }

    public float getiRS() {
        return iRS;
    }

    public void setiRS(float i) {
        this.iRS = i;
    }


    public float calcularSalario(){

        return salarioBase - iRS;
    }
}

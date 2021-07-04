package grupo11.business.models;

public class Cliente extends Pessoa {

    private float plafond;
    private float valorEmDivida;

    public Cliente(
        float plafond, 
        float valorEmDivida, 
        String nome, 
        long contribuinte, 
        int idade, 
        CodigoPostal codigoPostal
        ) {
        super(nome, contribuinte, idade, codigoPostal);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;
    }

    public float getPlafond() {
        return plafond;
    }

    public void setPlafond(float p) {
        this.plafond = p;
    }

    public float getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(float v) {
        this.valorEmDivida = v;
    }

    public float obterSaldo() {

        return plafond - valorEmDivida;
    }
}

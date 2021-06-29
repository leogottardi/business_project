package grupo11.business.models;

import grupo11.business.models.Fornece;

public class Fornecedor extends Pessoa {
    private float plafond; // limite de crédito ou limite máximo de despesas, ou seja, um teto
    private float valorEmDivida;
    private Fornece[] fornece; //todo keep it?

    public float getPlafond() {
        return plafond;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

    public float getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

    public float obterSaldo() {
        return 0;
    }

    public void addFornece(Fornece c) {

    }

    public void removeFornece(int i) {

    }

    public Fornece[] getFornece(int i) {
        return fornece;
    }

    public void mostraFornece() {

    }
}

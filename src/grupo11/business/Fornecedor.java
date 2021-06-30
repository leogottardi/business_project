package grupo11.business;

import grupo11.business.models.Fornece;

public class Fornecedor {
    private float plafond;
    private float valorEmDivida;
    private Fornece[] fornece;

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

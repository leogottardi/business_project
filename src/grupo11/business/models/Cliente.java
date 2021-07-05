package grupo11.business.models;

public class Cliente extends Pessoa {
    private float plafond;
    private float valorEmDivida;

    public Cliente(
        String nome,
        long contribuinte,
        int idade,
        float plafond,
        float valorEmDivida,
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

    public String mostrar() {
        String infoCliente = "\n    > Nome: " + this.getNome() +
                "\n    > Contribuinte: " + this.getContribuinte() +
                "\n    > Idade: " + this.getIdade() +
                "\n    > Limite de Crédito: " + this.getPlafond() +
                "\n    > Valor em Dívida: " + this.valorEmDivida +
                "\n    > Codigo Postal: " + this.getCodigoPostal().mostrar();

        return infoCliente;
    }
}

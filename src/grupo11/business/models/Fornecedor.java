package grupo11.business.models;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {
    private float plafond; // limite de crédito ou limite máximo de despesas, ou seja, um teto
    private float valorEmDivida;
    private List<Fornece> fornecimentos = new ArrayList<>();

    public Fornecedor(
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
        float saldo = this.getPlafond() - this.getValorEmDivida();

        return  saldo;
    }

    public void addFornece(Fornece fornecimento) {
        this.fornecimentos.add(fornecimento);
    }

    public String listarFornecimentos() {
        String fornecimentos = "";

        for (Fornece fornecimento : this.fornecimentos) {
            String infoFornecimento = fornecimento.mostrar();
            fornecimentos += infoFornecimento;
        }

        return fornecimentos;
    }

    public String mostrar() {
        String infoFornecedor = "\n    > Nome: " + this.getNome() +
                "\n    > Contribuinte: " + getContribuinte() +
                "\n    > Idade: " + getIdade() +
                "\n    > Limite de Credito: " + this.getPlafond() +
                "\n    > Valor em Divida: " + this.getValorEmDivida() +
                "\n    > Codigo Postal: " + this.getCodigoPostal().mostrar() +
                "\n    > Fornecimentos: " + this.listarFornecimentos();

        return infoFornecedor;
    }
}

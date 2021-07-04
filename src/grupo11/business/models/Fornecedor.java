package grupo11.business.models;

import grupo11.business.models.Fornece;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {
    private float plafond; // limite de crédito ou limite máximo de despesas, ou seja, um teto
    private float valorEmDivida;
    private List<Fornece> fornecimentos = new ArrayList<Fornece>();

    public Fornecedor(
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

    public List<String> listarFornecimentos() {
        List<String> fornecimentos = new ArrayList<String>();

        for (Fornece fornecimento : this.fornecimentos) {
            String infoFornecimento = "Materia Prima: " + fornecimento.getMateria().mostrar() +
                    "\nQuantidade: " + fornecimento.getQuantidade() +
                    "\nData: " + fornecimento.getData();

            fornecimentos.add(infoFornecimento);
        }

        return fornecimentos;
    }

}

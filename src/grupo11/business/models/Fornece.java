package grupo11.business.models;

import java.time.LocalDateTime;

public class Fornece {
    private Fornecedor fornecedor;
    private MateriaPrima materiaPrima;
    private int quantidade;
    private LocalDateTime data;

    public Fornece(Fornecedor fornecedor, MateriaPrima materiaPrima, int quantidade) {
        this.fornecedor = fornecedor;
        this.materiaPrima = materiaPrima;
        this.quantidade = quantidade;
        this.data = LocalDateTime.now();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String mostrar() {
        String infoFornece = "\n    > Materia Prima: " + this.getMateriaPrima().mostrar() +
                "\n    > Quantidade: " + this.getQuantidade() +
                "\n    > Data: " + this.getData() + "\n";

        return infoFornece;
    }
}

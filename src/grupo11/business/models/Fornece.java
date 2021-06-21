package grupo11.business.models;

public class Fornece {
    private Fornecedor fornecedor;
    private MateriaPrima materia;
    private int quantidade;
    private int data;

    public void mostrar() {

    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public MateriaPrima getMateria() {
        return materia;
    }

    public void setMateria(MateriaPrima materia) {
        this.materia = materia;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

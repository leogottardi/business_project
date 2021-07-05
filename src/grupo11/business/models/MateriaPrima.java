package grupo11.business.models;

public class MateriaPrima {
    private String origem;
    private int codigo;
    private float custo;

    public MateriaPrima(String origem, int codigo, float custo) {
        this.origem = origem;
        this.codigo = codigo;
        this.custo = custo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public String mostrar() {
        String infoMateriaPrima = "Origem: " + this.getOrigem() +
                ", Codigo: " + this.getCodigo() +
                ", Custo: " + this.getCusto() + ".";

        return infoMateriaPrima;
    }
}

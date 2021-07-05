package grupo11.business.models;

public class Produto
{
    private String designacao;
    private float precoVendaPublico;
    private int stock;

    public Produto(String designacao, float precoVendaPublico, int stock) {
        this.designacao = designacao;
        this.precoVendaPublico = precoVendaPublico;
        this.stock = stock;
    }

    public String getDesignacao()
    {
        return designacao;
    }

    public void setDesignacao(String designacao)
    {
        this.designacao = designacao;
    }

    public float getPrecoVendaPublico()
    {
        return precoVendaPublico;
    }

    public void setPrecoVendaPublico(float precoVendaPublico)
    {
        this.precoVendaPublico = precoVendaPublico;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public String mostrar() {
        String infoProduto = "\n    > Designacao: " + this.getDesignacao() +
                "\n    > Preço de venda: " + this.getPrecoVendaPublico() +
                "\n    > Estoque: " + this.getStock() + "\n";

        return infoProduto;
    }
}

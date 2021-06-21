package grupo11.business.models;

public class Produto
{
    private String designacao;
    private float precoVendaPublico;
    private int stock;

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
}

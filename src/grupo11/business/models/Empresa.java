package grupo11.business.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Empresa
{
    private String nome;
    private LocalDateTime dataFundacao;
    private CodigoPostal codigoPostal;
    private HashMap<String, Pessoa> funcionarios = new HashMap<String, Pessoa>();
    private List<Produto> produtos = new ArrayList<Produto>();

    public Empresa(String nome, LocalDateTime dataFundacao, CodigoPostal codigoPostal) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.codigoPostal = codigoPostal;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public LocalDateTime getDataFundacao()
    {
        return this.dataFundacao;
    }

    public void setDataFundacao(LocalDateTime dataFundacao)
    {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(CodigoPostal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public List<String> listarProdutos() {
        List<String> produtos = new ArrayList<String>();

        for(int i = 0; i < this.produtos.size(); i++) {
            Produto produto = this.produtos.get(i);

            String infoProduto = "Designacao: " + produto.getDesignacao() +
            "\nPreço de venda: " + produto.getPrecoVendaPublico() +
            "\nEstoque: " + produto.getStock();

            produtos.add(infoProduto);
        }

        return produtos;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }
}

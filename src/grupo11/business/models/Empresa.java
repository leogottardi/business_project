package grupo11.business.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Empresa
{
    private String nome;
    private LocalDateTime dataFundacao;
    private CodigoPostal codigoPostal;
    private List<Produto> produtos = new ArrayList<Produto>();
    private List<Empregado> empregados = new ArrayList<Empregado>();
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

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

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public List<String> listarProdutos() {
        List<String> produtos = new ArrayList<String>();

        for (Produto produto : this.produtos) {
            String infoProduto = "Designacao: " + produto.getDesignacao() +
                    "\nPreço de venda: " + produto.getPrecoVendaPublico() +
                    "\nEstoque: " + produto.getStock();

            produtos.add(infoProduto);
        }

        return produtos;
    }

    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public List<String> listarEmpregados() {
        List<String> empregados = new ArrayList<String>();

        for (Empregado empregado : this.empregados) {
            String infoEmpregado = "Nome: " + empregado.getNome() +
                    "\nIdade: " + empregado.getIdade() +
                    "\nSalário: " + empregado.calcularSalario();

            empregados.add(infoEmpregado);
        }

        return empregados;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<String> listarClientes() {
        List<String> clientes = new ArrayList<String>();

        for (Cliente cliente : this.clientes) {
            String infoCliente = "Nome: " + cliente.getNome() +
                    "\nIdade: " + cliente.getIdade() +
                    "\nPlafond: " + cliente.getPlafond();

            clientes.add(infoCliente);
        }

        return clientes;
    }

    public void addFornecedor(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
    }

    public void listarFornecedores() {

    }
}
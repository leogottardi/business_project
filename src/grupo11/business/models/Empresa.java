package grupo11.business.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private LocalDateTime dataFundacao;
    private CodigoPostal codigoPostal;
    private final List<Produto> produtos = new ArrayList<>();
    private final List<Empregado> empregados = new ArrayList<>();
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Fornecedor> fornecedores = new ArrayList<>();

    public Empresa(String nome, LocalDateTime dataFundacao, CodigoPostal codigoPostal) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.codigoPostal = codigoPostal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(LocalDateTime dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCodigoPostal() {
        return this.codigoPostal;
    }

    public void setCodigoPostal(CodigoPostal codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<String> listarProdutos() {
        List<String> produtos = new ArrayList<>();

        for (Produto produto : this.produtos) {
            produtos.add(produto.mostrar());
        }

        return produtos;
    }

    public void addEmpregado(Empregado empregado) {
        this.empregados.add(empregado);
    }

    public List<String> listarEmpregados() {
        List<String> empregados = new ArrayList<>();

        for (Empregado empregado : this.empregados) {

            empregados.add(empregado.mostrar());
        }

        return empregados;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<String> listarClientes() {
        List<String> clientes = new ArrayList<>();

        for (Cliente cliente : this.clientes) {
            clientes.add(cliente.mostrar());
        }

        return clientes;
    }

    public void addFornecedor(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
    }

    public List<String> listarFornecedores() {
        List<String> fornecedores = new ArrayList<>();

        for(Fornecedor fornecedor : this.fornecedores) {
            fornecedores.add(fornecedor.mostrar());
        }
        return fornecedores;
    }
}

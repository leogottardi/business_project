package grupo11.business;

import java.time.LocalDateTime;
import java.util.List;

import grupo11.business.models.*;

public class Main {
    public static void main(String[] args) {

        // Criando empresa
        CodigoPostal codigoPostal = new CodigoPostal(1, 1, "Zona 1");
        Empresa empresa = new Empresa("Nome Empresa", LocalDateTime.now(), codigoPostal);

        // Adicionando produto na empresa
        Produto p1 = new Produto("Designacao 1", 3000.20f, 3);
        Produto p2 = new Produto("Designacao 2", 500.20f, 8);
        empresa.addProduto(p1);
        empresa.addProduto(p2);

        // Adicionando empregado na empresa
        Empregado empregado1 = new Empregado("Leonardo", 100, 30, 798546,1000.00f, 10.00f, codigoPostal);
        empresa.addEmpregado(empregado1);

        // Adicionando cliente na empresa
        Cliente cliente = new Cliente("Lucas", 2302, 19, 1034.23f, 30.32f, codigoPostal);
        empresa.addCliente(cliente);

        // Adicionando fornecedor a empresa
        Fornecedor fornecedor = new Fornecedor("Sorveteiro", 456, 45, 4500f, 15, codigoPostal);
        empresa.addFornecedor(fornecedor);

        //Adicionar Materia Prima
        MateriaPrima materiaPrima = new MateriaPrima("Pedra", 213546, 15000.0f);
        MateriaPrima materiaPrima2 = new MateriaPrima("Sabao em Po", 213545, 7000.0f);

        // Criacao de Fornece
        Fornece fornece = new Fornece(fornecedor, materiaPrima, 8);
        Fornece fornece2 = new Fornece(fornecedor, materiaPrima2, 10);
        fornecedor.addFornece(fornece);
        fornecedor.addFornece(fornece2);

        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("-----------------------------");
        System.out.print("Produtos:");
        
        // Listando Produtos
        List<String> produtos = empresa.listarProdutos();
        for(int i = 0; i < produtos.size(); i ++) {
            System.out.print(produtos.get(i));
        }

        System.out.println("-----------------------------");
        // Listando Empregados
        List<String> empregados = empresa.listarEmpregados();

        System.out.print("Empregados: \n");
        for(int i = 0; i < empregados.size(); i ++) {
            System.out.println(empregados.get(i));
            System.out.println("");
        }
        
        System.out.println("-----------------------------");
        // Listando Clientes
        List<String> clientes = empresa.listarClientes();

        System.out.print("Clientes: \n");
        for(int i = 0; i < clientes.size(); i ++) {
            System.out.println(clientes.get(i));
            System.out.println("");
        }

        System.out.println("-----------------------------");
        // Listando Fornecedor
        List<String> fornecedores = empresa.listarFornecedores();

        System.out.print("Fornecedores: \n");
        for(int i = 0; i < fornecedores.size(); i ++) {
            System.out.println(fornecedores.get(i));
            System.out.println("");
        }
    }
}

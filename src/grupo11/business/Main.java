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
        Empregado empregado1 = new Empregado(1, 1000.00f, 10.00f, "Leonardo", 100, 30, codigoPostal);
        empresa.addEmpregado(empregado1);

        // Adicionando cliente na empresa
        Cliente cliente = new Cliente(1034.23f, 30.32f, "Lucas", 2302, 19, codigoPostal);
        empresa.addCliente(cliente);

        
        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("-----------------------------");
        System.out.println("Produtos: \n");
        
        // Listando Produtos
        List<String> produtos = empresa.listarProdutos();
        for(int i = 0; i < produtos.size(); i ++) {
            System.out.println(produtos.get(i));
            System.out.println("");
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
        
    }
}

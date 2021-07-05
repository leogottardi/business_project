package grupo11.business;

import java.time.LocalDateTime;
import java.util.List;

import grupo11.business.models.*;

public class Main {
    public static void main(String[] args) {

        // Criando empresa
        CodigoPostal codigoPostal1 = new CodigoPostal(1, 1, "Zona 1");
        CodigoPostal codigoPostal2 = new CodigoPostal(2, 2, "Zona 2");
        CodigoPostal codigoPostal3 = new CodigoPostal(3, 3, "Zona 3");
        CodigoPostal codigoPostal4 = new CodigoPostal(4, 4, "Zona 4");
        CodigoPostal codigoPostal5 = new CodigoPostal(5, 5, "Zona 5");
        CodigoPostal codigoPostal6 = new CodigoPostal(6, 5, "Zona 6");
        CodigoPostal codigoPostal7 = new CodigoPostal(7, 5, "Zona 7");
        Empresa empresa = new Empresa("Nome Empresa", LocalDateTime.now(), codigoPostal1);

        // Adicionando produto na empresa
        Produto p1 = new Produto("Designacao 1", 3000.20f, 3);
        Produto p2 = new Produto("Designacao 2", 500.20f, 8);
        empresa.addProduto(p1);
        empresa.addProduto(p2);

        // Adicionando empregado na empresa
        Empregado empregado1 = new Empregado("Lucas", 100, 30, 798546, 2842.00f, 10.00f, codigoPostal2);
        Empregado empregado2 = new Empregado("Renato", 694, 28, 236152, 2365.00f, 329.00f, codigoPostal3);
        empresa.addEmpregado(empregado1);
        empresa.addEmpregado(empregado2);

        // Adicionando cliente na empresa
        Cliente cliente1 = new Cliente("Lorena", 2302, 19, 1034.23f, 30.32f, codigoPostal4);
        Cliente cliente2 = new Cliente("Rafaela", 3235, 68, 2572.23f, 92.32f, codigoPostal5);
        empresa.addCliente(cliente1);
        empresa.addCliente(cliente2);

        // Adicionando fornecedor a empresa
        Fornecedor fornecedor1 = new Fornecedor("Baiano", 745, 65, 8535.40f, 76, codigoPostal6);
        Fornecedor fornecedor2 = new Fornecedor("Japonês", 213, 45, 4500.48f, 15, codigoPostal7);
        empresa.addFornecedor(fornecedor1);
        empresa.addFornecedor(fornecedor2);

        // Adicionar Materia Prima
        MateriaPrima materiaPrima1 = new MateriaPrima("Coco", 765854, 2946.0f);
        MateriaPrima materiaPrima2 = new MateriaPrima("Mangaba", 24862, 7000.0f);

        MateriaPrima materiaPrima3 = new MateriaPrima("Pastel", 42917, 84531.03f);
        MateriaPrima materiaPrima4 = new MateriaPrima("Coxinha", 921752, 391752.02f);

        // Criacao de Fornececimento fornecedor1
        Fornece fornece1 = new Fornece(fornecedor1, materiaPrima1, 8);
        Fornece fornece2 = new Fornece(fornecedor1, materiaPrima2, 10);
        fornecedor1.addFornece(fornece1);
        fornecedor1.addFornece(fornece2);

        // Criacao de Fornececimento fornecedor2
        Fornece fornece3 = new Fornece(fornecedor2, materiaPrima3, 8);
        Fornece fornece4 = new Fornece(fornecedor2, materiaPrima4, 10);
        fornecedor2.addFornece(fornece3);
        fornecedor2.addFornece(fornece4);

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

        System.out.print("Empregados:");
        for(int i = 0; i < empregados.size(); i ++) {
            System.out.println(empregados.get(i));
            System.out.println("");
        }
        
        System.out.println("-----------------------------");
        // Listando Clientes
        List<String> clientes = empresa.listarClientes();

        System.out.print("Clientes:");
        for(int i = 0; i < clientes.size(); i ++) {
            System.out.println(clientes.get(i));
            System.out.println("");
        }

        System.out.println("-----------------------------");
        // Listando Fornecedor
        List<String> fornecedores = empresa.listarFornecedores();

        System.out.print("Fornecedores:");
        for(int i = 0; i < fornecedores.size(); i ++) {
            System.out.println(fornecedores.get(i));
            System.out.println("");
        }
    }
}

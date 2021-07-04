package grupo11.business;

import java.time.LocalDateTime;
import java.util.List;

import grupo11.business.models.*;

public class Main {

    public static void main(String[] args) {

        CodigoPostal codigoPostal = new CodigoPostal(1, 1, "Zona 1");

       Empresa empresa = new Empresa("Nome Empresa", LocalDateTime.now(), codigoPostal);
        Produto p1 = new Produto("Designacao 1", 3000, 3);
       empresa.addProduto(p1);

       List<String> produtos = empresa.listarProdutos();
        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("Produtos: \n");

       for(int i = 0; i < produtos.size(); i ++) {
           System.out.println(produtos.get(i));
       }
    }
}

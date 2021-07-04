package grupo11.business;

import java.time.LocalDateTime;

import grupo11.business.models.*;

public class Main {

    public static void main(String[] args) {

        CodigoPostal codigoPostal = new CodigoPostal(1, 1, "Zona 1");

       Empresa empresa = new Empresa("Nome Empresa", LocalDateTime.now(), codigoPostal);

       System.out.println("Empresa: " + empresa.getNome());
    }
}

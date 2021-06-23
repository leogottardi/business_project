package grupo11.business;

import grupo11.business.models.Empregado;

public class Main {

    public static void main(String[] args) {

        Empregado empregado = new Empregado();

        empregado.setNome("Aroldo");

        System.out.println(empregado.getNome());

    }
}

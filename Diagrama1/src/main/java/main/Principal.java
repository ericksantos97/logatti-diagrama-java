package main;

import model.AnalistaTI;
import model.Cliente;
import model.Gerente;

public class Principal {

    public static void main(String[] args) {

        final Cliente c = new Cliente();
        c.setId(1);
        c.setNome("Gabriel Toledo");
        c.setTelefone("16 98235-8976");
        c.setLimite(1500.00);

        final Gerente g = new Gerente();
        g.setId(1);
        g.setNome("Orlando Silva");
        g.setTelefone("11 99234-8922");
        g.setSetor("Administrativo");
        g.setSalario(8000.00);

        final AnalistaTI a = new AnalistaTI();
        a.setId(1);
        a.setNome("Luis Henrique");
        a.setTelefone("16 99113-9485");
        a.setSalario(4000.00);
        a.setTecnologia("Java EE");

        System.out.println("Lista de Pessoas: \n");
        System.out.println("Cliente: " + c.getNome() + "\n" + "Gerente: " + g.getNome() + "\n" + "AnalistaTI: " + a.getNome());

    }

}

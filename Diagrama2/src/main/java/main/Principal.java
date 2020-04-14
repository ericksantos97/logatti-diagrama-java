package main;

import model.*;

public class Principal {

    public static void main(String[] args) {

        final Estado es = new Estado();
        es.setId(1);
        es.setUf("SP");
        es.setDescricao("São Paulo");

        final Endereco end = new Endereco();
        end.setId(1);
        end.setBairro("Centro");
        end.setEstado(es);

        final Endereco end2 = new Endereco();
        end2.setId(2);
        end2.setBairro("Morumbi");
        end2.setEstado(es);

        final Cliente c = new Cliente();
        c.setId(1);
        c.setNome("Gabriel Toledo");
        c.setTelefone("16 98235-8976");
        c.setLimite(1500.00);
        c.setEndereco(end);

        final Gerente g = new Gerente();
        g.setId(1);
        g.setNome("Orlando Silva");
        g.setTelefone("11 99234-8922");
        g.setSetor("Administrativo");
        g.setSalario(8000.00);
        g.setEndereco(end);

        final AnalistaTI a = new AnalistaTI();
        a.setId(1);
        a.setNome("Luis Henrique");
        a.setTelefone("16 99113-9485");
        a.setSalario(4000.00);
        a.setTecnologia("Java EE");
        a.setEndereco(end2);

        System.out.println("Lista de Pessoas e seus Endereços: \n");
        System.out.println("Cliente: " + c.getNome() + " Localidade:" + c.getEndereco().getBairro() + "\n"
                + "Gerente: " + g.getNome() + " Localidade:" + g.getEndereco().getBairro() + "\n"
                + "AnalistaTI: " + a.getNome() + " Localidade:" + a.getEndereco().getBairro());

    }

}

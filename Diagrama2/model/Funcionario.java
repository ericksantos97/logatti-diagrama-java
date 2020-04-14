package model;

public abstract class Funcionario extends Pessoa {

    Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}


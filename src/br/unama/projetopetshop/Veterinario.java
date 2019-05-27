package br.unama.projetopetshop;

public class Veterinario {
    private String nome, cpf, crmv, especialidade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void examinar(){System.out.println("Médico no consultório"); }
    public void operar(){
        System.out.println("Médico em cirurgia");
    }
    public void castrar(){System.out.println("Médico em procedimento de castração"); }
    public void vacinar(){
        System.out.println("Médico vacinando animal");
    }
}

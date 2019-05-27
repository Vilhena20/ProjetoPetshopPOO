package br.unama.projetopetshop;

public class Funcionario {
    private String nome, cpf, tel, funcao;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void agendar(){
    }
    public void entregarPedido(){
    }
    public void emitirNf(){
    }
    public void cadastrarCliente(){
    }
    public void consultarEstoque(){
    }
    public void abrirCx(){
    }
    public void fecharCx(){
    }
}

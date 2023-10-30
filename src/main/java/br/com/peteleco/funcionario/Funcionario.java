package br.com.peteleco.funcionario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 09869114709
 */
@Entity
@Table(name="funcionarios")
public class Funcionario {
    //JavaBeans
        /*
            - construtor vazio (sem parametros)
            - construtor cheio (com parametros)
            - get e set 
            - toString
        */  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String nome;
    private String cargo;
    private int cpf;
    private String endereco;
    private int telefone;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, int cpf, String endereco,int telefone, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" + "codigo=" + codigo + ", nome=" + nome + ", cargo=" + cargo + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", salario=" + salario + '}';
    }

    
}

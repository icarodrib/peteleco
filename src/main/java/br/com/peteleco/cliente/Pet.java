package br.com.peteleco.cliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="pets")
public class Pet {
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
    private int idade;
    private float peso;
    private String tipo;
    private String raca;
    private String sexo;
    
    @ManyToOne
    @JoinColumn(name = "cod_cli", referencedColumnName = "codigo") // cod_cli é a chave estrangeira na tabela pets, e código é a chave primária na tabela clientes
    private Cliente cliente;

    public Pet() {
    }

    public Pet(String nome, int idade, float peso, String tipo, String raca, String sexo, Cliente cliente) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.tipo = tipo;
        this.raca = raca;
        this.sexo = sexo;
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public String getSexo() {
        return sexo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pet{" + "codigo=" + codigo + ", nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", tipo=" + tipo + ", raca=" + raca + ", sexo=" + sexo + ", cliente=" + cliente + '}';
    }


    
}

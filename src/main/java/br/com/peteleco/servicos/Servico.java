package br.com.peteleco.servicos;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="servicos")
public class Servico {
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
    private float valor;
    private LocalDate cadastro;

    public Servico() {
    }

    public Servico(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
        this.cadastro = LocalDate.now();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public LocalDate getCadastro() {
        return cadastro;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCadastro(LocalDate cadastro) {
        this.cadastro = cadastro;
    }

    @Override
    public String toString() {
        return "Servico{" + "codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", cadastro=" + cadastro + '}';
    }
    
}

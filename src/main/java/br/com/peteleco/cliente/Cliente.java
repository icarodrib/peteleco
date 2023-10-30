package br.com.peteleco.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="clientes")
public class Cliente {
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
    private String cpf;
    private String endereco;
    private int telefone;
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pet> pets = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco,int telefone) {
        this.nome = nome;
        if (cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido: " + cpf);
        }
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public void adicionarPet(Pet pet) {
    pets.add(pet);
    pet.setCliente(this); 
}

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf.matches("\\d{11}")) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido: " + cpf);
        }
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public String petsToString() {
        StringBuilder petsString = new StringBuilder();
        for (Pet pet : pets) {
            petsString.append(pet.toString()).append(", ");
        }
        // Remove a vírgula e o espaço extra no final
        return petsString.length() > 0 ? petsString.substring(0, petsString.length() - 2) : "";
    }

    
    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", pets=" + pets + '}';
    }

    
}


package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;


@Entity
public class Cargo {
    
    @Id
    @GeneratedValue
    int id;
    String nome;
    @ManyToOne
    Departamento Departamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(Departamento Departamento) {
        this.Departamento = Departamento;
    }
    
    
    
    
    
}

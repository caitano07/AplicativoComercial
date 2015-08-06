
package controller;

import dao.DepartamentoDao;
import dao.DepartamentoDaoImp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Departamento;

@ManagedBean
@SessionScoped
public class DepartamentoController {
    
    List<Departamento> lista = new ArrayList<Departamento>();
    Departamento d = new Departamento();
    String pesq="";

    public List<Departamento> getLista() {
        return lista;
    }

    public void setLista(List<Departamento> lista) {
        this.lista = lista;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
    }

    public String getPesq() {
        return pesq;
    }

    public void setPesq(String pesq) {
        this.pesq = pesq;
    }
    
    
    public String preparaObjeto(){
        setD(new Departamento());
      
    return "departamento?faces-redirect=true";
    }
    
    
    public String adicionar() {
        DepartamentoDao c = new DepartamentoDaoImp();
        c.save(d);
        setD(new Departamento());
        return "departamento?faces-redirect=true";
    }
    
    public List<Departamento> listar() {
        lista = new DepartamentoDaoImp().list(pesq);
        return lista;
    }
    
    
    public String alterar() {
        DepartamentoDao dao = new DepartamentoDaoImp();
        dao.update(d);
        d = new Departamento();
        return "departamento?faces-redirect=true";
    }
    
    public String preparaAlteracao(Departamento m){
        setD(m);
        return "altDepartamento?faces-redirect=true";
    }
    
    public void excluir(Departamento m) {

        DepartamentoDao dao = new DepartamentoDaoImp();
        dao.remove(m);
        
     
    }
    
}

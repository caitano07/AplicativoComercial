package controller;

import dao.MarcaDao;
import dao.MarcaDaoImp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.Marca;

@ManagedBean
@SessionScoped
public class MarcaController {

    List<Marca> lista = new ArrayList<Marca>();
    Marca marca;
    String pesq = "";

    public MarcaController() {
        marca = new Marca();

    }

    public String getPesq() {
        return pesq;
    }

    public void setPesq(String pesq) {
        this.pesq = pesq;
    }

    public List<Marca> getLista() {
        return lista;
    }

    public void setLista(List<Marca> lista) {
        this.lista = lista;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }


    
    public String adicionar() {
        MarcaDao dao = new MarcaDaoImp();
        dao.save(marca);
        marca = new Marca();

        return "marca?faces-redirect=true";
    }

    public void excluir(Marca m) {

        MarcaDao dao = new MarcaDaoImp();
        dao.remove(m);



    }

    public List<Marca> listar() {
        lista = new MarcaDaoImp().list(pesq);
        System.out.println("valor :" + pesq);
        return lista;
    }

    public String alterar() {
        MarcaDao dao = new MarcaDaoImp();
        dao.update(marca);
        marca = new Marca();
        return "marca?faces-redirect=true";
    }
    
    public String preparaAlteracao(Marca m){
    marca=m;
        System.out.println("Marca : "+marca.getNome());
        return "altMarca?faces-redirect=true";
    }
    
    public String preparaObjeto(){
    marca=new Marca();        
    return "marca?faces-redirect=true";
    }
    

}

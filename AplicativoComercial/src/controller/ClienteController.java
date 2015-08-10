package controller;

import dao.ClienteDao;
import dao.ClienteDaoImp;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Cliente;
import model.Endereco;

;

@ManagedBean
@SessionScoped
public class ClienteController {

    List<Cliente> lista = new ArrayList<Cliente>();
    Cliente cliente;
    Endereco end;
    String pesq="";

    public ClienteController() {
        super();
        cliente = new Cliente();
        end = new Endereco();

    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPesq() {
        return pesq;
    }

    public void setPesq(String pesq) {
        this.pesq = pesq;
    }
    
    
    
    public String preparaObjeto(){
        setCliente(new Cliente());
        setEnd(new Endereco());
        
    return "cliente?faces-redirect=true";
    }

    public String adicionar() {
        ClienteDao c = new ClienteDaoImp();
        cliente.setEndereco(end);
        c.save(cliente);
        setCliente(new Cliente());
        setEnd(new Endereco());
        return "cliente?faces-redirect=true";
    }
    
    public List<Cliente> listar() {
        lista = new ClienteDaoImp().list(pesq);
        System.out.println("valor :" + pesq);
        return lista;
    }
    
    
    public String alterar() {
        ClienteDao dao = new ClienteDaoImp();
        dao.update(cliente);
        cliente = new Cliente();
        return "cliente?faces-redirect=true";
    }
    
    public String preparaAlteracao(Cliente m){
        setCliente(m);
        setEnd(m.getEndereco());
        return "altCliente?faces-redirect=true";
    }
    
    public void excluir(Cliente m) {

        ClienteDao dao = new ClienteDaoImp();
        dao.remove(m);
        
     
    }
}

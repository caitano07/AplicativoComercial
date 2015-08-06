


package util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import model.Departamento;
import dao.DepartamentoDaoImp;
import javax.faces.convert.FacesConverter;




@FacesConverter(value="departamentoConverter")
public class DepartamentoConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        System.out.println("VALOR :"+value);
        Departamento d = new DepartamentoDaoImp().getDepartamento(Integer.parseInt(value));
        return d;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Departamento c = (Departamento) o;  
        return String.valueOf( c.getId() );
    }

}

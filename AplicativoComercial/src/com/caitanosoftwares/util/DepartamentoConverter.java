


package com.caitanosoftwares.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.caitanosoftwares.dao.DepartamentoDaoImp;
import com.caitanosoftwares.model.Departamento;




@FacesConverter(value="departamentoConverter")
public class DepartamentoConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        System.out.println("VALOR :"+value);
        Departamento d = new DepartamentoDaoImp().getById(Integer.parseInt(value));
        return d;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Departamento c = (Departamento) o;  
        return String.valueOf( c.getId() );
    }

}




package com.caitanosoftwares.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.caitanosoftwares.dao.MarcaDaoImp;
import com.caitanosoftwares.model.Marca;




@FacesConverter(value="marcaConverter")
public class MarcaConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        
        return new MarcaDaoImp().getById(Integer.parseInt(value));
        
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
    	Marca m = (Marca) o;  
        return String.valueOf( m.getId() );
    }

}

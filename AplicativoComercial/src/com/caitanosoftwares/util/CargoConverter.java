


package com.caitanosoftwares.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.caitanosoftwares.dao.CargoDaoImp;
import com.caitanosoftwares.model.Cargo;




@FacesConverter(value="cargoConverter")
public class CargoConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        Cargo c = new CargoDaoImp().getById(Integer.parseInt(value));
        return c;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Cargo c = (Cargo) o;  
        return String.valueOf( c.getId() );
    }

}

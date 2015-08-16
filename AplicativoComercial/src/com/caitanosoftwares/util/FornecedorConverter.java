


package com.caitanosoftwares.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.caitanosoftwares.dao.FornecedorDaoImp;
import com.caitanosoftwares.model.Fornecedor;




@FacesConverter(value="fornecedorConverter")
public class FornecedorConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        
        return new FornecedorDaoImp().getById(Integer.parseInt(value));
        
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
    	Fornecedor f = (Fornecedor) o;  
        return String.valueOf( f.getId() );
    }

}

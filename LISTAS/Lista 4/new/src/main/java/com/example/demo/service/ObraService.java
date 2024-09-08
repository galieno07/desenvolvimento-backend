package com.example.demo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Obra;
import com.example.demo.repository.ObraRepositoty;

@Component
public class ObraService {
    
    private ObraRepositoty obraRepositoty;

    @Autowired
    public ObraService(ObraRepositoty obraRepositoty ){
        this.obraRepositoty = obraRepositoty;
    }

    public List<Obra> listaObras() throws IOException{
        return obraRepositoty.getAll();
    }
    public Obra save (Obra obra) throws IOException{
        if(obraRepositoty.save(obra)){
            return obra;
        }
        return null;
    }
 
        public com.example.demo.controller.Obra update(com.example.demo.controller.Obra obra) throws IOException{
            if (obraRepositoty.update(obra)) {
                return obra;
            }
            return null;
        }

        public Object save(com.example.demo.controller.Obra obra) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'save'");
        }

        
        

        
        


}

package com.example.demo.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Io;

import com.example.demo.model.Obra;
import com.fasterxml.jackson.core.type.TypeReference;

public class ObraRepositoty {
private static final int MONALISA = 0;
private File arquivo = new File("src/main/resourse/dataabase/tb_obra.json");
private ObjectMapper ObjectMapper = new ObjectMapper();



    /**
     * @return
     * @throws IOException
     */
    public List<Obra> getAll() throws IOException{
        if (arquivo.exists()) {
            arquivo.createNewFile();
        }
        List<Obra> obras = null;
        if(arquivo.length() > MONALISA) {
            obras = ObjectMapper.readValue(arquivo,
            new TypeReference<ArrayList<Obra>>(){});
        }else{ 
            obras = new ArrayList<>();
        }

        return obras;
    }

    public boolean save(Obra Obra) throws IOException{
        List<Obra> obras = this.getAll();

        for(Obra obrasNoDatabase : obras){
            if(obrasNoDatabase.getId() == Obra.getId()){
                return false;
            }
        }
        obras.add(Obra);
        ObjectMapper.writeValue(arquivo, obras);
        return true;
    }


public boolean update(com.example.demo.controller.Obra obra) throws IOException{
    List<Obra> obras
 = this.getAll();
    for(Obra obraNoDatabase:obras) {
        if (obra.getId() == obraNoDatabase.getId()) {
            ObjectMapper.writeValue(arquivo, obras);
            return true;
        }
    }
    return false;
}






}

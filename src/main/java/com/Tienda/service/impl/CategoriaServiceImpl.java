/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service.impl;

/**
 *
 * @author Kimberly Leon
 */
import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();

        if (activos) {
            //Remueve de la lista los elementos donde
            //el atributo activo es false
            lista.removeIf(e -> !e.isActivos());

        }
        return lista;
    }
    import java.util.List ;
    import org.springframework.beans.factory.annotation.Autowired ;
    import org.springframework.stereotype.Service ;
    import org.springframework.transaction.annotation.Transactional ;

    @Service
 

    {
        @
     
        @ 
     
        -20,10 +21,28 @
     
        @ 
     
        public List<Categoria> getCategorias
        (boolean activos
     
        
            ) {
        if (activos) {
                //Remueve de la lista los elementos donde
                //el atributo activo es false
                lista.removeIf(e -> !e.isActivos());
                lista.removeIf(e -> !e.isActivo());

            }
            return lista;
        }

        @Override
        @Transactional(readOnly = true)
        public Categoria getCategoria
        (Categoria categoria
        
            ) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
        }

        @Override
        @Transactional
        public void save
        (Categoria categoria
        
            ) {
        categoriaDao.save(categoria);
        }

        @Override
        @Transactional
        public void delete
        (Categoria categoria
        
            ) {
        categoriaDao.delete(categoria);
        }
    }
}

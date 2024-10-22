/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

/**
 *
 * @author Kimberly Leon
 */
import com.Tienda.domain.Categoria;
import java.util.List;
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
}
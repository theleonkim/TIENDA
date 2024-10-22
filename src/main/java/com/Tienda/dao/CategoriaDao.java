/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.dao;

/**
 *
 * @author Kimberly Leon
 */

import com.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
}
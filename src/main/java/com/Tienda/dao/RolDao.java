/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.dao;

/**
 *
 * @author Kimberly Leon
 */
import com.Tienda.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RolDao extends JpaRepository<Rol, Long> {
}

package com.Tienda.dao;
import com.Tienda.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
public interface facturaDao extends JpaRepository <Factura,Long> {
     
}
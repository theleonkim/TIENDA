/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

/**
 *
 * @author Kimberly Leon
 */
import com.Tienda.domain.Categoria;
import com.Tienda.domain.Producto;
import com.Tienda.service.CategoriaService;
import com.Tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@@ -40,4 +41,64 @@ public String listado(Model model, Categoria categoria) {
        model.addAttribute("categorias", categorias);
        return "/pruebas/listado";
    }
    
    //Los métodos siguientes son para la prueba de consultas ampliadas
    @GetMapping("/consulta")
    public String listado2(Model model) {
        var productos = productoService.getProductos(false);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        return "/pruebas/listado2";
    }
    @PostMapping("/query1")
    public String consultaQuery1(@RequestParam(value = "precioInf") double precioInf,
            @RequestParam(value = "precioSup") double precioSup, Model model) {
        List<Producto> productos = productoService.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        return "/pruebas/listado2";
    }
    
    @PostMapping("/query2")
    public String consultaQuery2(@RequestParam(value = "precioInf") double precioInf,
            @RequestParam(value = "precioSup") double precioSup, Model model) {
        List<Producto> productos = productoService.metodoJPQL(precioInf, precioSup);
        model.addAttribute("productos", productos);        
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        return "/pruebas/listado2";
    }
    
    @PostMapping("/query3")
    public String consultaQuery3(@RequestParam(value = "precioInf") double precioInf,
            @RequestParam(value = "precioSup") double precioSup, Model model) {
        List<Producto> productos = productoService.metodoNativo(precioInf, precioSup);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("precioInf", precioInf);
        model.addAttribute("precioSup", precioSup);
        return "/pruebas/listado2";
    }
    
    @PostMapping("/QueryName")
    public String consultaQueryName(@RequestParam(value = "productName") String nombre, Model model) {
        List<Producto> productos = productoService.busarPorNombre(nombre);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("productName", nombre);
        return "/pruebas/listado2";
    }
    
    @PostMapping("/Existencias")
    public String consultaExistencias(@RequestParam(value = "existencias") Integer existencias, Model model) {
        List<Producto> productos = productoService.busarPorExistencia(existencias);
        model.addAttribute("productos", productos);
        model.addAttribute("totalProductos", productos.size());
        model.addAttribute("existencias", existencias);
        return "/pruebas/listado2";
    }   
}
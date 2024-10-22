/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.controller;

/**
 *
 * @author Kimberly Leon
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String paginaInicio(Model model) {
       // model.addAttribute("attribute", "value");
        return "index";
    }
    @RequestMapping("/contacto")
    public String paginaContacto(Model model) {
       // model.addAttribute("attribute", "value");
        return "info";
    }
    
}

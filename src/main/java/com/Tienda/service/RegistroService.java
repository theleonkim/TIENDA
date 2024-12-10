/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.service;

/**
 *
 * @author Kimberly Leon
 */
import com.Tienda.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
public interface RegistroService {
    //Sirve para el pre-registro
    public Model activar(Model model, String usuario, String clave);
    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
    
    //Completar el proceso de activacion
    public void activar(Usuario usuario, MultipartFile imagenFile);
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}
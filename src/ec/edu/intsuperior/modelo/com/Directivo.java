/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo.com;

import java.util.Date;

/**
 *
 * @author 59398
 */
public class Directivo extends persona{
    
   private String categoria;
   private int idDiretivo;

    public Directivo() {
    }

    public Directivo(String categoria, int idDiretivo, String cedula, String nombre1, String nombre2, String apellido1, String apellido2, Date fechaNacimiento, String direccion, String telefono, String email) {
        super(cedula, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, direccion, telefono, email);
        this.categoria = categoria;
        this.idDiretivo = idDiretivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdDiretivo() {
        return idDiretivo;
    }

    public void setIdDiretivo(int idDiretivo) {
        this.idDiretivo = idDiretivo;
    }
    

  

   
  
   
    
}

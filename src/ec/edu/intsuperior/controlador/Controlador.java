/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.com.cliente;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 59398
 */
public class Controlador {
    
   
    public void menu(){
        Scanner leer = new Scanner (System.in);
        int op=0;
        cliente c1 = new cliente();
        
        do {  
            System.out.println("Bienvenidos al sistema de facturacion\n"
                +"ELIJE UNA OPCIÓN\n"
                + "1 - REGISTRAR CLIENTE\n"
                + "2 - REGISTRAR PRODUCTO\n"
                + "3 - REGISTRAR PROVEEDOR\n"
                + "4 - REGISTRAR TIPO PRODUCTO\n"
                + "5 - SALIR"); 
            op = leer.nextInt();
            switch(op){
                case 1 -> {
                    System.out.println("INGRESE EL NÚMERO DE CÉDULA");
                    c1.setCedula(leer.next());
                    System.out.println("INGRESE EL PRIMER NOMBRE DEL CLIENTE : ");
                    c1.setNombre1(leer.next());
                    System.out.println("INGRESE EL SEGUNDO NOMBRE DEL CLIENTE : ");
                    c1.setNombre2(leer.next());
                }
            case 2 -> {
                System.out.println("INGRESE EL PRIMER NOMBRE DEL CLIENTE : ");
                c1.setNombre1(leer.next());
                }
            case 3 -> {
                }
            case 4 -> {
                }
            case 5 -> System.out.println("LA CEDULA DEL CLIENTE ES : " + c1.getCedula());
            case 6 -> {
                }
            case 7 -> {
                }
            case 12 -> JOptionPane.showMessageDialog(null,"Gracias por utilizar el servicio de facturacion");
        
        }
            
        } while (op != 12);
    
       
    }
    
}

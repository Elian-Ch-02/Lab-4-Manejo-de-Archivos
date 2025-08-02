/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author UCC
 */
public class Empleado {
    private String codigo;
    private String nombre;
    private double sueldo;
    
    
        public Empleado(String codigo, String nombre, double sueldo){
            this.codigo = codigo;
            this.nombre = nombre;
            this.sueldo = sueldo;
        }
        
        public String getCodigo(){
            return codigo;
        }
        
        public void setCodigo(String codigo){
            this.codigo = codigo;
        }
         public String getNombre(){
            return nombre;
        }
        
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
         public double getSueldo(){
            return sueldo;
        }
        
        public void setSueldo(double sueldo){
            this.sueldo = sueldo;
        }
        
        public double deducciones(){
            return getSueldo() * 0.15;
        }
        
        public double totalSalario(){
            return(getSueldo() - deducciones());
        }
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author UCC
 */
public class LogicaNegocio {
    
    private final String ruta = "C:/datos/empleado.txt";
    
    private ArrayList<Empleado> lista = new ArrayList<>();
    
    /**
     * 
     * @param empleado 
     */
    public void agregar(Empleado empleado){
        try(FileWriter fw = new FileWriter(ruta, true)){
            String cadena = empleado.getCodigo() + ":" + empleado.getNombre() + ":" + empleado.getSueldo() + System.lineSeparator();
            fw.write(cadena);
        }catch(IOException ex){
            System.err.println("Error al agregar empleado : " + ex.getMessage());
        }
    }
    
    /**
     * @return 
    */
    public ArrayList<Empleado> leer(){
        lista.clear();
        try (BufferedReader fr = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = fr.readLine())!= null){
            String[] partes = linea.split(":");
            if (partes.length == 3){
                Empleado empleado = new Empleado(partes[0],partes[1], Double.parseDouble(partes[2]));
                lista.add(empleado);
            }else{
                System.err.println("Error de formato en linea : " + linea);
            }
        }
        }catch (IOException | NumberFormatException ex){
            System.err.println("Error al leer Empleados: " + ex.getMessage());
        }
        return lista;
    }
}

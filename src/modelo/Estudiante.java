/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class Estudiante 
{
    private String carnet;
    private String nombre;
    private String correo;

    public Estudiante(String carnet, String nombre, String correo) 
    {
        this.carnet = carnet;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //métodos set y get

    public String getCarnet() 
    {
        return carnet;
    }

    public void setCarnet(String carnet) 
    {
        this.carnet = carnet;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }
    
    
}//fin de la clase

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import modelo.Estudiante;
import modelo.MetodosEstudiantes;
import vista.ManipularEstudiantes;
/**
 *
 * @author estudiante
 */
public class Control_Mantenimiento_Estudiante implements ActionListener{
    
    public final static int CARNET= 1;
    public final static int NOMBRE = 2;
    public final static int CORREO = 3;
    public final static int AGREGAR = 4;
    public final static int BUSCAR = 5;
    public final static int EDITAR = 6;
    public final static int ELIMINAR = 7;
    
    Estudiante estudiante= new Estudiante();
    MetodosEstudiantes metodosestudiantes;
    private String nombre, carnet, correo; 
    private final ManipularEstudiantes maneja_estudiante;
    
    public Control_Mantenimiento_Estudiante(ManipularEstudiantes manejar_estudiantes)
    {
        this.maneja_estudiante = manejar_estudiantes;
    }

    public Control_Mantenimiento_Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        int codigo = this.maneja_estudiante.get_codigo_por_fuente(ae.getSource());
        
        switch(codigo)
        {
            case AGREGAR:
                this.metodosestudiantes.AGREGAR();
            break;
            
            case ELIMINAR:
                this.metodosestudiantes.ELIMINAR();
          
            break;
            
            case BUSCAR:
                this.metodosestudiantes.BUSCAR();
            break;
            
            case EDITAR:
                this.metodosestudiantes.MODIFICAR();
                
            break;
        
         }
    
    }
}


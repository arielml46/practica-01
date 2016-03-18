/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.ManipularEstudiantes;
/**
 *
 * @author Ariel
 */
public class MetodosEstudiantes 
{
   
   private final ArrayList <Estudiante> arrayEstudiantes;
   ManipularEstudiantes manipular_estudiantes;
   
   public MetodosEstudiantes(ManipularEstudiantes manipular_estudiantes)
    {
        this.manipular_estudiantes=manipular_estudiantes;
      arrayEstudiantes=new ArrayList <Estudiante>();  
    }

    public void AGREGAR(String informacion[]) {
          Estudiante temporal=new Estudiante(informacion[0],informacion[1],informacion[2]);
          arrayEstudiantes.add(temporal);
    }
    
    
    public void BUSCAR()
    {
        for(int contador=0; contador<arrayEstudiantes.size(); contador++)
        {
            System.out.println(arrayEstudiantes.get(contador).getInformacion());
        }
    }

    public void CONSULTAR(String arreglo[])
    {
       for(int contador=0; contador<arrayEstudiantes.size();contador++)
       {
           System.out.println("carnet"+arrayEstudiantes.get(contador).getCarnet());
           if(arrayEstudiantes.get(contador).getCarnet().equals(arreglo[0]))
           {
               this.manipular_estudiantes.mostrarInformacion(arrayEstudiantes.get(contador).getNombre(),arrayEstudiantes.get(contador).getCorreo());
           
           }
       }
    
    }
    
   
    
    public void ELIMINAR(String arreglo[])
    {
      for(int contador=0; contador<arrayEstudiantes.size();contador++)
      {
          if(arrayEstudiantes.get(contador).getCarnet().equals(arreglo[0]))
           {
               arrayEstudiantes.remove(contador);
           
           }
          else
          {
              JOptionPane.showMessageDialog(null,"El carnet redactado no se encuentra.");
          }
      }
    }

    
    
}


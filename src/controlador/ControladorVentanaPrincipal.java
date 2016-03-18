/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.ManipularEstudiantes;
/**
 *
 * @author estudiante
 */
public class ControladorVentanaPrincipal implements ActionListener
{
    private final ManipularEstudiantes manejaEstudiante;
    public ControladorVentanaPrincipal() {
        this.manejaEstudiante = new ManipularEstudiantes();
    }
      
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand().equals("Salir"))
        {
            System.exit(0);
        }
        else{
            if(ae.getActionCommand().equals("Manipular estudiantes"))
            {
                 this.manejaEstudiante.setVisible(true);   
            }
        }
        
    }
}

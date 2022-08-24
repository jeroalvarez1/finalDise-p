/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadorModeloDatos;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author jeroa
 */
public class Temporizador extends Thread{
    
    private transient PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public Temporizador() {
        super();
    }
    
    private int segundos = 0;
    private int segundosFin = 10;
    

    public void run() {
        super.run(); 
        do {            
            if(segundos == segundosFin) {
                segundos = segundos + 1;
                propertyChangeSupport.firePropertyChange("segundos", segundos-1, segundos);
            } else {
                if (segundos < segundosFin) {
                    segundos = segundos + 1;
                }
            }
            try {
                this.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        } while (true);
    }
    
    public void setSegundos(int segundos) {
        //int oldSegundos = this.segundos;
        this.segundos = segundos;
        //propertyChangeSupport.firePropertyChange("segundos", oldSegundos, segundos);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }

    public void setSegundosFin(int segundosFin) {
        //int oldSegundosFin = this.segundosFin;
        this.segundosFin = segundosFin;
        //propertyChangeSupport.firePropertyChange("segundosFin", oldSegundosFin, segundosFin);
    } 
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadorModeloDatos;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author jeroa
 */
public abstract class TemporizadorEscuchador implements PropertyChangeListener{

    public TemporizadorEscuchador() {
        super();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt){
        notificar(evt);
    }
    
    public abstract void notificar(PropertyChangeEvent evt);
}

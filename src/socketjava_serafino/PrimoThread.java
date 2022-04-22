/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava_serafino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class PrimoThread extends Thread{
    private int tempo;
    public PrimoThread(int t) {
        this.tempo= t;
    }
    
    @Override
    public void run()
    {
        for(int i=tempo;i>0;i--)
        {
            try {
                System.out.println("Secondi rimasti: "+i);
                sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(PrimoThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }
}
}

      
    




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava_serafino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Client {
    
    Socket so;
    BufferedWriter bw;
    BufferedReader br;
    public Client(InetAddress ip, int porta) {
        
        try {
            so = new Socket(ip,porta);
            br = new BufferedReader(new InputStreamReader(so.getInputStream()));
bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void scrivi(String messaggio)
    {
            try {
                bw.write(messaggio+"\n");
                bw.flush();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    public String leggi()
    {
        
            try {
                return br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                return "Errore";
            }
    }
    

}

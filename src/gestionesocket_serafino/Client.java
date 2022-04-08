/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket_serafino;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Client {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket socket = null;
        try {
            
            //1) richiesta di connessione al server
             socket = new Socket("127.0.0.1",2000);
            System.out.println("Server ha accettato la richiesta, connessione avvenuta con successo"+
                    socket.getRemoteSocketAddress());
            System.out.println("Server ha accettato la richiesta, connessione avvenuta con successo"+
                    socket.getLocalPort());
        }
        catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {

            try {
                if(socket != null)
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket_serafino;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Studente
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket socket = null;
        try {
            // TODO code application logic here
            //1) server in ascolto su una porta
            ServerSocket serverSocket=new ServerSocket(2000);
            System.out.println("Server avviato correttamente, in ascolto");
            //2)server in attesa di connesione            
            socket=serverSocket.accept();
            System.out.println("Server ha accettato la richiesta, connessione avvenuta con successo"+
                    socket.getRemoteSocketAddress());
            //3) scambio dei dati
        } 
        catch (IOException ex) {
            System.err.println("Errore nella creazione del server e nel legame della porta con il sistema di rete");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        //finally, permette della chiusura
        finally {
            //4)chiusura socket, chiusura della connesione del server con un determinato clinet, solo in caso l'oggetto vengo realemente creat, quindi il conrtrollo con null
        try {
            if(socket != null)
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
        
        
        
    }
    
}

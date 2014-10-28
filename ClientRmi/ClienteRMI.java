
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ClienteRMI {
    public static void main(String[] args) throws Exception {
        Registry reg = LocateRegistry.
                getRegistry("127.0.0.1",5001);
        ObjetoRemoto remoto ; 
        remoto = (ObjetoRemoto)reg.lookup("OBJRemoto"); 
        String cadena = remoto.getSaludo("Luis"); 
        System.out.println("El nombre es " + cadena);
    }
}


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ObjetoRemotoImple extends UnicastRemoteObject
implements ObjetoRemoto {

    public ObjetoRemotoImple() throws RemoteException {
        super(); 
    }

 
    @Override
    public String getSaludo(String nombre) throws RemoteException {
            String nombreMayus = nombre.toUpperCase(); 
            return "HOLA SOY RMI Y ME LLAMO " + nombreMayus;
    }
    
}

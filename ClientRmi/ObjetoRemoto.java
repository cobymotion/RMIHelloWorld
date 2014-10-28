
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ObjetoRemoto extends Remote {
 
    public String getSaludo(String nombre) 
            throws RemoteException;
    
}

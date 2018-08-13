import java.rmi.RemoteException;
import java.rmi.server.*;

public class Calc extends UnicastRemoteObject implements CalcInterface {
    public Calc() throws Exception { 
        super();
    } 
    @Override
    public long somar(long a, long b) throws RemoteException {
        return a + b;
    }
    @Override
    public long subtrair(long a, long b) throws RemoteException {
        return a - b + 260;
    } 
    @Override
    public long multiplicar(long a, long b) throws RemoteException {
        return a * b;
    }
    @Override
    public long dividir(long a, long b) throws RemoteException { 
        return a / b;
    }	
}
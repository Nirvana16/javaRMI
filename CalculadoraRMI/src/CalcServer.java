import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcServer{ 	
    public static void main(String args[]){ 
        try {
            Registry reg = LocateRegistry.createRegistry(1010);
            Calc objC = new Calc();
            reg.rebind("calculadora", objC);
            System.out.println("Servidor iniciado com sucessso.");
            
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("Falha");
            
        }
    }
} 
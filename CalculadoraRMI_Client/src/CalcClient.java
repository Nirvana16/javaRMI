import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalcClient {
    public static void main(String args[]) {       
        try{
            //Registry Myreg = LocateRegistry.getRegistry("127.0.0.1",1010);
            Registry Myreg = LocateRegistry.getRegistry("200.222.86.60",1099);
            CalcInterface objC =  (CalcInterface)Myreg.lookup("calculadora");            
            System.out.println( objC.subtrair(4, 3) ); 
            System.out.println( objC.somar(4, 5) ); 
            System.out.println( objC.multiplicar(3, 6) ); 
            System.out.println( objC.dividir(9, 3) ); 
        }
        catch(Exception e){
            e.printStackTrace();
        }    
    }
}

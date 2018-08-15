package emissor;

public class EmissorEmail implements Emissor{
    
    public void envia(String message){
        System.out.println("Enviando por email a msg: ");
        System.out.println(message);
    }
}

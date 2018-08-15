package emissor;

public class EmissorSMS implements Emissor{
    
    public void envia(String message){
            System.out.println("Enviando a mensagem por SMS: ");
            System.out.println(message);
    }
    
}

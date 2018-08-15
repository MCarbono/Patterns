package emissor;

public class EmissorJMS implements Emissor{
    
    public void envia(String message){
        System.out.println("Enviando a mensagem por JMS: ");
        System.out.println(message);
    }
    
}

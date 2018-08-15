/*Resolve o controle de criação de objetos de diversos tipos e com certas
regras para criação*/
package emissor;


public class EmissorTeste {
    
    public Emissor createEmissorSMS(){
        return new EmissorSMS();
    }
    public Emissor createEmissoEmail(){
        return new EmissorEmail();
    }
    
    public EmissorJMS createEmissorJMS(){
        return new EmissorJMS();
    }
    
    public static void main(String[] args) {
        EmissorTeste factory = new EmissorTeste();
        EmissorJMS jus = factory.createEmissorJMS();
    }
}

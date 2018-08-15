/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emissor;

/**
 *
 * @author a1600214
 */
public class TesteFactory {
    public static void main(String[] args) {
        Emissor emissor1 = new EmissorSMS();
        emissor1.envia("K19 treinamento");
        
        Emissor emissor2 = new EmissorEmail();
        emissor2.envia("K19 treinamento");
        
        Emissor emissor3 = new EmissorJMS();
        emissor3.envia("K19 treinamento");
    }
}

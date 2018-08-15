/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author a1600214
 */
public class ControleDePontoAdapter extends ControleDePonto{
    
    private ControleDePontoNovo controleDePontoNovo;
    
    public ControleDePontoAdapter(){
        this.controleDePontoNovo = new ControleDePontoNovo();
    }
    
    public void registraEntrada(Funcionario f){
        this.controleDePontoNovo.registra(f, true);
        super.registraEntrada(f);
    }
    
    public void registraSaida(Funcionario f){
        this.controleDePontoNovo.registra(f, false);
    }
}

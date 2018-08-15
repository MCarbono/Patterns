/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author a1600214
 */
public class ListaDeNomes implements Iterable<String>{
    
    private String[] nomes;
    private int length;
    
    public ListaDeNomes(String[] nomes){
        this.nomes = nomes;
        this.length = this.nomes.length;
    }
    
    public Iterator<String> iterator() {
        return this.new ListaDeNomesIterator();
    }
}

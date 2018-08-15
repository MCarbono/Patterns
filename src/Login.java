/*Singleton. Permite que apenas um objeto da classe login seja
instanciada.*/
public class Login {
    
    public static Login singleton;
    public int i = 0;
    
    private Login(){
        
    }
    
    //Forma de identificar singleton: método abaixo.
    public static Login getInstance(){
        if(singleton == null){
            singleton = new Login();
        }
        
        return singleton;
    }
    public static void main(String[] args) {
        Login lg1 = Login.getInstance();
        lg1.i++;
        Login lg2 = Login.getInstance();
        System.out.println(lg2.i);
    }
}

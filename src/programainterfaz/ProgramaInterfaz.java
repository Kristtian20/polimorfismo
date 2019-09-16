package programainterfaz;

public class ProgramaInterfaz {

    public static void main(String[] args) {
        
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro bu = new Burro();
        hacerCantar(bu);
       
    } 

    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 

    
}

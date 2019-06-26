public class TestaPessoa {
    
    public static void main(String[] args) {
        
        try{
            Pessoa p = new Pessoa("Ciclano", -1);
        }catch(IdadeInvalidaException i){
            
            System.out.println(i.getMessage());
        }
        
        System.out.println("...");
    }    
    
}
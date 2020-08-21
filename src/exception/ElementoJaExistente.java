package exception;

public class ElementoJaExistente extends Exception {
    
    @Override
    public String getMessage(){
        return "Elemento já existente!";
    }
}

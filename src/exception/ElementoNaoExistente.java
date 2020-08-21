package exception;

public class ElementoNaoExistente extends Exception {
    
    @Override
    public String getMessage(){
        return "Elemento não existente!";
    }
}

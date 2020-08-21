package dados;

import exception.ElementoNaoExistente;
import exception.ElementoJaExistente;

public interface IRepositorioVaga{
    
    public void checkIn(String placa) throws ElementoJaExistente;
    
    public void checkOut(String placa) throws ElementoNaoExistente;
    
    public int qtdVagasLivre();
    
    public int getTempoVaga(String placa) throws ElementoNaoExistente;
    
    public void finalizaContadorVaga();  
}

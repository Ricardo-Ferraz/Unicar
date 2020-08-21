package manutenção;

import exception.ElementoJaExistente;
import exception.ElementoNaoExistente;
import dados.IRepositorioVaga;
import dados.RepositorioVaga;

public class ControladorVaga {
    private IRepositorioVaga repVaga;
    
    public ControladorVaga(){
        this.repVaga = new RepositorioVaga();
    }
    
    public void checkIn(String placa) throws ElementoJaExistente{
        this.repVaga.checkIn(placa);
    }
    
    public void checkOut(String placa) throws ElementoNaoExistente{
        this.repVaga.checkOut(placa);
    }
    
    public int qtdVagasLivres(){
        return this.repVaga.qtdVagasLivre();
    }
    
    public int getTempoVaga(String placa) throws ElementoNaoExistente{
       return this.repVaga.getTempoVaga(placa);
    }
    
    public void finalizaContadorVaga(){
        this.repVaga.finalizaContadorVaga();
    }
}

package dados;

import exception.ElementoNaoExistente;
import exception.ElementoJaExistente;
import entidades.Vaga;

public class RepositorioVaga implements IRepositorioVaga{ //Antiga Classe Funcionario
    private Vaga[] vaga;
    private int qtd;
    
    public RepositorioVaga(){
        this.vaga= new Vaga[200];
        this.qtd= 0;
    }
    
    @Override
    public void checkIn(String placa) throws ElementoJaExistente{
        if(buscarCarroInt(placa) == -1){
            this.vaga[this.qtd] = new Vaga();
            this.vaga[this.qtd].setVaga(placa);
            this.vaga[this.qtd].start();
            this.qtd++;
        }
        else{
            throw new ElementoJaExistente();
        }
    }
    
    @Override
    public void checkOut(String placa) throws ElementoNaoExistente{
        int posicao = buscarCarroInt(placa);
        if(posicao != -1){
            this.vaga[posicao].stop();
            this.vaga[posicao] = null;
            this.qtd--;
            for(int i= posicao; i < this.qtd; i++){
                this.vaga[i] = this.vaga[i+1];
            }
        }
        else{
            throw new ElementoNaoExistente();
        }    
    }
    
    @Override
    public int qtdVagasLivre(){
        return 200 - this.qtd;
    }
    
    @Override
    public int getTempoVaga(String placa) throws ElementoNaoExistente{
        if(buscarCarroInt(placa) != -1){
          return this.vaga[buscarCarroInt(placa)].getTempo();
        }
        else{
            throw new ElementoNaoExistente();
        } 
    }
    
    @Override
    public void finalizaContadorVaga(){
        int i;
        
        for(i= 0; i < this.qtd; i++){
            this.vaga[i].stop();
        }
    }
    
    private int buscarCarroInt(String placa){
        int i;
        
        for(i= 0; i < this.qtd; i++){
            if(this.vaga[i].getVaga().equalsIgnoreCase(placa)){
                return i; 
            }
        }
        return -1;
    } 
}

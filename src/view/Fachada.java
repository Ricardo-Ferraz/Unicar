package view;

import exception.ElementoNaoExistente;
import exception.ElementoJaExistente;
import manutenção.Contador;
import manutenção.ControladorAluno;
import manutenção.ControladorVaga;
import manutenção.IFachada;

public class Fachada implements IFachada{
    private ControladorAluno controladorAluno;
    private ControladorVaga controladorVaga;
    private Contador contador;
    
    public Fachada(){
        this.controladorAluno = new ControladorAluno();
        this.controladorVaga = new ControladorVaga();
        this.contador = new Contador();
    }
    
    @Override
    public void inserirAluno(String nome, int matricula, int idade, String cor, String modelo, String placa) throws ElementoJaExistente{
        this.controladorAluno.inserirAluno(nome, matricula, idade, cor, modelo, placa);
    }
    
    @Override
    public void buscarCarro(String placa) throws ElementoNaoExistente{
        this.controladorAluno.buscarCarro(placa);
    }
    
    @Override
    public void checkIn(String placa) throws ElementoJaExistente {
        this.controladorVaga.checkIn(placa);
    }
    
    @Override
    public void checkOut(String placa) throws ElementoNaoExistente{
        this.controladorVaga.checkOut(placa);
    }
    
    @Override
    public int qtdVagasLivres(){
       return this.controladorVaga.qtdVagasLivres();
    }
    
    @Override
    public void iniciaContador(){
        this.contador.start();
    }
    
    @Override 
    public void finalizaContador(){
        this.contador.stop();
    }
    
    @Override
    public int getTempo(){
       return this.contador.getTempo();
    }
    
    @Override
    public int getTempoVaga(String placa) throws ElementoNaoExistente{
        return this.controladorVaga.getTempoVaga(placa);
    }
    
    @Override
    public void finalizaContadorVaga(){
        this.controladorVaga.finalizaContadorVaga();
    } 
}

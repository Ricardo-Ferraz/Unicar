package manutenção;

import exception.ElementoJaExistente;
import exception.ElementoNaoExistente;

public interface IFachada {
    
    public void inserirAluno(String nome, int matricula, int idade, String cor, String modelo, String placa) throws ElementoJaExistente;
    
    public void buscarCarro(String placa) throws ElementoNaoExistente;
    
    public void checkIn(String placa) throws ElementoJaExistente;
    
    public void checkOut(String placa) throws ElementoNaoExistente;
    
    public int qtdVagasLivres();
    
    public void iniciaContador();
    
    public void finalizaContador();
    
    public int getTempoVaga(String placa) throws ElementoNaoExistente;
    
    public void finalizaContadorVaga();
    
    public int getTempo();
}

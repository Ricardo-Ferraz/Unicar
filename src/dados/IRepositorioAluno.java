package dados;

import exception.ElementoNaoExistente;
import exception.ElementoJaExistente;

public interface IRepositorioAluno {
    
    public void inserirAluno(String nome, int matricula, int idade, String cor, String modelo, String placa) throws ElementoJaExistente;
    
    public int buscarCarro(String placa) throws ElementoNaoExistente;    
}

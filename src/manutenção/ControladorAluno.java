package manutenção;

import exception.ElementoJaExistente;
import exception.ElementoNaoExistente;
import dados.IRepositorioAluno;
import dados.RepositorioAluno;

public class ControladorAluno {
    private IRepositorioAluno repAlunos;
    
    public ControladorAluno(){
        this.repAlunos = new RepositorioAluno();
    }
    
    public void inserirAluno(String nome, int matricula, int idade, String cor, String modelo, String placa) throws ElementoJaExistente{
        this.repAlunos.inserirAluno(nome, matricula, idade, cor, modelo, placa);
    }
    
    public void buscarCarro(String placa) throws ElementoNaoExistente{
        this.repAlunos.buscarCarro(placa);   
    } 
}

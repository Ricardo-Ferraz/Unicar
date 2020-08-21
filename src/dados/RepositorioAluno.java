package dados;

import exception.ElementoNaoExistente;
import exception.ElementoJaExistente;
import entidades.Aluno;

public class RepositorioAluno implements IRepositorioAluno{ // Antiga Classe Unicap
    private Aluno[] alunos;
    private int qtd;
  
    public RepositorioAluno(){
        this.alunos = new Aluno[1000];
        this.qtd = 0;
    }
    
    @Override
    public void inserirAluno(String nome, int matricula, int idade, String cor, String modelo, String placa) throws ElementoJaExistente{
        
        if(checaAluno(matricula) == -1 && checaPlaca(placa) == -1){
            Aluno a = new Aluno(nome, matricula, idade, cor, modelo, placa);
            this.alunos[this.qtd] = a;
            this.qtd++;
           }
        else{
            throw new ElementoJaExistente();
        }
    }
        
    @Override
    public int buscarCarro(String placa) throws ElementoNaoExistente{
        int i;
        
        for(i = 0; i < this.qtd; i++){
            if(this.alunos[i].getCarro().getPlaca().equalsIgnoreCase(placa)){
                return i;
            }
        }
        throw new ElementoNaoExistente();
    }
    
    private int checaAluno(int matricula){
        int i;
        
        for(i = 0; i < this.qtd; i++){
            if(this.alunos[i].getMatricula() == matricula){
                return i;
            }
        }
        return -1;
    }
    
    private int checaPlaca(String placa){
        int i;
        
        for(i= 0; i < this.qtd; i++){
           if(this.alunos[i].getCarro().getPlaca().equalsIgnoreCase(placa)){
               return i;
           } 
        }
        return -1;
    }    
}

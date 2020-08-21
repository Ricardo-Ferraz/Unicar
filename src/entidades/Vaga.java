package entidades;

public class Vaga extends Thread{
    
    private String vaga;
    private int tempo;
    
    public Vaga(){
        this.vaga = null;
        this.tempo = 0;
    }

    public int getTempo() {
        return this.tempo;
    }
    
    public String getVaga() {
        return this.vaga;
    }

    public void setVaga(String vaga) {
        this.vaga = vaga;
    }
    
    @Override
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
            }
            this.tempo++;
        }
    }
}

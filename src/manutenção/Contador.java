package manutenção;

public class Contador extends Thread{
    
    private int tempo;
    
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

    public int getTempo() {
        return this.tempo;
    } 
}

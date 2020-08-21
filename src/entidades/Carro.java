package entidades;

public class Carro {
    protected String cor;
    protected String modelo;
    protected String placa;
    
    public Carro(String cor, String modelo, String placa){
        this.cor= cor;
        this.modelo= modelo;
        this.placa= placa;
    }
    
    public String getPlaca(){
        return this.placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString(){
        return "Modelo: "+this.modelo+"/ Cor: "+this.cor+" / Placa: "+this.placa;
    }
}

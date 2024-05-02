package main;

public class Tarjetas {

    private String marca;
    private int numeroTarjeta;
    private String cardHolder;
    private String fechaVencimientoTarjeta;
    
    public Tarjetas(){
        
    }
    
    public Tarjetas(String marca, int numeroTarjeta, String cardHolder, String fechaVencimientoTarjeta) {
        this.cardHolder = cardHolder;
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
        this.marca = marca;
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getFechaVencimientoTarjeta() {
        return fechaVencimientoTarjeta;
    }

    public void setFechaVencimientoTarjeta(String fechaVencimientoTarjeta) {
        this.fechaVencimientoTarjeta = fechaVencimientoTarjeta;
    }

    
    @Override
    public String toString() {
        return "Los datos de la tarjeta son: " + "marca=" + marca + ", numeroTarjeta=" + numeroTarjeta + ", cardHolder=" + cardHolder + ", fechaVencimientoTarjeta=" + fechaVencimientoTarjeta + '}';
    }

}

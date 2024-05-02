
package main;

public class Metodos {
    
    private int año;
    private int mes;
    private int dia;
    private double tasaVisa;
    private double tasaNara;
    private double tasaAmex;
    private double importe;
    
    
    public double calculoTasaVisa() {
        tasaVisa = año / mes;
        return tasaVisa;
    }

    public double calculoTasaNara() {
        tasaNara = (dia * 0.5);
        return tasaNara;
    }

    public double calculoTasaAmex() {
        tasaAmex = mes * 0.1;
        return tasaAmex;

    }
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getTasaVisa() {
        return tasaVisa;
    }

    public void setTasaVisa(double tasaVisa) {
        this.tasaVisa = tasaVisa;
    }

    public double getTasaNara() {
        return tasaNara;
    }

    public void setTasaNara(double tasaNara) {
        this.tasaNara = tasaNara;
    }

    public double getTasaAmex() {
        return tasaAmex;
    }

    public void setTasaAmex(double tasaAmex) {
        this.tasaAmex = tasaAmex;
    }

}

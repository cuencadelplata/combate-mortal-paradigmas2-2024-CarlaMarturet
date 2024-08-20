package com.example.demo;

public class Ejercito {
    private int soldado;
    private int tanque;
    private int buque;
    private int vida;
    private int muerto;
    private int vivo;
    private int disparo;

    public int getMuerto() {
        if (getVida() == 0) {
            setMuerto(1);
        }
        else {
            setVivo(0);
        }
        return muerto;
    }
    public int getVivo() {
        if (getVida() == 1) {
            setVivo(1);
        }
        else {
            setMuerto(0);
        }
        return vivo;
    }
    public void setMuerto(int muerto) {
        this.muerto = muerto;
    }
    public void setVivo(int vivo) {
        this.vivo = vivo;
    }
    

    public Ejercito(int soldado, int tanque, int buque ) {
        this.soldado = soldado;
        this.tanque = tanque;
        this.buque = buque;
    }

    public int getSoldado() {
        return soldado;
    }
    public int getTanque() {
        return tanque;
    }
    public int getBuque() {
        return buque;
    }

    public int getVida() {
        return vida;
    }


    public boolean vidainicial(int vida) {
        setVida(getVida()+vida);
        return false;
       }
       public void setVida(int vida) {
           this.vida = vida;
       }

    public int setDisparo(int i) {
        return disparo = i;
    }
    public int getDisparo() {
        return disparo;
    }

    public  void recibe(int disparo) {
      setVida(getVida()-disparo);
    }
    
    
}

package com.example.demo;

public class Ejercito {
    private int soldado;
    private int tanque;
    private int buque;
    private int vida;
    private int disparo;
    private int vivo;
    private int escudo; 

    public Ejercito(int soldado, int tanque, int buque, int escudo) {
        this.soldado = soldado;
        this.tanque = tanque;
        this.buque = buque;
        this.escudo = escudo;
    }


    public  void recibe(int disparo) {
        if (escudo > 0) {
            escudo -= disparo; 
            if (escudo < 0) { 
                setVida(getVida()+ escudo /2); 
                escudo = 0; 
            }
        } else {
            setVida(getVida() - disparo); 
        }
        if (getVida() <= 0) {
            setMuerto();
        } else { 
            setVivo(); 
        } 
        if(getVida() == 0){

        }

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


    public int getVida() {
        return vida;
    }

    public boolean getMuerto() {
        return getVida() == 0; 
    }
      
    public int setMuerto() {
        return 0;
    }

    public boolean getVivo() {
        return getVida() > 0; 
    }

    public int setVivo() {
        return vivo;
    }
    
    public int getEscudo() {
        return escudo;
    }
    public void setEscudo(int escudo) {
        this.escudo = escudo;
   
    }
}
    

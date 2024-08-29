package com.example.demo;

public class Ejercito {
    private  double vida;
    private int disparo;
    private int vivo;
    private int escudo; 
    
    public Ejercito() {
        
    }


    public Ejercito(int escudo) {
        this.escudo = escudo;
    }


    public  void recibe(int disparo) {
        if (escudo > 0) {
            setVida(getVida()-0.5);
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
        if(getVida() >=0){
            
        }
    

    }

 

    public boolean vidainicial(int vida) {
        setVida(getVida()+vida);
        return false;
       }

    public void setVida(double d) {
           this.vida = d;
    }

    public int setDisparo(int i) {
        return disparo = i;
    }
    
    public int getDisparo() {
        return disparo;
    }


    public double getVida() {
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
    

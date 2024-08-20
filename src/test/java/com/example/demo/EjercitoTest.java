package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EjercitoTest {
    @Test
  void test1() {
    Ejercito buque1 = new  Ejercito(0,0,0);
    Ejercito soldado1 = new  Ejercito(0, 0, 0);
    Ejercito tanque1 = new  Ejercito(0, 0, 0);
    Ejercito disparo = new  Ejercito(0, 0, 0);

    assert buque1.getVida() == 0;
    assert soldado1.getVida() == 0;
    assert tanque1.getVida() == 0;
    assert disparo.getVida() == 0;
    
    }


  @Test
  void test2() {
    Ejercito soldado1= new Ejercito(0, 0, 0);
    Ejercito buque1=  new Ejercito(0, 0, 0);
    Ejercito tanque1= new Ejercito(0, 0, 0);
 
    soldado1.vidainicial(1);
    tanque1.vidainicial(2);
    buque1.vidainicial(3);
  
    assert soldado1.getVida()==1;
    assert tanque1.getVida()==2;
    assert buque1.getVida()==3;

  }
  @Test
  void dispara_tanque() {
    Ejercito soldado1= new Ejercito(0, 0, 0);
    Ejercito tanque1= new Ejercito(0, 0, 0);
   
    tanque1.setVida(2);
    soldado1.setDisparo(1);
    tanque1.recibe(soldado1.getDisparo());
    assert tanque1.getVida()==1;
 
    tanque1.setVida(1);
    soldado1.setDisparo(1);
    tanque1.recibe(soldado1.getDisparo());
    assert tanque1.getVida()==0;

  }
  @Test
  void dispara_soladado() {
    Ejercito soldado1= new Ejercito(0, 0, 0);
    Ejercito tanque1= new Ejercito(0, 0, 0);
   
    soldado1.setVida(1);
    tanque1.setDisparo(1);
    soldado1.recibe(tanque1.getDisparo());
    assert soldado1.getVida()==0;

    }

    @Test
    void dispara_buque() {
      Ejercito soldado1= new Ejercito(0, 0, 0);
      Ejercito tanque1= new Ejercito(0, 0, 0);
     
      soldado1.setVida(3);
      tanque1.setDisparo(1);
      soldado1.recibe(tanque1.getDisparo());
      assert soldado1.getVida()==2;

      soldado1.setVida(2);
      tanque1.setDisparo(1);
      soldado1.recibe(tanque1.getDisparo());
      assert soldado1.getVida()==1;

      soldado1.setVida(1);
      tanque1.setDisparo(1);
      soldado1.recibe(tanque1.getDisparo());
      assert soldado1.getVida()==0;
  
      }
}

package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class EjercitoTest {
    @Test
  void test1() {
    Ejercito buque1 = new  Ejercito(0,0,0,  0);
    Ejercito soldado1 = new  Ejercito(0,0,0,0);
    Ejercito tanque1 = new  Ejercito(0,0,0, 0);
    Ejercito disparo = new  Ejercito(0,0,0, 0);

    assert buque1.getVida() == 0;
    assert soldado1.getVida() == 0;
    assert tanque1.getVida() == 0;
    assert disparo.getVida() == 0;

    }

  @Test
  void test2() {
    Ejercito soldado1= new Ejercito(0, 0, 0, 0);
    Ejercito buque1=  new Ejercito(0, 0, 0, 0);
    Ejercito tanque1= new Ejercito(0, 0, 0, 0);
 
    soldado1.vidainicial(1);
    tanque1.vidainicial(2);
    buque1.vidainicial(3);
  
    assert soldado1.getVida()==1;
    assert tanque1.getVida()==2;
    assert buque1.getVida()==3;
  }

  @Test
  void dispara_tanque() {
    Ejercito soldado1= new Ejercito(0, 0, 0, 0);
    Ejercito tanque1= new Ejercito(0, 0, 0, 0);
   
    tanque1.setVida(2);
    soldado1.setDisparo(1);
    tanque1.recibe(soldado1.getDisparo());
    assert tanque1.getVida()==1;
    assertTrue(tanque1.getVivo());

    tanque1.setVida(1);
    soldado1.setDisparo(1);
    tanque1.recibe(soldado1.getDisparo());
    assert tanque1.getVida()==0;
    assertTrue(tanque1.getMuerto());

  }

  @Test
  void dispara_soladado() {
    Ejercito soldado1= new Ejercito(0, 0, 0,0);
    Ejercito tanque1= new Ejercito(0, 0, 0, 0);
   
    soldado1.setVida(1);
    tanque1.setDisparo(1);
    soldado1.recibe(tanque1.getDisparo());
    assert soldado1.getVida()==0;
    assertTrue(soldado1.getMuerto());

    }

    @Test
    void dispara_buque() {
      Ejercito buque1=  new Ejercito(0, 0, 0,0);
      Ejercito tanque1= new Ejercito(0, 0, 0,0);

      buque1.setVida(3);
      tanque1.setDisparo(1);
      buque1.recibe(tanque1.getDisparo());
      assert buque1.getVida()==2;
      assertTrue(buque1.getVivo());
  
      buque1.setVida(2);
      tanque1.setDisparo(1);
      buque1.recibe(tanque1.getDisparo());
      assert buque1.getVida()==1;
      assertTrue(buque1.getVivo());

      buque1.setVida(1);
      tanque1.setDisparo(1);
      buque1.recibe(tanque1.getDisparo());
      assert buque1.getVida()==0;
      assertTrue(buque1.getMuerto());

      }

  @Test
    void dispara_soladado_con_escudo() {
    Ejercito soldado1= new Ejercito(0, 0,0,3);
    Ejercito tanque1= new Ejercito(0, 0, 0, 0);

    soldado1.setVida(3);
    tanque1.setDisparo(1);
    soldado1.recibe(tanque1.getDisparo());
    assertEquals(2, soldado1.getEscudo()); 
    assertEquals(3, soldado1.getVida()); 
    assertTrue(soldado1.getVivo());  

    tanque1.setDisparo(1);
    soldado1.recibe(tanque1.getDisparo());
    assertEquals(1, soldado1.getEscudo()); 
    assertEquals(3, soldado1.getVida()); 
    assertTrue(soldado1.getVivo());  

    tanque1.setDisparo(1); 
    soldado1.recibe(tanque1.getDisparo());
    assertEquals(0, soldado1.getEscudo()); 
    assertEquals(3, soldado1.getVida()); 
    assertTrue(soldado1.getVivo());  

    tanque1.setDisparo(3); 
    soldado1.recibe(tanque1.getDisparo());
    assertEquals(0, soldado1.getEscudo()); 
    assertEquals(0, soldado1.getVida()); 
    assertTrue(soldado1.getMuerto());  

  }
}
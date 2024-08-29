package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

class EjercitoTest {
 
  @Test
  void dispara_tanque() {
    Soldado soldado1= new Soldado();
    Tanque tanque1= new Tanque();
   
    tanque1.getVida();
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
    Soldado soldado1= new Soldado();
    Tanque tanque1= new Tanque();
   
    soldado1.getVida();
    tanque1.setDisparo(1);
    soldado1.recibe(tanque1.getDisparo());
    assert soldado1.getVida()==0;
    assertTrue(soldado1.getMuerto());

    }

    @Test
    void dispara_buque() {
      Buque buque1= new Buque();
      Tanque tanque1= new Tanque();

      buque1.getVida();
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
    void soldado_adquiere_item_escudo() {
       Soldado soldado1 = new Soldado();

       soldado1.setEscudo(50);
       soldado1.adquirir(soldado1.getEscudo());
       assert soldado1.getVida() == 1;

    }

    @Test 
    void soldado_recibe_danio_con_el_escudo() {
      Soldado soldado1= new Soldado();
      Tanque tanque1= new Tanque();

      soldado1.setVida(1);
      soldado1.setEscudo(50);
      soldado1.adquirir(soldado1.getEscudo());
      assert soldado1.getVida() == 1;
      tanque1.setDisparo(1);
      soldado1.recibe(tanque1.getDisparo());
      assert soldado1.getVida() == 0.5;
      assertTrue(soldado1.getVivo());
      
      tanque1.setDisparo(1);
      soldado1.recibe(tanque1.getDisparo());
      assert soldado1.getVida() == 0;
      assertTrue(soldado1.getMuerto());
      
       

    }

    @Test 
    void chuck_norris_inmortal() {
      ChuckNorris chuck1= new ChuckNorris();
      Tanque tanque1= new Tanque();

      chuck1.setVida(1);
      tanque1.setDisparo(1);
      chuck1.recibirchuck(tanque1.getDisparo()); 
      assert chuck1.getVida() == 1;
      assertTrue(chuck1.getVivo());
    }

}

 


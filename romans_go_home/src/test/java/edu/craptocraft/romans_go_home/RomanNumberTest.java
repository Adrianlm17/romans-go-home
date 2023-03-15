package edu.craptocraft.romans_go_home;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumberTest {
    
    public RomanNumber numRomano;

    @Test
    public void checkX(){
       numRomano = new RomanNumber("X");
       assertEquals(10, numRomano.toDecimal());
    }

    @Test
    public void checkC(){
       numRomano = new RomanNumber("C");
       assertEquals(100, numRomano.toDecimal());
    }

    @Test
    public void checkD(){
       numRomano = new RomanNumber("D");
       assertEquals(500, numRomano.toDecimal());
    }

    @Test
    public void checkM(){
       numRomano = new RomanNumber("M");
       assertEquals(1000, numRomano.toDecimal());
    }

   



    @Test
    public void checkXI(){
       numRomano = new RomanNumber("XI");
       assertEquals(11, numRomano.toDecimal());
    }

    @Test
    public void checkDM(){
       numRomano = new RomanNumber("DM");
       assertEquals(1500, numRomano.toDecimal());
    }

   



   @Test
   public void restaIV(){
      numRomano = new RomanNumber("IV");
       assertEquals(4, numRomano.toDecimal());
   }    

   @Test
   public void restaCD(){
      numRomano = new RomanNumber("CD");
       assertEquals(400, numRomano.toDecimal());
   } 

   



   @Test
   public void expCD(){
      numRomano = new RomanNumber("UDUMU");
       assertEquals(1500, numRomano.toDecimal());
   } 

   @Test
   public void expMMMCD(){
      numRomano = new RomanNumber("_COMPMMICD");
       assertEquals(3501, numRomano.toDecimal());
   } 

}

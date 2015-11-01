import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EnigeliisoheTest {
    
    @Test
    public void tt1() {
      String a,x;
      a = Main.toexuto("This is a test. This is only a test.");
      x = "Toheiso iso a toesoto. Toheiso iso oniliyu a toesoto.";
      assertEquals(x, a);
    }
    
    @Test
    public void tt2() {
      String a,x;
      a = Main.toexuto("This is a test too.");
      x = "Toheiso iso a toesoto tooo.";
      assertEquals(x, a);
    }
    
    @Test
    public void tt3() {
      String a,x;
      a = Main.toexuto("Can you read this after it's translated?");
      x = "Caani yuou roeada toheiso afetoero ito'so toroanisoliatoeda?";
      assertEquals(x, a);
    }
    
    @Test
    public void tt4() {
      String a,x;
      a = Main.toexuto("You may laugh at Bob and Mary for having strange sounding names in Enigeliisohe, but your name probably sounds funny too!");
      x = "Yuou miayu liaugehe ato Baoba anida Miaroyu feoro heavuinige sotoroanigee soounidainige niamieso ini Eniigeeliiisoohee, bauto yuouro niamie poroobaabaliyu soounidaso feuniniyu tooo!";
      assertEquals(x, a);
    }

    @Test
    public void tt5() {
      String a,x;
      a = Main.toexuto("José is a garçon at a café in the cañón.");
      x = "Jiosoé iso a gearoçoni ato a caafeé ini tohee caañóni.";
      assertEquals(x, a);
    }
        
}

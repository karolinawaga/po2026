package lab3.src;

import agh.po.lab3.src.CodingBat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CodingBatTest {

    @Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(8, cb.close10(8,13));
        assertEquals(0, cb.close10(9,9));
        assertEquals(7, cb.close10(1,7));

    }
    @Test
    public void makes10() {
        CodingBat cb = new CodingBat();
        assertEquals(false, cb.makes10(1,8));
        assertEquals(false, cb.makes10(9,9));
        assertEquals(true, cb.makes10(10,1));

    }
}
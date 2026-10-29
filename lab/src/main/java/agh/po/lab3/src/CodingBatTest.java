import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(8, cb.close10(8,13));
        assertEquals(0, cb.close10(9,9));
        assertEquals(7, cb.close10(1,7));

    }
    @org.junit.Test
    public void makes10() {
        CodingBat cb = new CodingBat();
        assertEquals(false, cb.close10(2,8));
        assertEquals(false, cb.close10(9,9));
        assertEquals(true, cb.close10(10,1));

    }
}
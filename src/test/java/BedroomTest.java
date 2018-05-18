import org.junit.Before;
import org.junit.Test;
import roomType.Bedroom;
import roomType.BedroomType;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void(){
        bedroom = new Bedroom(12, BedroomType.DOUBLE);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.capacity());
    }
        
}


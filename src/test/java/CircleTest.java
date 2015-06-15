import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void testArea() throws Exception {
        Circle c1 = new Circle(2);

        assertEquals(0, Double.compare(12.56, c1.area()));
    }
}
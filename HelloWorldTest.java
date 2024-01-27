import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGetGreeting() {
        assertEquals("Hello, World!", HelloWorld.getGreeting());
    }
}

package TestJunit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import MessageUtil.MessageUtil;

public class TestJunit2 {

    String message = "Hello World";
    String message = "Hello World1";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }

}

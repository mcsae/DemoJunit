package TestJunit;

import MessageUtil.MessageUtil;
import org.junit.Assert;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TestJunit {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        message = "New Word";
        assertEquals(message,messageUtil.printMessage());

    }
    }


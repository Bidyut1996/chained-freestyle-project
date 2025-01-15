package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyServiceTest {

    @Test
    public void testGreet() {
        MyService service = new MyService();
        String result = service.greet("World");
        assertEquals("Hello, World!", result);
    }
}

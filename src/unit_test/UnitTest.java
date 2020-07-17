package unit_test;

import builder.Laptop;
import builder.LaptopBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    @DisplayName("Test successful create laptop")
    void testCreateLaptopWithBuilder() {
        Laptop result = new LaptopBuilder().buildCpu("core i9").build();
        Assertions.assertEquals("Laptop [cpu:core i9,ram:null,ssd:null,hhd:null]", result.toString());
    }

    @Test
    @DisplayName("Test not equal create laptop")
    void testCreateLaptopWithBuilder2() {
        Laptop result = new LaptopBuilder().buildCpu("core i").build();
        Assertions.assertNotEquals("Laptop [cpu:core i3,ram:null,ssd:null,hhd:null]", result.toString());
    }

    @Test
    @DisplayName("testExpectedException")
    void testExpectedException() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("One");
        });
    }

}


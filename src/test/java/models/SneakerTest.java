package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SneakerTest {
    @Test
    public void idTest() {
        int expected = 12345;
        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(12345);
        int actual = testSneaker.getId();
        assertEquals(expected, actual);
    }
    public void nameTest() {
        String expected = "Jordan";
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName("Jordan");
        String actual = testSneaker.getName();
        assertEquals(expected, actual);
    }
    public void brandTest() {
        String expected = "Nike";
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand("Nike");
        String actual = testSneaker.getBrand();
        assertEquals(expected, actual);
    }
    public void sportTest() {
        String expected = "Basketball";
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport("Basketball");
        String actual = testSneaker.getSport();
        assertEquals(expected, actual);
    }
    public void sizeTest() {
        int expected = 11;
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(11);
        int actual = testSneaker.getSize();
        assertEquals(expected, actual);
    }
    public void quantityTest() {
        int expected = 10;
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQuantity(10);
        int actual = testSneaker.getQuantity();
        assertEquals(expected, actual);
    }
    public void priceTest() {
        float expected = 129.99f;
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(129.99f);
        float actual = testSneaker.getPrice();
        assertEquals(expected, actual);
    }
}

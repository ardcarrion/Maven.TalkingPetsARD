package io.zipcoder.pets;


import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void constructorTest(){
        String expected = "Zoe";
        Cat cat = new Cat(expected);

        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Zoe";
        Cat cat = new Cat("John");

        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest() {
        String expected = "Purrr...";
        Cat cat = new Cat("Zoe");

        String actual = cat.speak();
        Assert.assertEquals(expected,actual);
    }
}

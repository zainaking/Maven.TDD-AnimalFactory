package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import javax.xml.ws.RequestWrapper;
import java.text.DateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
       String name = "jinx";
       Date bd = new Date();
       int id = 0;
       Cat cat = new Cat(name,bd,id);




    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // Give
        cat.speak();
       //When
        System.out.println(cat.speak());
    //Then
        Assert.assertEquals("meow!", cat.speak());

    }


    @Test
    public void setBirthDate(){
        // TODO - Create tests for `setBirthDate(Date birthDate)`



        //Given
         cat = new Cat ( null, null,  null);
        //Given
        Date expected = new Date();

        //When
        cat.setBirthDate(expected);

        //When
        Date actual = cat.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);


    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // Given
        Cat cat = new Cat( null, null, null );
        int preMealCount = cat.getNumberOfMealsEaten();
        int expected = preMealCount +1;

        //when
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);

    }




    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){

        //Given
        Cat cat = new Cat(null, null, 9087 );
        int expected = 9087;
        cat.setiD(9087);

        int actual =  cat.getiD();

        // Then
        Assert.assertEquals(expected, actual);

    }



    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInheritance(){
        // Given
        Cat cat = new Cat(null, null, null );
        Assert.assertTrue(cat instanceof Animal) ;





    }



      @Test
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void mammalInheritance(){
          Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = null;
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        //Given
        String name = "Laura";

        //When
        cat.setName(name);

        // Then
        Assert.assertEquals("Laura", cat.getName());


    }


}

package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest<expected, actual> {


    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    Dog dog = new Dog(null, null, null);


    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Give
        dog.speak();
        //When
        System.out.println(dog.speak());
        //Then
        Assert.assertEquals("bark!", dog.speak());

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDayTest() {
        Dog dog = new Dog(null, new Date(), null);
        //Given
        Date expected = new Date();

        //When
        dog.setBirthDay(expected);

        //When
        Date actual = dog.getBirthDate();

        // Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // Given
        Dog dog = new Dog(null, null, null);
        int preMealCount = dog.getNumberOfMealsEaten();
        int expected = preMealCount + 1;

        //when
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {

        //Given
        Dog dog = new Dog(null, null, 9087);
        int expected = 9087;


        int actual = dog.getId();

        // Then
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInheritance() {
        // Given
        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Animal);

    }
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void mammalInheritance () {
            Assert.assertTrue(dog instanceof Mammal);
        }


        @Test
        public void setNameTest() {
            // Given (a name exists and a dog exists)
            String name = "Milo";

            // When (a dog's name is set to the given name)
            dog.setName(name);

            // Then (we expect to get the given name from the dog)

            Assert.assertEquals("Milo", dog.getName());
        }
    }




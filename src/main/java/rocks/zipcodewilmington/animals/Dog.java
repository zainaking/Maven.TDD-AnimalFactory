package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    Date birthday = new Date ();


    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }

    public void setBirthDay(Date birthDay) {

        this.birthday = birthDay;

    }
}

package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {
    String name;
    Date birthDay;
    Integer iD;



    public Cat(String name, Date birthDate, Integer id) {

        super(name, birthDate, id);
    }

    public String speak() {

        return "meow!";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getiD() { return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }
}


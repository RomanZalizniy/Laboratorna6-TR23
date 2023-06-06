package Zavd_1_pack;

import Zavd_1_pack.Person;

public class zavd1_pusk {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John Smith", 35);

        person1.move();
        person2.talk();
    }
}

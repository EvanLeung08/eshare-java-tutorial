package com.eshare.predicate.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.eshare.predicate.chapter1.PersonPredicates.*;

/**
 * PredicateExample
 *
 * @author liangyh
 * @date 2018/8/3
 */


public class PredicateExample {
    public static void main(String[] args) {
        Person person1 = new Person("王一",21,"男");
        Person person2 = new Person("王二",22,"女");
        Person person3 = new Person("王三",17,"女");
        Person person4 = new Person("王四",50,"男");
        Person person5 = new Person("王五",30,"男");
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        System.out.println(filterPerson(persons,isAdultMale()));
        System.out.println(filterPerson(persons,isAdultFemale()));
        System.out.println(filterPerson(persons,isAdultFemale()));
    }

}

class PersonPredicates {
    public static Predicate<Person> isAdultMale() {
        return p -> p.getAge() > 18 && "男".equals(p.getGender());
    }

    public static Predicate<Person> isAdultFemale() {
        return p -> p.getAge() > 18 && "女".equals(p.getGender());
    }

    public static Predicate<Person> moreThanAge(Integer age) {
        return p -> p.getAge() > age;
    }

    public static List<Person> filterPerson(List<Person> persons , Predicate<Person> predicate){
        return persons.stream().filter(predicate).collect(Collectors.<Person>toList());
    }
}

class Person {

    private String name;
    private Integer age;
    private String gender;

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
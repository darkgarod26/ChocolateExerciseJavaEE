/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rubensilvalopes
 */
@XmlRootElement
public class Person {
    
    private String name;
    private int age;
    private String chocolate;
    
    public Person(){
        
    }

    public Person(String name, int age, String chocolate) throws JAXBException {
       
        this.name = name;
        this.age = age;
        this.chocolate=chocolate;
    }
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the id
     */
    public String getChocolate() {
        return chocolate;
    }
    
    @Override
    public String toString(){
        return "Name: "+ this.name +" <p>Age: " + this.age + " <p>Favourite Chocolate: "+ this.chocolate;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @param chocolate the id to set
     */
    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

}
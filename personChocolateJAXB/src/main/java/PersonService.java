/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author rubensilvalopes
 */
public class PersonService {

    JAXBContext jaxbContext;

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public String getPerson() throws FileNotFoundException, JAXBException, IOException {
   
        this.jaxbContext = JAXBContext.newInstance(Person.class);
        String file = "/home/ruben/NetBeansProjects/JAXBPractiseChocolate/personChocolateJAXB/PersonFile.xml";
       
        // Read
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        InputStream inputStream = new FileInputStream(file);
        Person person = (Person)unmarshaller.unmarshal(inputStream);
        inputStream.close();
   
        return person.toString();

    }

}
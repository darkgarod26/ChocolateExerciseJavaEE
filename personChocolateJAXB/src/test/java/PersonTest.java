
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rubensilavlopes
 */
public class PersonTest {
   
    private JAXBContext context;
    
    @Test
    public void perstonTestResutlTrue() throws JAXBException{
        this.context = JAXBContext.newInstance(Person.class);
        
        String file = "../personChocolateJAXB/PersonFile.xml";
        
        Person insertPerson = new Person();
        insertPerson.setName("Ruben");
        insertPerson.setAge(32);
        insertPerson.setChocolate("Milka");
        
        //Marshaller passes the info to xml
        
        Marshaller marshaller = this.context.createMarshaller();
        marshaller.marshal(insertPerson, new File(file));
        
        //Unmarshaller passes the xml to Java Class
        
        Unmarshaller unmarshaller = this.context.createUnmarshaller();
        
        Person returnedPerson = (Person)unmarshaller.unmarshal(new File(file));
        
        System.out.println("Unmarshaller\n"+ insertPerson+"\n"+returnedPerson);
        
        Assert.assertEquals(insertPerson.getName(), returnedPerson.getName());
        Assert.assertEquals(insertPerson.getAge(), returnedPerson.getAge());
        Assert.assertEquals(insertPerson.getChocolate(), returnedPerson.getChocolate());    
        
    }
    
}

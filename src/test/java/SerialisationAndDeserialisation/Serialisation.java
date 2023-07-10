package SerialisationAndDeserialisation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import PojoClass.Employee;

public class Serialisation {
@Test
public void test() throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
	JavaUtility jlib= new JavaUtility();
	
	ObjectMapper omap= new ObjectMapper();
	Employee emp=new Employee("pradeep","Testlead",101, 9876543210l);
    omap.writeValue(new File("./emp"+jlib.getRandomNum()+".json"), emp);
}
}

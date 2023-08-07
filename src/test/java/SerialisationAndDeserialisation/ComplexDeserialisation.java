package SerialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.Employee;
import PojoClass.Employee2SpouseAndPhNoComplexData;

public class ComplexDeserialisation {
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
	
	 ObjectMapper omap= new ObjectMapper();
	 Employee2SpouseAndPhNoComplexData ReadData = omap.readValue(new File("./emp98.json"),Employee2SpouseAndPhNoComplexData.class);	
     System.out.println(ReadData.getEname());
     System.out.println(ReadData.getEid());
     System.out.println(ReadData.getPhno()[0]);
     System.out.println(ReadData.getPhno()[1]);
     System.out.println(ReadData.getSpouse().getName());
     System.out.println(ReadData.getSpouse().getAge());
     System.out.println(ReadData.getPhno()[0]);
     System.out.println(ReadData.getPhno()[1]);
	}
}

package SerialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.Employee;

public class DeSeriallisation {
	
	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
	  ObjectMapper omap= new ObjectMapper();
      Employee ReadData = omap.readValue(new File("./emp.json"),Employee.class);	
      System.out.println(ReadData.getEname());
      System.out.println(ReadData.getDesignation());
	  System.out.println(ReadData.getPhoneNo());
	  System.out.println(ReadData.getEid()); 
	}
	}
	



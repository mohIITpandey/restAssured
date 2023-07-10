package SerialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoClass.Employee1;

public class SerialisationPhNoArray {
@Test
public void test() throws JsonGenerationException, JsonMappingException, IOException {
	ObjectMapper omap= new ObjectMapper();
	long[]phno= {9876543210l,98765432165l};
	Employee1 emp= new Employee1("MohitPandey","TestEngg.",105, phno);
     omap.writeValue(new File("./emp1.Json"), emp);
	
	
}
}

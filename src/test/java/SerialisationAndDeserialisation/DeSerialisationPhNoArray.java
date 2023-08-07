package SerialisationAndDeserialisation;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;
import PojoClass.Employee1;

public class DeSerialisationPhNoArray{
@Test
public void test() throws JsonParseException, JsonMappingException, IOException {
	 ObjectMapper omap= new ObjectMapper();
     Employee1 ReadData = omap.readValue(new File("./emp1.json"),Employee1.class);	
     System.out.println(ReadData.getEname());
     System.out.println(ReadData.getDesignation());
	  System.out.println(ReadData.getEid()); 
	  System.out.println(ReadData.getPhoneNo()[0]);
	  System.out.println(ReadData.getPhoneNo()[1]);
}
}

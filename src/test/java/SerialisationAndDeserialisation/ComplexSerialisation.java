package SerialisationAndDeserialisation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import GenericUtilities.JavaUtility;
import PojoClass.Employee;
import PojoClass.Employee2SpouseAndPhNoComplexData;
import PojoClass.Spouse;

public class ComplexSerialisation {
@Test
public void test() throws JsonGenerationException, JsonMappingException, IOException {
	long[]phNum={9876543210l,87654321098l};
	Spouse spouse=new Spouse("Sid",18, phNum);
	JavaUtility jlib=new JavaUtility();
	ObjectMapper omap= new ObjectMapper();
	Employee2SpouseAndPhNoComplexData emp=new Employee2SpouseAndPhNoComplexData("pradeep",101,phNum,spouse);
    omap.writeValue(new File("./emp"+jlib.getRandomNum()+".json"), emp);
}
}

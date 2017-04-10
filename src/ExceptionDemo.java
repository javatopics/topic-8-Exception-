import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {

	public static void main(String[] args) throws InvalidAgeException{
		Person p=new Person();
		p.setAge(18);
		
		List<Object> plist=new ArrayList<>();
		for(int i =0;i<=20;i++){
			plist.add(new Person());	
		}
		
		p.personListAnaly(plist);
		
	}
}

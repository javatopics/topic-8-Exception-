import java.util.List;

public class Person {

	int age;
	
	public void setAge(int age)throws InvalidAgeException{
		if(age>=18) 
			this.age=age;
		else throw new InvalidAgeException("invalid age");
	}
	
	public void personListAnaly(List<Object> list) throws InvalidLengthArrayException{
		if(list.size()<=20){
			System.out.println("the students list is enough");
		}else throw new InvalidLengthArrayException("student list is too large");
	}
	
}

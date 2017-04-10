package kps;

public class Person {

	int age;
	int[] a;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws InvalidAgeException{
		if(age>18)
		this.age = age;
		else throw new InvalidAgeException("invalid age! please input again.");
	}
	
	public void setA(int[] a)throws UncheckException{
		if(a.length>3){
			throw new UncheckException("too large");
		}else{
			this.a=a;
		}
	}
	
}

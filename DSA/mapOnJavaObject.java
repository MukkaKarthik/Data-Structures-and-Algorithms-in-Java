package DSA;

import java.util.*;
import java.util.stream.Collectors;

public class mapOnJavaObject {

	public String firstName;
	public int Age;
	
	public mapOnJavaObject(String local1, int local2 )
	{
		this.Age = local2;
		this.firstName = local1;
		
	}
	
	
	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mapOnJavaObject m = new mapOnJavaObject("first", 1);
		
		mapOnJavaObject e = new mapOnJavaObject("second", 2);
		
		List<mapOnJavaObject> completeEmployeeDetails = new ArrayList<>();
		
		completeEmployeeDetails.add(m);
		completeEmployeeDetails.add(e);
		

		System.out.println(completeEmployeeDetails.size());
		
List<Object>	generalList =	completeEmployeeDetails.stream().map(InputObject -> InputObject.firstName.toUpperCase()).collect(Collectors.toList());
		
System.out.println(generalList);
		

List<Integer> squareNumber = completeEmployeeDetails.stream().map(InputObject -> InputObject.Age * 20 ).collect(Collectors.toList());

System.out.println(squareNumber);


//Using getters and setters method to use filter function and map function

List<Integer> applyingFilter = completeEmployeeDetails.stream().map(InputObject -> InputObject.getAge()*35)
.filter(number -> number > 40).collect(Collectors.toList());

System.out.println(applyingFilter);
	}

}

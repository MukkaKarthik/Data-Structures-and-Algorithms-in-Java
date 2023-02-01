package DSA;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class mapFunction {
	
	String fullName;
	int Age;
	Boolean doesHeExist;
	
	public mapFunction(String localString , int localInt , Boolean LocalBoolean)
	{
		this.fullName = localString;
		this.doesHeExist = LocalBoolean;
		this.Age = localInt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Working on map functions 
		
		List<String> stringList = Arrays.asList("first word","second word","third word","fourth word","fifth word");
		
		System.out.println(stringList);

		List<String> afterMapFunction =  stringList.stream().
				//map(inputData ->inputData.toUpperCase())
				filter(inputDataAgain -> inputDataAgain.contains("second word") ).collect(Collectors.toList());
		
		System.out.println(afterMapFunction);
		
		
	}

}

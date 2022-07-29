package co.study.solve;

public class BMI {

	public static void main(String[] args) {
	
		Human human = new StandardWeightInfo("홍길동",168,45);
	
	   ((StandardWeightInfo)human).getStandardWeight();
	   human.getInformation();
	   System.out.println();
	   
	   human = new ObesityInfo("박둘이",168,90);
	   
	   ((ObesityInfo)human).getObesity();
	 //  human.getObesity();
	   System.out.println();
	   
	
	}

	}



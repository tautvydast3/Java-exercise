package application;

public class Person {
	String name;
	Integer age;

	void setName(String thisName) {
		name = thisName;
	}
	
	void setAge(Integer thisAge) {
		age = thisAge;
	}
	
	String getName() {
		return name;
	}
	
	Integer getAge() {
		return age;
	}
}

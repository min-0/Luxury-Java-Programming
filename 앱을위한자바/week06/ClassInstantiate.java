package week6;

public class ClassInstantiate {

	public static void main(String[] args) {
		Person song = new Person();
		song.setName("songkanho");
		song.setGender("Male");
		song.setAge(35);
		//song.age = 35; //해도 되지만 외부에서 정보를 바꿀 수 있기 때문에 set메소드 사용
		System.out.println(song.showPersonInfo());
	}

}

class Person{
	//속성
	String name;
	String gender;
	int age;
	//setter
	void setName(String name) {this.name = name;}
	void setGender(String gender) {this.gender = gender;}
	void setAge(int age) {this.age = age;}
	//getter
	String getName() {return this.name;}
	String getGender() {return this.gender;}
	int getAge() {return this.age;}
	//메소드
	void smile() {}
	void eat() {}
	void study() {}
	//정보 출력
	public String showPersonInfo() {
		return "Person[name = " + name + ", gender = " + gender + ", age = " + age + "]";
	}
}
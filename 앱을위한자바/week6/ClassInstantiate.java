package week6;

public class ClassInstantiate {

	public static void main(String[] args) {
		Person song = new Person();
		song.setName("songkanho");
		song.setGender("Male");
		song.setAge(35);
		//song.age = 35; //�ص� ������ �ܺο��� ������ �ٲ� �� �ֱ� ������ set�޼ҵ� ���
		System.out.println(song.showPersonInfo());
	}

}

class Person{
	//�Ӽ�
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
	//�޼ҵ�
	void smile() {}
	void eat() {}
	void study() {}
	//���� ���
	public String showPersonInfo() {
		return "Person[name = " + name + ", gender = " + gender + ", age = " + age + "]";
	}
}
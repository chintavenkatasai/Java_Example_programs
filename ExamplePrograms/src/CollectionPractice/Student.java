package CollectionPractice;

public class Student {
  int id;
  String Name;
  int age;
  String MNumber;
public Student(int id, String name, int age, String mNumber) {
	super();
	this.id = id;
	Name = name;
	this.age = age;
	MNumber = mNumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMNumber() {
	return MNumber;
}
public void setMNumber(String mNumber) {
	MNumber = mNumber;
}
@Override
public String toString() {
	return "Student [id=" + id + ", Name=" + Name + ", age=" + age + ", MNumber=" + MNumber + "]";
}
  
}

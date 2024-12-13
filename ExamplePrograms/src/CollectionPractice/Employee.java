package CollectionPractice;

public class Employee {
  int id;
  String name;
  String salory;
public Employee(int id, String name, String salory) {
	super();
	this.id = id;
	this.name = name;
	this.salory = salory;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSalory() {
	return salory;
}
public void setSalory(String salory) {
	this.salory = salory;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salory=" + salory + "]";
}
  
}

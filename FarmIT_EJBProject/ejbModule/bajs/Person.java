package bajs;
public class Person {
	 private String name = null;
	 private String address = null;

	 public Person() {
	 }
	 public Person(String name, String address) {
	 this.setName(name);
	 this.setAddress(address);
	 }
	 public String getAddress() {
	return address;
	 }
	 public String getName() {
	return name;
	 }
	 public void setAddress(String string) {
	address = string;
	 }
	 public void setName(String string) {
	name = string;
	 }
	}
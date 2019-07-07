package com.devLearnsCollectionApi;

public class Student implements Comparable<Object> {
	String name, contactNO;
	int age;
	float marks;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNO() {
		return contactNO;
	}

	public void setContactNO(String contactNO) {
		this.contactNO = contactNO;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return "---------\nname: " + this.name + "\nage: " + this.age + "\nnumber: " + this.contactNO + "\nmarks: "
				+ this.marks;
	}

	@Override
	public int compareTo(Object o) {
		Student student = (Student) o;

		if (this.marks == student.marks) {
			return 0;
		}
		if (this.marks < student.marks) {
			return -1;
		}
		return 1;
	}
	}

	


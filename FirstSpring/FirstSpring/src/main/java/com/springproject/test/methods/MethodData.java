package com.springproject.test.methods;

public class MethodData {
	private int rno,marks;
	private String name,collegeName;
	
	public MethodData()
	{
		System.out.println("Welcome First Spring Project");
	}
	
	public MethodData(int rno, int marks, String name, String collegeName) {
		super();
		this.rno = rno;
		this.marks = marks;
		this.name = name;
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Information [Rno=" + rno + ", Name=" + name + ", Marks=" + marks + ", collegeName=" + collegeName + "]";
	}
	
}

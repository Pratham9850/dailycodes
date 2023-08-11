package com.callquality;

public class Shape {
	
	public void calculate(Area area,int sides) {
		area.calculateArea(sides);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape shape = new Shape();
		shape.calculate((sides) -> { System.out.println("calculating area");
									System.out.println(sides*sides);},4);

	}

}

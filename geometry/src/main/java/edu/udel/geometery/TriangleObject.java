/**
 * 
 */
package edu.udel.geometery;

/**
 * Raveena Wadhwa Quiz 3 Problem 1 
 *
 */
public class TriangleObject extends GeometricObject {

	private double side1 = 1.0;
	
	private double side2 = 1.0;
	
	private double side3 = 1.0;
	/**
	 * A no-arg constructor that creates a default triangle.
	 */
	public TriangleObject() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}


	public TriangleObject(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * @param color
	 * @param filled
	 */
	public TriangleObject(String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	//The accessor methods for all three data fields.

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	/* (non-Javadoc)
	 * @see edu.udel.geometery.GeometricObject#getArea()
	 */
	@Override
	public double getArea() {
		//Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
		double p = getPerimeter() /2;
		double area = Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()));
		return area;
	}

	/* (non-Javadoc)
	 * @see edu.udel.geometery.GeometricObject#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return getSide1() + getSide2() + getSide3();
	}

}

package com.ayushman.spring.springcore.references;

public class Scores {

	private Double physics;
	private Double maths;
	private Double chemistry;
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getChemistry() {
		return chemistry;
	}
	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}
	
	@Override
	public String toString() {
		return "[physics= " + physics + " chemistry= "+ chemistry + " maths= "+ maths + "]";
	}
	
}

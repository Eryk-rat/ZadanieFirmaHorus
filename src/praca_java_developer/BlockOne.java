package praca_java_developer;



public class BlockOne implements Block {
	String color;
	String structure;
	
	public BlockOne(String color, String structure) {
		this.color =color;
		this.structure = structure;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getMaterial() {
		return structure;
	}
	
	@Override
	public String toString() {
		return "Color : "+ color +" Structure : "+ structure;
	}
	
}

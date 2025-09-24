public abstract class TangibleAsset extends Asset implements Thing {
	String color;
	double weigth;
	public TangibleAsset(String name, int price, String color, double weigth) {
		super(name, price);
		this.color = color;
		this.weigth = weigth;
	}
	public String getColor() { return this.color; }
	public double getWeigth() { return this.weigth; }
	public double setWeigth(double weigth) { this.weigth = weigth; }
}

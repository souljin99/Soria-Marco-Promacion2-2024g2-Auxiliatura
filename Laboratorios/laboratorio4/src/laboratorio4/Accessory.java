package laboratorio4;

public class Accessory implements Product{
	private String name;
	private Double price;
	
	public Accessory(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getPrice() {
		return price;
	}

}

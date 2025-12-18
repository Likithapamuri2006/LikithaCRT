class Charger
{
	private String name;
	private int voltage;
	public Charger(String name, int voltage) {
		super();
		this.name = name;
		this.voltage = voltage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
}
class Os
{
	private String name;
	private double version;
	public Os(String name, double version) {
		super();
		this.name = name;
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
}

class Mobile
{
	Os s = new Os("Android", 15.6);
	
	void hasCharger(Charger c)
	{
		System.out.println(c.getName());
		System.out.println(c.getVoltage());
	}
}

public class ExampleforAggregation {

	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		
		Charger c = new Charger("Apple",20);
		
		m.hasCharger(c);
		
		System.out.println("----------------------------");
		
		m = null;
		System.out.println(m.s.getName());
		System.out.println(m.s.getVersion());
		
		

	}

}

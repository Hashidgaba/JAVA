

class Temperature {
	 private double temperature;

	    public void TemperatureConverter() {
	        this.temperature = 0.0;
	    }

	    public void setCelsius(double value) {
	        this.temperature = value;
	    }

	    public void setFahrenheit(double value) {
	        this.temperature = (value - 32) * 5 / 9;
	    }

	    public double toFahrenheit() {
	        return (this.temperature * 9 / 5) + 32;
	    }

	    public double toCelsius() {
	        return this.temperature;
	    }

	    public void showTemperature() {
	        System.out.printf("Stored Temperature: %.2f°C / %.2f°F%n", this.temperature, toFahrenheit());
	    }

}

public class Main {

	public static void main(String[] args) {
		
		   Temperature temp = new Temperature();

	        temp.setCelsius(25);
	        temp.showTemperature();

	        temp.setFahrenheit(77);
	        temp.showTemperature();

	}

}

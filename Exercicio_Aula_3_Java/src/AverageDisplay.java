import java.util.ArrayList;
import java.util.List;

public class AverageDisplay implements Observer, DisplayElement{
	
	private List <Double> temps = new ArrayList <> ();
	
	public void update (double temp, double humidity, double pressure) {
		temps.add(temp);
		display (temp, humidity, pressure);
	}
	@Override
	public void display(double t, double h, double p) {
		System.out.printf("Media das ultimas 10 temperaturas: %.2f\n", calculaMedia());
	}
	
	private double calculaMedia() {
		double soma = 0;
		int count = 1;
		
		while (count <=10) {
		for (Double temp : temps) 
		{
			soma += temp;
			count++;
		}
	}
		return soma / temps.size();
}
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HistoricDisplay implements Observer, DisplayElement{
	private List <Double> temps = new ArrayList <> ();
	@Override
	public void update (double temp, double humidity, double pressure) {
		temps.add(temp);
		display (temp, humidity, pressure);
	}	
	@Override
	public void display(double t, double h, double p) {
		searchHistoric();		
	}
	
	

	public void searchHistoric() {
		int count = 1;
		
		while (count <=10) {
			for (Double temp : temps)
			{
			System.out.printf(" %d temperatura: ",count);
					
			}
			
		}
}
}
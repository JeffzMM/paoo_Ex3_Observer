public class Teste {

	public static void main(String[] args){
		WeatherData wd = new WeatherData();
		CurrentConditionsDisplay conditionsDisplay = 
				new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = 
				new ForecastDisplay();
		StatsDisplay statsDisplay = 
				new StatsDisplay();
		HistoricDisplay historicDisplay = 
				new HistoricDisplay();
		AverageDisplay averageDisplay = 
				new AverageDisplay();
		wd.registerObserver(conditionsDisplay);
		wd.registerObserver(forecastDisplay);
		wd.registerObserver(statsDisplay);
		wd.registerObserver(historicDisplay);
		wd.registerObserver(averageDisplay);
		wd.iniciar();
	}

}

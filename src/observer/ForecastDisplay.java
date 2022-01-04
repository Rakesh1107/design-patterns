package observer;

public class ForecastDisplay implements Observer, DisplayElement {
    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: Its raining");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}

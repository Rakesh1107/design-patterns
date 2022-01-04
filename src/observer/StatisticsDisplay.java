package observer;

public class StatisticsDisplay implements Observer, DisplayElement{

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics: Good weather");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}

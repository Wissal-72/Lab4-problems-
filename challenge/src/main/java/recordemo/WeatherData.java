package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius*9/5 + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather : %.1f°C (%.1f°F) and %s",
                temperatureCelsius,
                temperatureFahrenheit(),
                conditions
                );

    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions){
        double tempCels= (tempFahrenheit - 32)*9/5;
       return new WeatherData(tempCels, conditions);
    }

    public static void main(String[] args) {
        WeatherData weather = new WeatherData(25, "sunny");
        System.out.print("Today's weather:");
        System.out.println(weather.getSummary());
        WeatherData  new_weather = WeatherData.fromFahrenheit(50, "cloudy");
        System.out.printf("Yesterday's weather : Curreent weather : %.1f°C (%.1f°F) and %s",
                 new_weather.temperatureCelsius(),
                new_weather.temperatureFahrenheit(),
                new_weather.conditions()

        );

    }
}

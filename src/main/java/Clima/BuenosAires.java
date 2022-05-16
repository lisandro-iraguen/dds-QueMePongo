package Clima;

import java.util.List;
import java.util.Map;

public class BuenosAires implements Ciudad{
  private String nombre="Buenos Aires";
  private static Clima climaBuenosAires=null;
  @Override
  public String getNombre(){
    return nombre;
  }

  @Override
  public Clima getClima() {
    if(climaBuenosAires == null) {
      climaBuenosAires = new Clima();
      AccuWeatherAPI apiClima = new AccuWeatherAPI();
      List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
      climaBuenosAires.temperatura = (int) condicionesClimaticas.get(0).get("Temperature");
      climaBuenosAires.probablidadDeLLuvia = (float) condicionesClimaticas.get(0).get("PrecipitationProbability");
    }
    return climaBuenosAires;
  }
}

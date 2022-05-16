package Clima;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicioMeteorologicoTest {
  @Test
  void obtener_clima() {
    BuenosAires climaDeBuenosAires = new BuenosAires();
    Clima clima= climaDeBuenosAires.getClima();
    assertTrue(clima!=null);
  }
}
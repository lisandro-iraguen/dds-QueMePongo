import Clima.Clima;

import java.util.ArrayList;
import java.util.List;

public class UniformeCustomFactory extends UniformeFactory{
  public List<PrendaFactory> posiblesPrendas = new ArrayList<>();

  public UniformeCustomFactory(PrendaFactory pSuperior, PrendaFactory pInferio, PrendaFactory calzado, Clima clima) {
    super(pSuperior, pInferio, calzado,clima);
  }
}

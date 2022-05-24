package prenda;

import clima.Clima;

public class UniformeFactory {
  private PrendaFactory prendaSuperior;
  private PrendaFactory prendaInferio;
  private PrendaFactory calzado;

  public UniformeFactory(
      PrendaFactory pSuperior,
      PrendaFactory pInferio,
      PrendaFactory calzado, Clima clima){

    if(pSuperior.getTipoDePrenda().categoria!= Categoria.PARTE_SUPERIOR)
        throw new RuntimeException("tiene que ser parte superior");
    if(pInferio.getTipoDePrenda().categoria!= Categoria.PARTE_INFERIOR)
      throw new RuntimeException("tiene que ser parte inferior");
    if(pSuperior.getTipoDePrenda().categoria!= Categoria.CALZADO)
      throw new RuntimeException("tiene que ser parte un calzado");

    checkarUsoTemperaturas(pSuperior, clima);


    this.prendaSuperior=pSuperior;
    this.prendaInferio=pInferio;
    this.calzado=calzado;
  }

  private void checkarUsoTemperaturas(PrendaFactory pSuperior, Clima clima) {
    if(!pSuperior.sePuedeUsarEn(clima)){
      throw new RuntimeException("no se puede usar en ese clima");
    }
  }

}

package prenda;

import clima.Clima;

public class TipoDePrenda {

  public Categoria categoria;
  public int temperaturaMinima;
  public int tempreaturaMaxima;

  public static TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.PARTE_INFERIOR,-10,20);
  public static TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR,15,30);
  public static TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR,20,18);


  public TipoDePrenda(Categoria categoria, int tMin, int tMax) {

    this.categoria = categoria;
    this.temperaturaMinima=tMin;
    this.tempreaturaMaxima=tMax;

  }



  public Categoria categoria() {
    return this.categoria;
  }


  public boolean permiteElUsoEn(Clima clima) {
    return between(clima.temperatura,temperaturaMinima,tempreaturaMaxima);
  }

  private boolean between(float i, float minValueInclusive, float maxValueInclusive) {
    return (i >= minValueInclusive && i <= maxValueInclusive);
  }
}

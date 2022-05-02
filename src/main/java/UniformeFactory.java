public class UniformeFactory {
  private PrendaFactory prendaSuperior;
  private PrendaFactory prendaInferio;
  private PrendaFactory calzado;

  public UniformeFactory(PrendaFactory pSuperior,PrendaFactory pInferio,PrendaFactory calzado){
    if(pSuperior.getTipoDePrenda().categoria!= Categoria.PARTE_SUPERIOR)
        throw new RuntimeException("tiene que ser parte superior");
    if(pInferio.getTipoDePrenda().categoria!= Categoria.PARTE_INFERIOR)
      throw new RuntimeException("tiene que ser parte inferior");
    if(pSuperior.getTipoDePrenda().categoria!= Categoria.CALZADO)
      throw new RuntimeException("tiene que ser parte un calzado");

    this.prendaSuperior=pSuperior;
    this.prendaInferio=pInferio;
    this.calzado=calzado;
  }
}

public class TipoDePrenda {

  public Categoria categoria;

  public static TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.PARTE_INFERIOR);
  public static TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
  public static TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);


  TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }



  public Categoria categoria() {
    return this.categoria;
  }
}

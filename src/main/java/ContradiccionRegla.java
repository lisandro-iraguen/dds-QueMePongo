public class ContradiccionRegla {

  public boolean seContradicen(Tipo tipo, Categoria categoria) {

    if(tipo == Tipo.ZAPATOS){
      if(categoria== Categoria.ACCESORIOS) return true;
      if(categoria== Categoria.PARTE_SUPERIOR) return true;
    }

    if(tipo == Tipo.CAMISA_DE_MANGAS_CORTAS){
      if(categoria== Categoria.ACCESORIOS) return true;
      if(categoria== Categoria.PARTE_INFERIOR) return true;
      if(categoria== Categoria.CALZADO) return true;
    }

    if(tipo == Tipo.PANTALON){
      if(categoria== Categoria.ACCESORIOS) return true;
      if(categoria== Categoria.PARTE_SUPERIOR) return true;
      if(categoria== Categoria.CALZADO) return true;
    }
    return false;
  }
}

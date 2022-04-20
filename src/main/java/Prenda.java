import java.awt.*;

public class Prenda {

  private Tipo tipo;
  private Categoria categoria;
  private Material material;



  private Color colorPrincipal;

  private Color colorSecundario=null;

  public Prenda(Tipo tipo,Categoria categoria, Material material,Color colorPrincipal){
    if(tipo == null)
      throw  new RuntimeException("tiene que seleccionar un tipo no nulo");

    if(categoria == null)
      throw  new RuntimeException("tiene que seleccionar una categoria no nula");

    if(material == null)
      throw  new RuntimeException("tiene que seleccionar un material no nulo");

    if(colorPrincipal == null)
      throw  new RuntimeException("tiene que seleccionar un color principal no nulo");

    if(seContradicen(tipo,categoria)){
      throw  new RuntimeException("tiene que seleccionar un tipo y una categoria no contradictorios");
    }

  }
  public void setColorPrincipal(Color c){
    colorPrincipal = c;
  }
  public void setColorSecundario(Color c){
    colorSecundario = c;
  }
  public Color getColorPrincipal(){
    return colorPrincipal;
  }
  public Color getColorSecundario(){
    return colorSecundario;
  }
  public Tipo getTipo() {
    return tipo;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Material getMaterial() {
    return material;
  }

  public boolean seContradicen(Tipo tipo, Categoria categoria){
    ContradiccionRegla contradicciones = new ContradiccionRegla();
    return contradicciones.seContradicen(tipo,categoria);
  }


}

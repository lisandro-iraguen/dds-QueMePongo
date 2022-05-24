package prenda;

import java.awt.*;

import static java.util.Objects.requireNonNull;

public class Prenda {

  private TipoDePrenda tipo;
  private Categoria categoria;
  private Material material;
  private Trama trama;



  private Color colorPrincipal;

  private Color colorSecundario=null;

  public Prenda(TipoDePrenda tipo,Categoria categoria, Material material,Color colorPrincipal){
    this.tipo = requireNonNull(tipo, "tipo de prenda es obligatorio");
    this.material = requireNonNull(material, "material es obligatorio");
    this.colorPrincipal = requireNonNull(colorPrincipal, "color es obligatorio");
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
  public TipoDePrenda getTipo() {
    return tipo;
  }
  public void setTipoDePrenda(TipoDePrenda t) {
    tipo=t;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public Material getMaterial() {
    return material;
  }
  public void setMaterial(Material m) {
    material=m;
  }


  public TipoDePrenda queTipoDePrendaEstoyCargando(){
    return this.getTipo();
  }
  public Categoria aQueCategoríaPerteneceUnaPrenda(){
    return  this.getCategoria();
  }

  public void deQueMaterialEstaHechaUnaPrenda(Color colorPrincipal){
     this.setColorPrincipal(colorPrincipal);
  }

  public String indicarColorSecudario(){
    if(this.getColorSecundario()!=null)
      return this.getColorSecundario().toString();
    else{
      return "no existe color secundario";
    }
  }

}

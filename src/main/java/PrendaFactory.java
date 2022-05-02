import java.awt.*;

import static java.util.Objects.requireNonNull;

public class PrendaFactory {


  private Material matrial;
  private TipoDePrenda tipoDePrenda;
  private Trama trama=Trama.LISO;

  private Color color;

  public void setMaterial(Material mat){
    this.matrial.setTrama(this.trama);
    this.matrial=mat;
  }

  public void setTrama(Trama t){
    trama=t;
  }
  public TipoDePrenda getTipoDePrenda(){
    return tipoDePrenda;
  }
  public void setPrenda(TipoDePrenda tDeP){
    this.tipoDePrenda=tDeP;
  }

  public Prenda crearPrenda(){
    this.tipoDePrenda = requireNonNull(this.tipoDePrenda, "tipo de prenda va primero");
    this.matrial = requireNonNull(this.matrial, "material va segundo");
    return  new Prenda(tipoDePrenda,tipoDePrenda.categoria(),matrial,color);
  }




}

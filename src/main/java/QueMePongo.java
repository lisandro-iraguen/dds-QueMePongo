import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class QueMePongo
{

  public Tipo queTipoDePrendaEstoyCargando(Prenda prenda){
   return prenda.getTipo();
  }

  public Categoria aQueCategoríaPerteneceUnaPrenda(Prenda prenda){
    return prenda.getCategoria();
  }

  public void deQueMaterialEstaHechaUnaPrenda(Prenda prenda, Color colorPrincipal){
    prenda.setColorPrincipal(colorPrincipal);
  }

  public String indicarColorSecudario(Prenda prenda){
    if(prenda.getColorSecundario()!=null)
      return prenda.getColorSecundario().toString();
    else{
      return "no existe color secundario";
    }
  }

}

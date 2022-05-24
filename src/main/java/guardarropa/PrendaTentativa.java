package guardarropa;

import Usuario.Usuarie;
import prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class PrendaTentativa {
  private Boolean fueAceptada=false;
  public List<Prenda> listaDePrendasTentativas = new ArrayList();
  public Usuarie usuarie;
  PrendaTentativa(Usuarie u){
    this.usuarie=u;
  }
  public void agregarPrenda(Prenda prenda){
    listaDePrendasTentativas.add(prenda);
  }

  public void quitarPrenda(Prenda prenda){
    listaDePrendasTentativas.remove(prenda);
  }

  public void aceptar(){
    this.fueAceptada=true;
  }

  public void rechazar(){
    this.fueAceptada=false;
  }
}

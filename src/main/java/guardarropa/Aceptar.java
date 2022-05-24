package guardarropa;

public class Aceptar implements Orden{

  private PrendaTentativa prendaTentativa;

  public Aceptar(PrendaTentativa prendaTentativa){
    this.prendaTentativa = prendaTentativa;
  }

  public void execute() {
    prendaTentativa.aceptar();
  }
}

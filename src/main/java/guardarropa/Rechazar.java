package guardarropa;

public class Rechazar implements Orden{
  private PrendaTentativa prendaTentativa;

  public Rechazar(PrendaTentativa prendaTentativa){
    this.prendaTentativa = prendaTentativa;
  }

  public void execute() {
    prendaTentativa.rechazar();
  }
}

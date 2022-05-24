package guardarropa;

public class Rechazar implements Ordengi{
  private PrendaTentativa prendaTentativa;

  public Rechazar(PrendaTentativa prendaTentativa){
    this.prendaTentativa = prendaTentativa;
  }

  public void execute() {
    prendaTentativa.rechazar();
  }
}

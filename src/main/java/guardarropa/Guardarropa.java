package guardarropa;

import Usuario.Usuarie;
import org.junit.jupiter.api.Order;
import prenda.Prenda;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Guardarropa {
  private Usuarie usuarie;
  public List<Prenda> lista_de_prendas = new ArrayList();
  public List<PrendaTentativa> listaDePropuestasTentativas = new ArrayList();
  public List<Orden> listaDeOrdenes = new ArrayList();


  public Guardarropa(Usuarie u){
    this.usuarie=u;
  }

  public void crearPropuesta(PrendaTentativa prendaTentativa){
    listaDePropuestasTentativas.add(prendaTentativa);
  }

  public void aceptarPropuesta(PrendaTentativa prendaTentativa){
    listaDeOrdenes.add(new Aceptar(prendaTentativa));
  }

  public void rechazarPropuesta(PrendaTentativa prendaTentativa){
    listaDeOrdenes.add(new Rechazar(prendaTentativa));
  }

  public void correrPropuestas(){
    for (Orden orden : listaDeOrdenes) {
      orden.execute();
    }
  }
}

import java.util.ArrayList;
import java.util.List;

public class Usuarie {

  public List<PrendaFactory> prendaFactoryListSinCompletar = new ArrayList<PrendaFactory>();
  public List<UniformeFactory> prendaFactorySugerencias = new ArrayList<UniformeFactory>();
  public List<Prenda> prendaCompleta = new ArrayList<Prenda>();


  public void recibirSugerenciaDePrendasArmadas(UniformeFactory p){
    prendaFactorySugerencias.add(p);
  }
  public void crearPrendaBorrador(){
    PrendaFactory prendaFactory = new PrendaFactory();
    prendaFactory.setMaterial(new Material());
    prendaFactory.setPrenda(new TipoDePrenda(Categoria.PARTE_INFERIOR));
    prendaFactoryListSinCompletar.add(prendaFactory);
  }


  public void crearPrenda(){
    PrendaFactory prendaFactory = new PrendaFactory();
    prendaFactory.setMaterial(new Material());
    prendaFactory.setTrama(Trama.CUADRITOS);
    prendaFactory.setPrenda(new TipoDePrenda(Categoria.PARTE_INFERIOR));
    prendaCompleta.add(prendaFactory.crearPrenda());
  }
}

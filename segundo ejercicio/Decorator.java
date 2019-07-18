  interface Car{
    void model();
  }

  class Model implements Car{
    private int year;

    public Model(int year){
      this.year = year;
    }
    public void model(){
      System.out.println("Modelo: "+year);
    }
  }
  
  abstract class Decorator implements Car{
    private Car car;
    
    public Decorator(Car car){
      this.car = car;
    }

    public void model(){
      car.model();
    }
  }
  class DadosAfelpadosDecorator extends Decorator{
    
    public DadosAfelpadosDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con dados afelpados");
    }

  }

    class PerritoMueveCabezaDecorator extends Decorator{
    
    public PerritoMueveCabezaDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con perrito mueve cabeza");
    }

  }

  class AleronDecorator extends Decorator{
    
    public AleronDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con aleron");
    }

  }

  class SuspensionHidraulicaDecorator extends Decorator{
    
    public SuspensionHidraulicaDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con suspencion hidraulica");
    }

  }

  class NeonDecorator extends Decorator{
    
    public NeonDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con neon");
    }

  }

  class SubwooferDecorator extends Decorator{
    
    public SubwooferDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con subwoofer");
    }

  }

  class PlatonDecorator extends Decorator{
    
    public PlatonDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con platon");
    }

  }

  class PolarizadoDecorator extends Decorator{
    
    public PolarizadoDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con vidrios polarizados");
    }

  }

  class AlarmaDecorator extends Decorator{
    
    public AlarmaDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con alarma");
    }

  }

  class SunRoofDecorator extends Decorator{
    
    public SunRoofDecorator(Car car){
      super(car);
    }

    public void model(){
      super.model();
      System.out.println("con sun roof");
    }

  }
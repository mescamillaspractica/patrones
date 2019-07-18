class Main {
  public static void main(String[] args) {
    // Decorator pattern driver
    Car car = new SunRoofDecorator(new PerritoMueveCabezaDecorator(new DadosAfelpadosDecorator(new Model(2019))));
    car.model();

    //Flyweight pattern driver
    Flyweight flyweight = new Flyweight();

    //Interpreter pattern driver
    Interpreter interpreter = new Interpreter();

    //NullObject pattern driver
    NullObject nullObject = new NullObject();
  }
}


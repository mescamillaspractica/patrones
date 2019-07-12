/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

/**
 *
 * @author Estudiante
 */
public class Patterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PelaoDeLasArepas pedro = new PelaoDeLasArepas();
        ArepaBuilder arepaRanchera = new ArepaRancheraBuilder();
        ArepaBuilder arepaMarinera = new ArepaMarineraBuilder();
        
        pedro.setArepaBuilder(arepaRanchera);
        pedro.constructArepa();
        
        Arepa arepa = pedro.getArepa();
        System.out.println(arepa.getBebida());
        
    }
    static class Arepa{
        private String salsa = "";
        private String tipo = "";
        private String relleno = "";
        private String bebida = "";
        
        public void setTipo(String tipo){
            this.tipo = tipo;
        }
        
        public void setSalsa(String salsa){
            this.salsa = salsa;
        }
        
        public void setRelleno(String relleno){
            this.relleno = relleno;
        }
        
        public void setBebida(String bebida){
            this.bebida = bebida;
        }
        public String getTipo(){
            return this.tipo;
        }
        
        public String getSalsa(){
            return this.salsa;
        }
        
        public String getRelleno(){
            return this.relleno;
        }
        
        public String getBebida(){
            return this.bebida;
        }
    }
    
    static abstract class ArepaBuilder{
        protected Arepa arepa;
        
        public Arepa getArepa(){
            return arepa;
        }
        
        public void createNewArepaProduct(){
            arepa = new Arepa();
        }
        
        public abstract void buildTipo();
        public abstract void buildSalsa();
        public abstract void buildRelleno();
        public abstract void buildBebida();
    }
    
    static class ArepaRancheraBuilder extends ArepaBuilder {
        @Override
        public void buildTipo(){
            arepa.setTipo("choclo");
        }
        @Override
        public void buildSalsa(){
            arepa.setSalsa("napolitana");
        }
        @Override
        public void buildRelleno(){
            arepa.setRelleno("Frijol+carne+tocineta");
        }
        @Override
        public void buildBebida(){
            arepa.setBebida("Naranja postobon");
        }
    }
    
    static class ArepaMarineraBuilder extends ArepaBuilder{
        @Override
        public void buildTipo(){
            arepa.setTipo("blanca");
        }
        @Override
        public void buildSalsa(){
            arepa.setSalsa("ragú");
        }
        @Override
        public void buildRelleno(){
            arepa.setRelleno("camarones");
        }
        @Override
        public void buildBebida(){
            arepa.setBebida("Cocacola");
        }
    }
    
    static class PelaoDeLasArepas{
        private ArepaBuilder arepaBuilder;
        
        public void setArepaBuilder(ArepaBuilder ab){
            arepaBuilder = ab;
        }
        
        public Arepa getArepa(){
            return arepaBuilder.getArepa();
        }
        
        public void constructArepa(){
            arepaBuilder.createNewArepaProduct();
            arepaBuilder.buildTipo();
            arepaBuilder.buildSalsa();
            arepaBuilder.buildRelleno();
            arepaBuilder.buildBebida();
        }
    }
    
}

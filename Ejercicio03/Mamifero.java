package Ejercicio03;

public class Mamifero extends Animal{
    public void amamanta(){
    if(this.getSexo().equals("Macho")){
        System.out.println("Soy macho, no puedo amamantar :(");
    } else {
      System.out.println("Toma pecho, hazte grande");
    }
    }
    public void cuidaCrias() {
        System.out.println("Estoy cuidando mis crias");
      }
      
      public void anda() {
        System.out.println("Estoy andando");
      }
}

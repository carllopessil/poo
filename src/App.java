public class App {
    public static void main(String[] args) throws Exception {
      
Gato felix = new Gato();
felix.cor = "laranja";
felix.tamanho = 20;
felix.genero = "m";
felix.miar();



Conta c1 = new Conta();
c1.titular = "João";

System.out.println(c1.getSaldo());

    }
}

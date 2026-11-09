package Clinica;

public class Main {
    public static void main(String[] args) {
        Animal[] animales={
                new Perro("Negra",5,"Cristian","Criolla","POL-PERRO-001"),
                new Gato("Sancha",2,"Isabel", true, "POL-GATO-001"),
                new Ave("Volador",1,"Maria",0.7)//Mayusc para nombrar las clases y no variables
        };
        for (Animal animal : animales){
            animal.imprimirFicha();
        }
        Perro perro = (Perro) animales[0]; //esta forma de sacar la posicion es estatica
        Gato gato = (Gato) animales[1];

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Moquillo");
        gato.registrarVacuna("Sida");

        System.out.println(perro.getVacunasAplicadas());
        System.out.println(gato.getVacunasAplicadas());


        Clinica clinica= new Clinica("Vetcare","Medellín");
        Asegurable[] asegurables={
                perro,
                gato,
                clinica
        };
        for(Asegurable asegurable : asegurables){
            System.out.println(asegurable.obtenerNumeroPoliza());
            System.out.println(asegurable.calcularPrimaSeguro());
        }
        //Se entrega hasta el 3er punto del 5to;
    }
}
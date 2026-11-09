package Clinica;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String dueno;

    public Animal(String nombre, int edad, String dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha(){
        System.out.println("Ficha: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Dueno: "+this.dueno);
        System.out.println(calcularCostoConsulta());
    }

}

package Clinica;

import java.util.ArrayList;

public class Gato extends Animal implements Vacunable,Asegurable {
    boolean esEsterilizado;
    String poliza;
    ArrayList<String> vacunas;

    public Gato(String nombre, int edad, String dueno,boolean esEsterilizado,String poliza) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
        vacunas= new ArrayList<>();
        this.poliza=poliza;


    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public double calcularPrimaSeguro() {
        int seguro;
        if(esEsterilizado){
            seguro=120000;
        }else{
            seguro=200000;
        }

        return seguro;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return poliza;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }
}

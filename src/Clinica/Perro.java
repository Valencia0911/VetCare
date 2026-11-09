package Clinica;
import java.util.ArrayList;

public class Perro extends Animal implements  Vacunable,Asegurable {
    String raza;
    String poliza;
    ArrayList<String> vacunas;

    public Perro(String nombre, int edad, String dueno, String raza, String poliza) {
        super(nombre, edad, dueno);
        this.raza=raza;
        this.poliza=poliza;
        vacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000+(3000*edad);
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public String obtenerNumeroPoliza() {
        return poliza;
    }

    @Override
    public double calcularPrimaSeguro(){
        return edad*80000;
    }
}

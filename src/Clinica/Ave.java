package Clinica;

public class Ave extends Animal {
        double pesoGramos;

        public Ave(String nombre, int edad, String dueno,double pesoGramos) {
            super(nombre, edad, dueno);
            this.pesoGramos = pesoGramos;
        }

        @Override
        public double calcularCostoConsulta() {
            return 28000+(100*pesoGramos);
        }
}



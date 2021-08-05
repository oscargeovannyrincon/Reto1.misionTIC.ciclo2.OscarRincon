package reto1;

public class Exportacion {
    //ATRIBUTOS

    private int pTiempo;
    private double pCapital;
    private double pInteres;

    //METODOS

    public Double calcularInteresCompuesto(){

        double interesCompuesto=pCapital*(Math.pow(1+pInteres,pTiempo)-1);
        return interesCompuesto;
    }

    public Double calcularInteresSimple(){

        double interesSimple=pCapital*pInteres*pTiempo;
        return interesSimple;
    }

    public String compararExportacion(int pTiempo, double pCapital,double pInteres){
        double respuesta=calcularInteresCompuesto()-calcularInteresSimple();
        return String.format("La diferencia en el total de intereses generados para el proyecto, si escogemos ", format, args)
    }
}

package model;

public class Main {

  public static double calcularCalificacionFinal(double examen1, double examen2, double examen3) {

    if (!esCalificacionValida(examen1) || !esCalificacionValida(examen2) || !esCalificacionValida(examen3)) {
      throw new ArithmeticException("Todas las calificaciones deben estar entre 0 y 10.");
    }

    return (examen1 + examen2 + examen3) / 3.0;
  }

  private static boolean esCalificacionValida(double calificacion) {
    return calificacion >= 0.0 && calificacion <= 10.0;
  }

  public static void main(String[] args) {
    double calificacionFinal = calcularCalificacionFinal(8.5, 9.0, 7.5);
    System.out.println("La calificación final es: " + calificacionFinal);
  }
}
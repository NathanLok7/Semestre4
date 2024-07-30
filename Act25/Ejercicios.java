package Act25;
import java.util.*;

    public class Ejercicios {
            public static void main(String[] args) {
                // A
                Set<Date> fechas = new HashSet<>();

                for (int i = 0; i < 100000; i++) {
                    fechas.add(Date.randomDate());
                }
                
                int tamanio = fechas.size();
                System.out.println("Tamaño: " + tamaño);
                if (tamaño == 100000) {
                    System.out.println("No hay fechas repetidas");
                } else {
                    System.out.println("Si hay fechas repetidas");
                }
                
                Date.sobrescribirHashCode(true);

                int Equals = 0;
                int HashCodeA = 0;
                for (Date fecha : fechas) {
                    if (fecha.equals(new Date(1, 1, 2020))) {
                        Equals++;
                    }
                    HashCodeA++;
                }

                System.out.println("Cantidad equals: " + Equals);
                System.out.println("Llamadas a hashCode: " + HashCodeA);
                
                // D y E
                Date.sobrescribirHashCode(false);
                for (int i = 1; i <= 10; i++) {
                    Date.setFormulaHashCode(i);
                    Equals = 0;
                    HashCodeA = 0;
                    for (Date fecha : fechas) {
                        if (fecha.equals(new Date(1, 1, 2020))) {
                            Equals++;
                        }
                        HashCodeA++;
                    }
                    System.out.println("Fórmula " + i + ":");
                    System.out.println("Cantidad equals: " + Equals);
                    System.out.println("Llamadas a hashCode: " + HashCodeA);
                }
            }
        }
                
                class Date {
                    // B
                    private int dia, mes, año;
                    private static boolean sobrescribirHashCode;
                    private static int formulaHashCodeA;
                    private static int Equals;
                    private static int HashCodeA;
                    
                    public Date(int d, int m, int y) {
                        day = d;
                        month = m;
                        year = y;
                    }
                    
                    public static Date randomDate() {
                        int day = (int) (Math.random() * 28) + 1;
                        int month = (int) (Math.random() * 12) + 1;
                        int year = (int) (Math.random() * 201) + 1900;

                        return new Date(day, month, year);

                    }
                    
                    public boolean equals(Object o) {
                        Equals;
                        if (o instanceof Date) {
                            Date d = (Date) o;
                            return day == d.day && month == d.month && year == d.year;
                        }
                        return false;
                    }

                    // G
                    public int hashCode() {
                        HashCodeA;
                        if (sobrescribirHashCodeA) {
                            return 1;
                        } else {
                            int resultado = 0;
                            switch (formulaHashCodeA) {
                                case 1: 
                                    formulaA = day * month * year;
                                    return 0;
                                case 2: 
                                    int hash = 20;
                                    hash = 31 * hash + dia;
                                    hash = 31 * hash + mes;
                                    hash = 31 * hash + año;
                                    return hash;
                                
                            }
                        }
                    }                
                }
 

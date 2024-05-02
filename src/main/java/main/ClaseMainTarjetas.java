package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClaseMainTarjetas {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(ClaseMainTarjetas.class, args);

        int consumo = 0;
        double importe;
        double resultadoTasa;

        Tarjetas tarjeta1 = new Tarjetas("VISA", 1234, "Juan perez", "2030-01-01");
        Tarjetas tarjeta2 = new Tarjetas("NARA", 5678, "Pedro Sanchez", "2029-02-02");
        Tarjetas tarjeta3 = new Tarjetas("AMEX", 4321, "Roberto Guitierrez", "2028-03-03");

        Metodos metodos = new Metodos();

        Scanner scanner = new Scanner(System.in);

        Date fechaActual = new Date();

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        String fechaActualString = formato.format(fechaActual);

        Date fecha1 = formato.parse(fechaActualString);
        
        Date fecha2 = formato.parse(tarjeta1.getFechaVencimientoTarjeta());

        System.out.println(tarjeta1.toString());

        if (tarjeta1.getMarca().equals(tarjeta2.getMarca())) {
            System.out.println("La tarjeta 1 es igual a tarjeta 2");
        } else if (tarjeta1.getMarca().equals(tarjeta3.getMarca())) {
            System.out.println("La tarjeta 1 es igual a tarjeta 3");
        } else if (tarjeta2.getMarca().equals(tarjeta3.getMarca())) {
            System.out.println("La tarjeta 2 es igual a tarjeta 3");
        } else {
            System.out.println("Todas las tarjetas ingresadas son distintas");
        }

        System.out.println("Ingrese monto a consumir: ");
        consumo = Integer.parseInt(scanner.nextLine());

        if (fecha2.after(fecha1)) {
            if (consumo < 1000) {

                if (tarjeta1.getMarca().equals("VISA")) {

                    System.out.println("Ingrese año de la fecha del consumo. Debe ingresar los últimos dos números del año: ");
                    metodos.setAño(Integer.parseInt(scanner.nextLine()));
                    while (metodos.getAño() < 24) {
                        System.out.println("El año debe ser mayor a partir de 2024. Ingrese nuevamente los dos últimos números del año del consumo: ");
                        metodos.setAño(Integer.parseInt(scanner.nextLine()));
                    }

                    System.out.println("Ingrese mes de la fecha del consumo: ");
                    metodos.setMes(Integer.parseInt(scanner.nextLine()));
                    while (metodos.getMes() < 1 || metodos.getMes() > 12) {
                        System.out.println("el mes debe ser mayor igual a 1 y menor igual a 12. Ingrese un valor correcto: ");
                        metodos.setMes(Integer.parseInt(scanner.nextLine()));
                    }

                    try {
                        resultadoTasa = metodos.calculoTasaVisa();
                        System.out.println("La tasa para esta operación es: " + resultadoTasa);
                        importe=consumo*resultadoTasa;
                        System.out.println("El importe total es: "+importe);
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error");
                    }

                } else if (tarjeta1.getMarca().equals("NARA")) {

                    System.out.println("Ingrese dia del mes de la fecha del consumo: ");
                    metodos.setDia(Integer.parseInt(scanner.nextLine()));
                    while (metodos.getDia() < 1 || metodos.getDia() > 31) {
                        System.out.println("el dia debe ser mayor igual a 1 y menor igual a 31. Ingrese un valor correcto: ");
                        metodos.setDia(Integer.parseInt(scanner.nextLine()));
                    }

                    try {
                        resultadoTasa = metodos.calculoTasaNara();
                        System.out.println("La tasa para esta operación es: " + resultadoTasa);
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error");
                    }

                } else {

                    System.out.println("Ingrese mes de la fecha del consumo: ");
                    metodos.setMes(Integer.parseInt(scanner.nextLine()));
                    while (metodos.getMes() < 1 || metodos.getMes() > 31) {
                        System.out.println("el dia debe ser mayor igual a 1 y menor igual a 31. Ingrese un valor correcto: ");
                        metodos.setMes(Integer.parseInt(scanner.nextLine()));
                    }

                    try {
                        resultadoTasa = metodos.calculoTasaAmex();
                        System.out.println("La tasa para esta operación es: " + resultadoTasa);
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error");
                    }
                }

            } else {
                System.out.println("Operación inválida. No puede realizar un consumo mayor a $1000.");
            }

        } else {
            System.out.println("Tarjeta inválida para operar ya que la tarjeta vencida. Debe renovar su tarjeta");
        }

    }

}

package com.servehttp.janiserver.app;

import com.servehttp.janiserver.model.Dato;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author jesus
 */
public class Aplicacion {

    public static void main(String[] args) {
        List<Dato> datos = Arrays.asList(new Dato("unidad1", "flota", 1l, new Date(), 200.0),
                new Dato("unidad2", "flota", 2l, new Date(), 98.0),
                new Dato("unidad2", "flota", 3l, new Date(), 99.5),
                new Dato("unidad1", "flota", 4l, new Date(), 202.0),
                new Dato("unidad1", "flota", 5l, new Date(), 203.0),
                new Dato("unidad2", "flota", 6l, new Date(), 99.0),
                new Dato("unidad1", "flota", 7l, new Date(), 201.5),
                new Dato("unidad2", "flota", 8l, new Date(), 102.5)
        );

//        Map<String, List<Dato>> mapDatosUnidad;
//        mapDatosUnidad = datos
//                .stream()
//                //.sorted(Comparator.comparing(Dato::getOdometro))
//                .map(i -> {
//                    i.setIdUnidad(String.format("%s-%s", i.getUnidad(), i.getFlota()));
//                    return i;
//                })
//                .collect(Collectors.groupingBy(Dato::getIdUnidad));
        Map<String, List<Dato>> mapDatosUnidad;
        mapDatosUnidad = datos
                .stream()
                .collect(Collectors.groupingBy(i -> {
                    return String.format("%s-%s", i.getUnidad(), i.getFlota());
                }));
        System.out.println(mapDatosUnidad);

        List<String> idsMap = mapDatosUnidad
                .keySet()
                .stream()
                .collect(Collectors.toList());

        System.out.println(idsMap);

        List<Dato> todos = mapDatosUnidad
                .values()
                .stream()
                .flatMap(imps -> imps.stream())
                .sorted(Comparator.comparing(Dato::getIdDato).reversed())
                .collect(Collectors.toList());
        System.out.println(todos);

        mapDatosUnidad.entrySet()
                .stream()
                .forEach(unidad -> {
                    System.out.println("*** " + unidad + "***\n");
                    double suma = unidad.getValue()
                            .stream()
                            .collect(Collectors.summingDouble(Dato::getOdometro));
                    System.out.println(suma);
                });
    }

}

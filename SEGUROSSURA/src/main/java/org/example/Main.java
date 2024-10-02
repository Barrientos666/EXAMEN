package org.example;

import org.example.MODELOS.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Asegurado AseguradoLleno = new Asegurado(1l,"Robert","Salas","1203349873","CARRERA 12 #11-12","3124567890","robert@gmail.com","Colombiano","Agente de seguros","Atencion al cliente","soltero");
        System.out.println(AseguradoLleno);

        Asesor asesorLleno = new Asesor(2l,"JoseBerrio","1000443441","CALLE 43 #10-12","3123324567","jose@gmail.com","Colombiano", LocalDate.now(),"Asesor de seguros","Ventas","6 meses");
        System.out.println(asesorLleno);

        Beneficiario beneficiarioLleno = new Beneficiario(3l,"Matias","Alvares","1000221314","CALLE 11 #10-10","3110041012","matias@gmail.com",LocalDate.now(),"Hijo");
        System.out.println(beneficiarioLleno);

        Agencia Agencia1 = new Agencia(4l,"Agencia LEGEND","10203040","TORRE 5 MANZANA 4","3218904343","legend@gmai.com","Colombiana",LocalDate.now(),"Salud","Leonardo");
        System.out.println(Agencia1);

        Inmueble Inmueble1 = new Inmueble(5l,"CALLE 21","LOCAL COMERCIAL","2121390",100.000,200.1,2024,"Rigoberto","Nuevo");
        System.out.println(Inmueble1);


        Asegurado asegurado = new Asegurado();
        System.out.println("Digite el nombre");
        asegurado.setNombres(lea.nextLine());

        Asegurado aseguradoApellido = new Asegurado();
        System.out.println("Digite el apellido");
        asegurado.setApellido(lea.nextLine());

        Asegurado identificacionAsegurado = new Asegurado();
        System.out.println("Digite la identificacion");
        asegurado.setNumeroIdentificacion(lea.nextLine());



    }
}
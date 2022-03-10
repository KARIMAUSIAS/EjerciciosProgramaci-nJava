/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD9;

import java.io.File;

/**
 *
 * @author Karim Rezgaoui Mourad <karimasusiasmarch@gmail.com>
 * @version 1.0
 * @date 10 mar. 2022 18:44:34
 * @license default
 * @project EjerciciosProgramacionJava
 * @company DAW
 * @name PRUEBAS
 */
public class PRUEBAS {

    public static void main(String[] args) {

        File origenDir = new File("/datos/usuarios/alumnos/a003155976p/PRUEBAORIGINAL");
        File destinoDir = new File("/datos/usuarios/alumnos/a003155976p/Escritorio/PRUEBA2");
        File origenDoc = new File("C:/Temp/Media/Fotografies/Document.txt");
        File destinoDoc = new File("C:/Temp/Document.txt");

        boolean existe = origenDir.exists();
        System.out.println(existe);
        boolean res = origenDir.renameTo(destinoDir);
        System.out.println("Se ha movido y renombrado la carpeta? " + res);
       // res = origenDoc.renameTo(destinoDoc);
        //System.out.println("Se ha movido el documento? " + res);
    }

}

package UD9.EjerciciosA;

import java.io.File;

public class MiniFileManager {

    private File actual = new File("");

    public MiniFileManager() {
    }

    public String getPWD() {

        return actual.getAbsolutePath();

    }

    public boolean changeDir(String dir) {
        File f;

        if (dir.equals("..")) {
            actual = actual.getParentFile();
            return true;
        } else if (dir.contains("..")) {
            String[] ruta = dir.split("/");
            String act = actual.getAbsolutePath(), nuevo = "/";
            for (int i = 0; i < ruta.length - 2; i++) {
                nuevo = nuevo + "/" + ruta[i];
            }
            f = new File(nuevo);
            actual = f;
            return true;
        } else {
            f = new File(dir);
            if (f.exists()) {
                actual = f;
                return true;
            } else {
                return false;
            }
        }
    }

    public void help() {
        System.out.println("pwd​ : Muestra cual es la carpeta actual.\n"
                + "cd <DIR>​: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior.\n"
                + "ls​: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego\n"
                + "archivos, ambos ordenados alfabéticamente).\n"
                + "ll​: Como ls pero muestra también el tamaño y la fecha de última modificación.\n"
                + "mkdir <DIR>​: Crea el directorio ‘DIR’ en la carpeta actual.\n"
                + "rm <FILE>​ : Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si\n"
                + "tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.\n"
                + "mv <FILE1> <FILE2>​ : Mueve o renombra ‘FILE1’ a ‘FILE2’.\n"
                + "help​ : Muestra una breve ayuda con los comandos disponibles.\n"
                + "exit​ : Termina el programa.");
    }

    public void printList(boolean info) {

        File[] lista = actual.listFiles();

        if (info == false) {
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if (f.isDirectory()) {
                    System.out.println("[DIR] " + f.getName());
                } else {
                    System.out.println("[ARX] " + f.getName());
                }
            }
        }else{
            for (int i = 0; i < lista.length; i++) {
                File f = lista[i];
                if (f.isDirectory()) {
                    System.out.println("[DIR] " + f.getName());
                } else {
                    System.out.println("[ARX] " + f.getName());
                }
            }
        }

    }
}

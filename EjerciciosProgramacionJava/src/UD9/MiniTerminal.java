package UD9;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniTerminal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        MiniFileManager m = new MiniFileManager();
        String mensaje;

        do {
            System.out.print("usuario@home:~$ ");
            mensaje = lector.nextLine();

            if (mensaje.equals("help")) {
                m.help();
            } else if (mensaje.equals("pwd")) {
                System.out.println(m.getPWD());
            }else if(mensaje.contains("cd")){
                String[] mensajes = new String[2];
                mensajes = mensaje.split(" ");
                m.changeDir(mensajes[1]);
            }else if(mensaje.equals("ls")){
                m.printList(false);
            }
        } while (!mensaje.equals("exit"));

    }

}

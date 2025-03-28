import java.util.Scanner;

public class ExamenFinal {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        int opciones;
        
        //Serie 1
        System.out.println("Serie 1");
        int No1 = 3;
        
        System.out.print("Pon un numero: ");
        int no2 = Entrada.nextInt();
        System.out.print("Pon otro numero: ");
        int no3 = Entrada.nextInt();

        int resultado = no2 + (no3*No1);
        System.out.println("El resultado de la operacion es de: "+ resultado);

        System.out.println("");
        int No2 = 5;
        System.out.print("Pon un numero: ");
        int no4 = Entrada.nextInt();

        int resultado1 = (no4 * No2);
        System.out.print("El resultado de la operacion es de: " + resultado1);
        System.out.println("");

        System.out.println("");
        int No3 = 2;
        System.out.print("Pon un numero: ");

        int no5 = Entrada.nextInt();

        System.out.print("Pon un numero: ");
        int no6 = Entrada.nextInt();

        int resultado2 = (no3 / no5 * no6);
        System.out.print("El resultado de la operacion es de: " + resultado2);
        System.out.println(""); 

        int No7 = 2;
        int No8 = 3;
        
        System.out.println("");

        System.out.print("Pon un numero: ");
        int no7 = Entrada.nextInt();

        System.out.print("Pon un numero: ");
        int no8 = Entrada.nextInt();

        System.out.print("Pon un numero: ");
        int no9 = Entrada.nextInt();

        int resultado3 = no7 + (No7 + no8) + (No7 * no9);
        System.out.print("El resultado es de: " + resultado3);
        System.out.println("");
 

        System.out.println("");


        //2da serie 
            int menu;
            System.out.println("Serie 2");


            System.out.println("[1] Calcular el promedio");
            System.out.println("[2] Saluda por tu nombre");
            System.out.println("[3] Hola Mundo");
            System.out.println("[4] Salir");
            System.out.print("[?]: ");
            opciones = Entrada.nextInt();
            System.out.println();

        
            switch (opciones) {
                case 1:
                System.out.print("Pon el primer numero: ");
                int no10= Entrada.nextInt();

                System.out.print("Pon el segundo numero: ");
                int no11 = Entrada.nextInt();

                System.out.print("Pon el tercer numero: ");
                int no12 = Entrada.nextInt();

                System.out.print("El resultado del promedio de 3 numeros es de: " + (no10 + no11 + no12) / 3);

                    break;
                case 2:
                System.out.println("Hola, mi nombre es Anderson"); 

                    break;
                case 3:
                System.out.println("Hola Mundo");
                    break;
            
                default:
                System.out.println("Saliendo del programa.");
                    break;
        }
        











    }
}
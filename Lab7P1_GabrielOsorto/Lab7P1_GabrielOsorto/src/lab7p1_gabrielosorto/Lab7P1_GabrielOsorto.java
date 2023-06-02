/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_gabrielosorto;
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab7P1_GabrielOsorto {
    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
        public static void main(String[] args) {
        //declarar la matriz

        boolean seguir = true;
        while(seguir){
            System.out.println("-----Menu-----");
            System.out.println("1.She shoot, she scores!");
            System.out.println("2.Piedra, papel o ...");
            System.out.println("3.Salida papu");
            System.out.print("Escoja una opcion:");
            int opcion = sc.nextInt();
            switch (opcion){
                case 1:{
                    System.out.println("------She shoot, she scores!------");
                    System.out.print("Ingrese las filas:");
                        int f= sc.nextInt();
                    System.out.print("ingrese las columnas");
                        int c=sc.nextInt();
                        int [][]mat= new int[f][c];
                        mat=Valrep(mat);
                    ImprMatriz(mat);
                    System.out.print("ingrese la cantidad de balas que desea:");
                        int balas=sc.nextInt();
                        int midarea=(f*c/2);
                        while(balas>=(f*c)/2){
                            System.out.print("Su numero de balas tiene que ser menor que "+midarea+" ingrese una cantidad valida:");
                        balas=sc.nextInt(); 
                    }//fin while validacion balas
                    int balas1=balas;
                    int balas2=balas;
                    int score1=0;
                    int score2=0;
                        while ((balas1>0)&&(balas2>0)){
                            ImprMatriz(mat);
                            System.out.print("Jugador 1, dispare a la posicion deseada:");
                            int posi1=sc.nextInt();
                            boolean posi3=false;
                            for (int i = 0; i < mat.length; i++) {
                                for (int j = 0; j < mat.length; j++) {
                                    if (posi1 == mat[i][j]) {
                                    posi3 =true;
                                    score1+=
                                    mat[i][j]=99;
                                    break;
                                }//fin for interno   
                            }//for externo  
                        }balas1--;
                        System.out.println("Al jugador 1 le restan:"+balas1);
                        System.out.println();
                        ImprMatriz(mat);
                        System.out.print("Jugador 2, dispare a la posicion deseada:");
                        int posi2=sc.nextInt();
                        for (int i = 0; i < mat.length; i++) {
                                for (int j = 0; j < mat.length; j++) {
                                    if (posi2 == mat[i][j]) {
                                    posi3 =true;
                                    score2+=
                                    mat[i][j]=88;
                                    break;
                                }//fin for interno   
                            }//for externo  
                        }
                        balas2--;
                        System.out.println("Al jugador 2 le restan:"+balas2);
                        System.out.println();
                }//fin while
                        if(score1<score2){
                            System.out.println("¡¡Jugador 2 ha ganado!!\ncon la cantidad de puntos de "+score2);
                        }
                        else if (score2<score1){
                            System.out.println("¡¡Jugador 1 ha ganado!!\ncon la cantidad de puntos de "+score1);
                        }
                        else if(score2==score1){
                            System.out.println("¡¡HA HABIDO UN EMPATE!!");
                        }
                }//fin case 1
                break;
                case 2:{
                    System.out.println("------Piedra, papel o ...------");
                    System.out.println("1. Piedra");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijeras");
                    System.out.println("4.Lizard");
                    System.out.println("5. Spoke");
                    System.out.println("Elija que quiere usar:");
                    int op=sc.nextInt();
                    int opcompu= 1+ran.nextInt(5);
                    if ((op==1)&&(opcompu==3)){
                        System.out.println("Ganaste");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==3)&&(opcompu==1)){
                        System.out.println("HA GANADO LA COMPUTADORA PERDEDOR!!!!!");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==1)&&(opcompu==2)){
                        System.out.println("HA GANADO LA COMPUTADORA PERDEDOR!!!!!");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==2)&&(opcompu==1)){
                        System.out.println("Ganaste");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==3)&&(opcompu==2)){
                        System.out.println("Ganaste");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==2)&&(opcompu==3)){
                        System.out.println("HA GANADO LA COMPUTADORA PERDEDOR!!!!!");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==2)&&(opcompu==5)){
                        System.out.println("ganaste");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==5)&&(opcompu==2)){
                        System.out.println("HA GANADO LA COMPUTADORA PERDEDOR!!!!!");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==5)&&(opcompu==1)){
                        System.out.println("Ganaste");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    if ((op==1)&&(opcompu==5)){
                        System.out.println("HA GANADO LA COMPUTADORA PERDEDOR!!!!!");
                        System.out.println("la computadora uso:"+opcompu);
                    }
                    
                }
                break;
                case 3:{
                    System.out.println("Se acaba de salir papu :(");

                    seguir = false;
                }//fin case 3
                break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }//fin switch
        }//fin while
    }//fin static void
    public static int[][] LecMatriz( int f, int c){
     int[][] mat= new int [f][c];
     int lim=(44*2)-1;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]= 1+ran.nextInt(lim);
            }//fin interno
        }//fin externo   
    return mat;
    }//fin LecMatriz
    public static int [][]Valrep (int[][] mat1){
        int lim=(44*2)-1;
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                int random = 1+ran.nextInt(lim);
                while (verificar(mat1,random)){
                    random= 1+ran.nextInt(lim);
                }//fin while
                mat1[i][j]= random;
            }//fin for interno  
        }//fin for externo
        
    return mat1;
    }
    public static void ImprMatriz(int[][] mat1){
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print("[" + mat1[i][j] + "]" + " ");
            }//fin for interno
            System.out.println();
        }//fin for  externo
    }//fin static void Impr Matriz 
    public static boolean verificar(int[][] matriz, int num ){
        boolean esta =false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (num == matriz[i][j]) {
                    esta =true;
                }
            }
        }
        return  esta;
    }
}//fin clase

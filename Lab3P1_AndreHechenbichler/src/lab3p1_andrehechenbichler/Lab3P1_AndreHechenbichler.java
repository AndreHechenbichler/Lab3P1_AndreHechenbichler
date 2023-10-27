/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_andrehechenbichler;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class Lab3P1_AndreHechenbichler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("***MENU***");
        System.out.println("1 para succesiones");
        System.out.println("2 para pocket monsters");
        System.out.println("3 para figura");
        int opcion=leer.nextInt();
        if(opcion<=3&&opcion>0){
            switch(opcion){
                case 1:{
                        System.out.print("Inserte la diferencia entre los numeros: ");
                        int dif=leer.nextInt();
                        int dif2=dif;
                        System.out.print("Inserte su inicial de la repeticion: ");
                        int ini=leer.nextInt();
                        int ini2=ini;
                        System.out.print("Inserte la cantidad de repetciones: ");
                        int repe=leer.nextInt();
                        for(int i=0;i<repe;i++){
                            System.out.print(""+ini);
                            if(i<repe-1){
                                System.out.print(", ");
                            }
                            ini=ini+dif;
                            dif=dif+1;
                        }
                        System.out.println("");
                        System.out.print("Que numero desea ver mas adelante en la repeticion: ");
                        int ade=leer.nextInt();
                        for(int j=0;j<ade;j++){
                            ini2=ini2+dif2;
                            dif2=dif2+1;
                        }
                        System.out.println("El numero seria: "+ini2);
                    break;}
                case 2:{
                    System.out.println("Ingrese que tipo de batalla quiere");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por rondas");
                    int tipo=leer.nextInt();
                    double vid1=280.00;
                    double vid2=280;
                    double vid3=300;
                    double vid4=250;
                    int ata1=80;
                    int ata2=50;
                    int ata3=70;
                    int ata4=75;
                    System.out.println("Estadistica de los pokemones");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Girantina Vida:300 Ataque:70 Defensa:25%");
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                            System.out.println("");
                            System.out.println("Ingrese una pelea predeterminada");
                            System.out.println("1.- Sylveon vrs Dragonite");
                            System.out.println("2.- Gyarados vrs Girantina");
                            System.out.println("3.- Dragonite vrs Girantina");
                            System.out.println("4.- Girantina vrs Sylveon");
                            int pelea=leer.nextInt();
                            switch(tipo){
                                case 1:{
                                    int cont=1;
                                    switch(pelea){
                                    case 1:{
                                        while(vid1>0&&vid4>0){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid1);
                                             System.out.println("Vida de pokemon 2 "+vid4);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid1=vid1-ata4*0.85;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid4=vid4-ata1*0.80;
                                             if(vid1<=0){
                                                 vid1=0;
                                             }
                                             else if(vid4<=0){
                                                 vid4=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid1);
                                             System.out.println("Vida pokemon 2: "+vid4);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid1==0&&vid4==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             if(vid1==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             if(vid4==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                        }
                                    break;}//fin case1
                                    case 2:{
                                        while(vid2>0&&vid3>0){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid2);
                                             System.out.println("Vida de pokemon 2 "+vid3);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid2=vid2-ata3*0.90;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid3=vid3-ata2*0.75;
                                             if(vid2<=0){
                                                 vid2=0;
                                             }
                                             else if(vid3<=0){
                                                 vid3=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid2);
                                             System.out.println("Vida pokemon 2: "+vid3);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid2==0&&vid3==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             if(vid2==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             if(vid3==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                        }
                                    break;}//fin case2
                                    case 3:{
                                        while(vid4>0&&vid3>0){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid4);
                                             System.out.println("Vida de pokemon 2 "+vid3);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid4=vid4-ata3*0.80;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid3=vid3-ata4*0.75;
                                             if(vid4<=0){
                                                 vid4=0;
                                             }
                                             else if(vid3<=0){
                                                 vid3=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid4);
                                             System.out.println("Vida pokemon 2: "+vid3);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid3==0&&vid4==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             if(vid4==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             if(vid3==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                        }
                                    break;}//fin case 3
                                    case 4:{
                                        while(vid3>0&&vid4>1){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid3);
                                             System.out.println("Vida de pokemon 2 "+vid1);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid3=vid3-ata1*0.85;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid1=vid1-ata3*0.80;
                                             if(vid3<=0){
                                                 vid3=0;
                                             }
                                             else if(vid1<=0){
                                                 vid1=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid3);
                                             System.out.println("Vida pokemon 2: "+vid1);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid3==0&&vid1==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             else if(vid3==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             else if(vid1==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                        }
                                    break;}//fin case 4
                                    }//fin switch pelea
                                    
                                break;}//fin case 1 general poke
                                case 2:{
                                    System.out.println("cuantas rondas quiere hacer no puede pasar de 10");
                                    int max=leer.nextInt();
                                    if(max<=10&&max>0){
                                    int cont=1;
                                    switch(pelea){
                                        case 1:{
                                            for(int i=0;i<max;i++){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid1);
                                             System.out.println("Vida de pokemon 2 "+vid4);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid1=vid1-ata4*0.85;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid4=vid4-ata1*0.80;
                                             if(vid1<=0){
                                                 vid1=0;
                                             }
                                             if(vid4<=0){
                                                 vid4=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid1);
                                             System.out.println("Vida pokemon 2: "+vid4);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid1==0&&vid4==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             else if(vid1==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             else if(vid4==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                            }
                                        break;}//fin 1
                                        case 2:{
                                            for(int i=0;i<max;i++){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid2);
                                             System.out.println("Vida de pokemon 2 "+vid3);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid2=vid2-ata3*0.90;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid3=vid3-ata2*0.75;
                                             if(vid2<=0){
                                                 vid2=0;
                                             }
                                             if(vid3<=0){
                                                 vid3=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid2);
                                             System.out.println("Vida pokemon 2: "+vid3);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid3==0&&vid1==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             else if(vid2==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             else if(vid3==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                            }
                                        break;}//fin cae2
                                        case 3:{
                                            for(int i=0;i<max;i++){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid4);
                                             System.out.println("Vida de pokemon 2 "+vid3);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid4=vid4-ata3*0.80;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid3=vid3-ata4*0.75;
                                             if(vid4<=0){
                                                 vid4=0;
                                             }
                                             if(vid3<=0){
                                                 vid3=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid4);
                                             System.out.println("Vida pokemon 2: "+vid3);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid3==0&&vid1==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             else if(vid4==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             else if(vid3==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                            }
                                        break;}//fin 3
                                        case 4:{
                                            for(int i=0;i<max;i++){
                                             System.out.println("-------------- Ronda "+cont+"--------------");
                                             System.out.println("Vida de pokemon 1 "+vid3);
                                             System.out.println("Vida de pokemon 2 "+vid1);
                                             System.out.println("");
                                             System.out.println("Pokemon 1 a atacado!");
                                             vid3=vid3-ata1*0.80;
                                             System.out.println("Pokemon 2 a atacado!");
                                             vid1=vid1-ata3*0.75;
                                             if(vid3<=0){
                                                 vid3=0;
                                             }
                                             if(vid1<=0){
                                                 vid1=0;
                                             }
                                             System.out.println("Vida pokemon 1: "+vid3);
                                             System.out.println("Vida pokemon 2: "+vid1);
                                             System.out.println("************* Fin de la Batalla *************");
                                             if(vid1==0&&vid3==0){
                                                 System.out.println("Ninguno de los pokemones puede continuar");
                                             }
                                             else if(vid3==0){
                                                 System.out.println("Pokemon 2 a ganado");
                                            }
                                             else if(vid1==0){
                                                 System.out.println("Pokemon 1 a ganado");
                                             }
                                             cont=cont+1;
                                             System.out.println("");
                                            }
                                        }//fin 4
                                    }//fin switch 2 pelea
                                    }
                                break;}//fin 2 general
                    }//fin switch tipo
                break;}
                case 3:{
                    System.out.println("inserte un numero impar y mayor que 7:");
                    int num=leer.nextInt();
                    int result=num%2;
                    if(num>=7&&result==1){
                        for(int i=0;i<)
                    }
                }
                }// fin switch general
                    
                
            }
        }
        
    }
    

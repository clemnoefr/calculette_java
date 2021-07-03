package Calculette;

import java.util.*;

public class Calculette {
    public static void main(String [] argument){
        int a, b;
        char operateur;
        double calcul;
        Scanner lectureClavier = new Scanner(System.in);
        if(argument.length>0){
            a = Integer.parseInt(argument[0]);
            operateur=argument[1].charAt(0);
            b = Integer.parseInt(argument[2]);
        }else{
            operateur=menu();
            System.out.println("entrer la 1ere valeur");
            a=lectureClavier.nextInt();
            System.out.println("entrer la 2eme valeur");
            b=lectureClavier.nextInt();

        }
        calcul=calculer(a,b,operateur);
        afficher(a,b,operateur,calcul);

    }
    public static double calculer (int x, int y, char o) {
        double resultat =0;
        switch (o)  {
         case '+' : resultat = x + y;
                    break;
         case '-' : resultat = x - y;
                    break;
         case '/' : resultat = x / y;
                    break;
         case '*' : resultat = x * y ; 
                    break;
          }
          return resultat;
       }
      
       public static void afficher(int x, int y, char o, double r) {
         System.out.println(x + " " +o+ " "+ y + " = " + r);  
       }
       
       public static char menu()  {
        char operation ;
        char tmp;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("Je sais compter, entrer en premier l'opération choisie ");
        System.out.println("+ pour additionner ");
        System.out.println(" - pour soustraire ");
        System.out.println(" * pour pultiplier ");
        System.out.println(" / pour diviser ");
        System.out.print(" (+, -, *, /)  ? : ");
        tmp = lectureClavier.next().charAt(0);
        if(tmp == '-' || tmp == '*' || tmp == '+' || tmp == '/'){
            operation = tmp;
            return operation ;
        }else{
            System.out.println("Merci d'utiliser les opérateurs indiqués");
                        
            return menu() ;
        }
        
        }
}

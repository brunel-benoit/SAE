public class TestOperation {

    public static void main(String[] args) {
        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(s, a) ;
        System.out.println(d + " = " + d.valeur()) ; 
         try {
            if (d.valeur() == Double.POSITIVE_INFINITY || d.valeur() == Double.NEGATIVE_INFINITY){ 
                // On vérifie que le dénominateur n'est pas zéro car pas d'Exception pour les 0 type double
                System.out.println("Il y a une erreur, on ne peut pas diviser par 0." );
            }
        }

        catch (ArithmeticException e) { 
            System.out.println("Il y a une erreur, on ne peut pas diviser par 0." );
        }
       
    }
    
}

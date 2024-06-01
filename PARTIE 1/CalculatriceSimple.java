public class CalculatriceSimple {

    public static void main(String[] args){ 

    Nombre dix = new Nombre(10);
    Nombre six = new Nombre(6);
    Nombre zero = new Nombre(0);
    

    Operation a = new Addition(dix,six);
    Operation b = new Soustraction(dix, six);
    Operation c = new Multiplication(dix, six);
    Operation d = new Division(dix,zero); 
    
    System.out.println(a + " = " + a.valeur());
    System.out.println(b + " = " + b.valeur());
    System.out.println(c + " = " + c.valeur());

    
    
    try {
        System.out.println(d + " = " + d.valeur()); }
    
    catch (ArithmeticException e) { 
        System.out.println("Il y a une erreur, on ne peut pas diviser par 0." );
    }
    

    }

   
    
}

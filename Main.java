public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if(numeroIf >0) {
            System.out.println("Este número es positivo");
        }else if(numeroIf<0) {
            System.out.println("Este número es negativo");
        }else {
            System.out.println("este número es 0");
        }
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 3;
        }
        while (numeroWhile<3);
        int numeroFor = 0;
        for (int i=0; i<=3; i++){
            System.out.println(numeroFor);
            numeroFor++;
        }
        var estacion ="verano";
        switch (estacion) {
            case"verano":
            case"otoño":
            case"invierno":
            case"primavera":
                System.out.println("Estamos en "+ estacion);
           break;
            default:
                System.out.println("Esa no es una estacion");
        }
    }
}
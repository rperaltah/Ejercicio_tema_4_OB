public class Main {
    public static void main(String[] args) {
        int numeroIF = 10;
        if (numeroIF < 0)
            System.out.println("Negativo");
        else if (numeroIF > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Es Cero");
        }


        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile ++);
        }
        do { numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile <3 );


        for (int numeroFor =0; numeroFor <= 3; numeroFor++ ) {
            System.out.println(numeroFor);
        }

        String estacion = "Verano";

        switch (estacion) {
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("NO ES UNA ESTACION VALIDA");

        }

    }
}
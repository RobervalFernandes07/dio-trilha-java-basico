

public class SistemadeMedida {
    public static void main(String[] args) {
              
        String  sigla = "P";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
        }
        switch (sigla) {
            case "M":
                System.out.println("Médio");
                break;
        }
        switch (sigla) {
            case "G":
                System.out.println("Grande");
                break;
        
            default:
            System.out.println("Indefinido");
        }
    }
}

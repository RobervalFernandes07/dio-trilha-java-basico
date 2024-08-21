public class PlanoOperadora {

    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("Gb Youtube");
                break;
        }
        switch (plano) {
            case "M":
                System.out.println("Whats e Instagram grátis");
                break;
        }
        switch (plano) {
            case "B":
                System.out.println("100 minutos de ligação");   
                break;

                default:
                System.out.println("Esse plano não existe");
        }
    }

}

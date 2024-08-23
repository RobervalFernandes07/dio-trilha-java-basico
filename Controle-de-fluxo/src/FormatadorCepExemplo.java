public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado + "\nCep valido");
        
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Cep deve conter 8 números.");
        }
    }   
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() !=8)
        throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }

}

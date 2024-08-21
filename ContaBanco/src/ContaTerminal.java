import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        
       /* int numero = 1021;
        float agencia = 067-8;
        String NomeCliente = "Mario Andrade";
        float saldo = 23748;
       */ 

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá , bem-vindo ao Banco DIO.");

        System.out.println("Digite seu nome:");
        String NomeCliente = entrada.nextLine();
        
        System.out.println("Digite o seu usúario:");
        int numero = entrada.nextInt(); 

        System.out.println("Digite sua agência:");
        int agencia = entrada.nextInt();

        System.out.println("Digite seu saldo:");
        float saldo = entrada.nextFloat();


        System.out.printf("Olá , " + NomeCliente + " , obrigado por criar uma conta em nosso banco , sua agência é :\n"+ agencia + "\nConta:\n" + numero + " \nSeu saldo é : \n" + saldo + "\nO que esta disponivel para saque:\n" + saldo );



        




        
        
        
    }
}

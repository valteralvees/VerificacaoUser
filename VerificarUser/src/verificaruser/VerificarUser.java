package verificaruser;
import java.util.Scanner;

public class VerificarUser {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int codigo = 0;
        int senha = 0;
        
        do {
            System.out.println("Digite a senha para acesso ao sistema:");
            codigo = teclado.nextInt();
        }while(codigo != 8784);
        do{
            System.out.println("Agora, digite a sua senha pessoal");
            senha = teclado.nextInt();
            
        }while(senha != 9999);
        System.out.println("-----------ACESSO LIBERADO------------");
        
        
        
        
        
        
    }
    
}

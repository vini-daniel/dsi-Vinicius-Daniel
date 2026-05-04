import java.util.Scanner;

public class Exemplocomparação{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade:");
        int idade =scanner.nextInt();

        if(idade >=16){
            System.out.println("você pode votar parabéns");

            
        }
        else{
            System.out.println("você não pode votar parabéns você é um lixo");

        }

        scanner.close();


    }
}
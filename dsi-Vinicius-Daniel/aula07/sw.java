package aula07;

public class sw {

    public static void main(String[] args){
        //A instrução switch permite testar a igualdade de uma variável com base em uma lista de valores.
        //serve pra não precisar ficar escrevendo um monte if..else
        int Silis=4;
        switch (Silis){
            case 1:
        System.out.println("o Silis é muito feio");
        break;//o break serve pra voce falar pra ele ignorar até achar o que voce quer que nesse é exemplo é o case4
        case 2:
            System.out.println("o Silis é cabeludo");
            break;
            case 3:
                System.out.println("o Silis tem fisico de atleta");
            break;
            case 4:
                System.out.println("O Silis é o melhor professor do curso");

        }


     }
}


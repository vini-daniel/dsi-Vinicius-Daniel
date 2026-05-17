package aula05;

public class atribuição {
    public static void main(String[] args) {
        
        //= atribuir valor a variavel
        int x = 10; // atribuição simples

        //+= soma o valor a variavel
        x += 5;  //mesma coisa que x=x+5
        System.out.println(x);

        //-= subtraai o valor da variavel 
        x -=3; //mesma coisa que x=x-3
        System.out.println(x);

        // *= multiplica o valor da variavel 
        x *=2;// mesma coisa que x=x*2
        System.out.println(x);

        // divide o valor da variavel 
        x/=4;// mesma coisa que x=x/4
        System.out.println(x);

        // resto da divisão(é o numero que sobra quando um numero inteiro não é exatamente divisivel por outro )
        x%=4;// mesma coisa que x= x%4
        System.out.println(x);

        // interseção dos bits (AND/E)
        x&=3;// mesma coisa que x=x&3, que é mesma coisa que x=x e 3
        System.out.println(x);

        // união dos bits:1|0=1, 1|1=1, 0|0=0 (OR/OU)
        x|=3; // mesma coisa x=x|3
        System.out.println(x);

        // Diferença dos(XOR/Exclusivo) 
        x^=3; // mesma coisa que x=x^=3
        System.out.println(x);

         //move os bits para a direita(divide mais ou menos por 2)
         x>>=3;// mesma coisa que que x= x >> 3
         System.out.println(x);

         // move os bits para a esquerda(multiplica por 2)
         x<<=3;//mesma coisa que x=x<<3
        System.out.println(x);
        

    }
}

package aula07;
 
public class whil {
 public static void main(String[] args) {
    
   int truco = 1;

while (truco <= 6) {  
    //while serve pra falar enquanto o 6 for <=6
    //a contagem começa no 1 enquanto/while truco for menor q 6 vai mostrar desco e se não for(else) vai mostrar fico
  if (truco < 6) {
    System.out.println("desco!");
  } else {
    System.out.println("fico");
  }
  truco = truco + 1;
     
}
    
 }
}
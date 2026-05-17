package aula07;

public class brea {
    public static void main(String[] args) {
        
    
    int[] numbers = {3, -1, 7, 0, 9};

//continue serve para continuar o loop ate voce achar o que deseja
// break serve  para parar o loop quando o que voce quer é achado 

for (int n : numbers) {
  if (n < 0) {
    continue; // pule numeros negativos
  }
  if (n == 0) {
    break; // pare de repetir quando o 0 é achado 
  }
  System.out.println(n);
}
    
}
}
package aula07;

public class forloop {
public static void main(String[] args) {
    

//diferentemente do while o for loop serve para  quando você quer definir quantas vezes aquele loop vai acontecer
int n = 5;
int fato = 1;

for (int i = 1; i <= n; i++) {
  fato *= i;
}

System.out.println("Fatorial of " + n + " is " + fato);
// Output: Fatorila de 5 é 120
    
}
}

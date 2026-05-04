public class Exemplocomparação{
    public static void main(String[] args) {
        int age=26;
        System.out.println(age>=18);//true, velho o sufuiciente pra votar, maior ou igual
        System.out.println(age<=18);//false, muito novo para votar, menor ou igual
         
        boolean émaiordeidade=true;
        boolean émenordeidade=false;

        System.out.println("pode votar:" + (émaiordeidade && !) );


    }
}
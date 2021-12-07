package Aula03;

public class Exer04 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int cont = 0;

        while (popA < popB){
            popA += (popA * 3) / 100;
            popB += (popB * 1.5) / 100;
            cont++;
        }

        System.out.println(popA);
        System.out.println(popB);
        System.out.println(cont);
    }
}

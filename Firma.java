package firma;
import java.util.Scanner;
class Sotrudnik{
    String fam, im, otch, doljnost;
    int oklad;
}
public class Firma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in,"cp1251");
        System.out.println("Введіть кількість співробітників =>");
        int kol=sc.nextInt();
        sc.nextLine();
        Sotrudnik[]sotr=new Sotrudnik[kol];//отримано посилання на масив

// співробітників

        System.out.println("Введіть інформацію про кожного співробітника:");
        for (int i = 0; i<sotr.length; i++) {
            sotr[i]= new Sotrudnik(); // отримано посилання на i-тий елемент
// Присвоєння значень полям
            System.out.print("Введіть прізвище "+(i+1)+" співробітника =>");
            sotr[i].fam = sc.nextLine ();
            System.out.print("Введіть його ім'я =>");
            sotr[i].im=sc.nextLine();
            System.out.print("Введіть його по батькові =>");
            sotr[i].otch=sc.nextLine();
            System.out.print("Введіть його посаду =>");
            sotr[i].doljnost=sc.nextLine();
            System.out.print("Введіть його оклад =>");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine(); //очищення буфера
        } // end for
        System.out.println("\nСпівробітники фірми:\n фам\tім'я\tотч\tпосада  \tОклад");
        for (int i = 0; i<sotr.length; i++) {
            System.out.println(sotr[i].fam+"\t"+sotr[i].im +"\t"+sotr[i].otch
                    +"\t" +sotr[i].doljnost +"\t\t"+sotr[i].oklad);
        }
    }
}
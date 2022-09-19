package Mountains1;//Пакет у якому розміщуємо даний проект
import java.util.Scanner;//Підкл можливість ввід\вивід

//Класс,який відповідає за створення інфи про гори
class Mountains{
    String nameOfMoun,placeOfDisloc;
    int highOfMoun;
}
public class Mountain {
    public static void addDataToProgramm(Mountains[] mon,Scanner sc)
    {
        System.out.println("Введіть інформацію про кожну гору:");
        //Цикл за допомогою якого заповнюємо дані про гори
        for (int i = 0; i < mon.length; i++) {
            mon[i] = new Mountains();
            System.out.print("Введіть назву " + (i + 1) + " гори =>");
            mon[i].nameOfMoun = sc.nextLine();
            System.out.print("Введіть місце розташування " + (i + 1) + " гори =>");
            mon[i].placeOfDisloc = sc.nextLine();
            System.out.print("Введіть висоту " + (i + 1) + " гори =>");
            mon[i].highOfMoun = sc.nextInt();
            sc.nextLine(); // очищення буфера
        }
    }
    public static void FindMaxValue(Mountains[] mon,Scanner sc)
    {
        int max = mon[0].highOfMoun;//Зміна для пошуку найбільшого числа
        int index = 0;//Зміна додатковий індекс
        //Цикл для пошуку найбільшох вершини
        for (int i = 0; i < mon.length; i++) {
            if (max < mon[i].highOfMoun) {
                max = mon[i].highOfMoun;
                index = i;
            }
        }
        System.out.println("Гора " + (mon[index].nameOfMoun) + " має навищу вершину " + (mon[index].highOfMoun) + " м.");
    }
    public static void TheBigMount(Mountains[] mon,Scanner sc){
        //Цикл для пошуку вершини, яка більше 1000
        for (int i = 0; i < mon.length; i++) {
            if (mon[i].highOfMoun > 1000) {
                System.out.println("Гора " + (mon[i].nameOfMoun) + " має вершину " + (mon[i].highOfMoun) + " м. Яка більше за 1000 м");
            }
        }
    }
    public static void SortOfHighMon(Mountains[] mon,Scanner sc)
    {
        //Цикл для сортування об'єктів
        for (int i = 0; i < mon.length-1; i++) {
            int currentElem = mon[i].highOfMoun;
            for (int j = 0; j < mon.length-1-i; j++) {
                if (currentElem>mon[j+1].highOfMoun)
                {
                    Mountains mon1 =mon[j];
                    mon [j] = mon [j + 1];
                    mon [j + 1] = mon1;
                }
                else {continue;}
            }
        }
        //Цикл для виведення об'єктів
        for (int i = 0; i < mon.length; i++)
        {
            System.out.println(mon[i].nameOfMoun);
        }
    }

    public static void SearchOrEditData(Mountains[] mon,Scanner sc)
    {
        String editOfSearch;//Змінна для пошуку/редагування полей
        System.out.println("Ви бажаєте зробити пошук даних або змінити дані? ");
        editOfSearch=sc.nextLine();

        //Конструктор switch для реалізації пошуку/редагування полей
        switch (editOfSearch){
            case ("search"):

                String mount;//Змінна для пошуку поля за назвою вершини
                System.out.println("Введіть назву вершини,яка вас цікавить => ");
                mount=sc.nextLine();

                //Цикл для пошуку за назвою вершини
                for(int i=0;i<mon.length;i++) {
                    if (mon[i].nameOfMoun.equals(mount)) {
                        System.out.println("Гора " + (mon[i].nameOfMoun) + " має вершину " + (mon[i].highOfMoun) + " м. Та знаходиться у " + (mon[i].placeOfDisloc) + ".");
                    }
                }
                break;

            case ("edit"):

                System.out.println("Введіть назву вершини,яка вас цікавить => ");
                mount=sc.nextLine();

                //Цикл обирання варіантів серед редагувань
                for(int i=0;i<mon.length;i++)
                {
                    if(mon[i].nameOfMoun.equals(mount)) {

                        int numberOfEdit = 0;//Зміна для можливості обрати різві варіанти редагування
                        System.out.println("Наберіть: 1-якщо хочете змінити назву, 2-якщо хочете змінити місце розташування, 3-висоту вершини =>");
                        numberOfEdit = sc.nextInt();

                        //Конструктор switch для реалізації редагування полей
                        switch (numberOfEdit) {
                            case (1):

                                String newNameOfMon;//Зміна для можливості змінити назву вершини
                                System.out.println("Введіть нову назву вершини => ");
                                newNameOfMon = sc.nextLine();
                                mon[i].nameOfMoun = newNameOfMon;

                                //Цикл для виведення нових даних
                                for(int j=0;j<mon.length;j++)
                                {
                                    if(mon[j].nameOfMoun.equals(mount))
                                    {
                                        System.out.println("Гора " + (mon[j].nameOfMoun) + " має вершину " + (mon[j].highOfMoun) + " м. Та знаходиться у "+(mon[j].placeOfDisloc)+".");
                                    }

                                }
                                break;
                            case (2):

                                String newPlaceOfMon;//Зміна для можливості змінити місце розташування
                                System.out.println("Введіть новe місце розташування вершини => ");
                                newPlaceOfMon = sc.nextLine();
                                mon[i].placeOfDisloc = newPlaceOfMon;

                                //Цикл для виведення нових даних
                                for(int j=0;j<mon.length;j++)
                                {
                                    if(mon[j].nameOfMoun.equals(mount))
                                    {
                                        System.out.println("Гора " + (mon[j].nameOfMoun) + " має вершину " + (mon[j].highOfMoun) + " м. Та знаходиться у "+(mon[j].placeOfDisloc)+".");
                                    }

                                }
                                break;
                            case (3):

                                int newHighOfMon;//Зміна для можливості змінити висоту вершини
                                System.out.println("Введіть новe значення висоти вершини => ");
                                newHighOfMon = sc.nextInt();
                                mon[i].highOfMoun = newHighOfMon;

                                //Цикл для виведення нових даних
                                for(int j=0;j<mon.length;j++)
                                {
                                    if(mon[j].nameOfMoun.equals(mount))
                                    {
                                        System.out.println("Гора " + (mon[j].nameOfMoun) + " має вершину " + (mon[j].highOfMoun) + " м. Та знаходиться у "+(mon[j].placeOfDisloc)+".");
                                    }

                                }
                                break;
                            default:
                                System.out.println("Такого значення немає!");
                        }
                    }
                }
                break;
            default:
                System.out.println("Приємного користування!");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp1251");//Створимо об'ект сканеру для маніпуляції даними
        System.out.println("Введіть кількість гор =>");
        int count = sc.nextInt();
        sc.nextLine(); // Очищення буфера
        Mountains[] mon = new Mountains[count];

        addDataToProgramm(mon,sc);//Метод заповнення даних

        FindMaxValue(mon,sc);//Метод пошуку найбільшого числа

        TheBigMount(mon,sc);//Метод вершини більше 1000

        SortOfHighMon(mon,sc);//Метод для сортування за зростанням

        SearchOrEditData(mon,sc);//Метод для пошуку або редагування

    }
}
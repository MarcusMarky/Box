//HWP10:
public class Application {
    public static void main(String[] args) {
//A:  Crearea a două boxe
        Box firstBox = new Box();
        Box secondBox = new Box();

//B:  Creați și puneți într-o cutie - o carte și în alta - o revistă
        Book book = new Book("Tema pentru acasa", 408, "Nicolae Dabija", 2013);
        firstBox.setContent(book);

//B:  Creați și puneți într-o cutie - o carte și în alta - o revistă
        Journal journal = new Journal("JDM branded magazines about Japanese cars", 92, "Cars");
        secondBox.setContent(journal);

//C: Afisati ambele casete către consolă
        System.out.println("\nContinutul primei cutii: " + firstBox.getContent());
        System.out.println("\nContinutul celei de-a doua cutii: " + secondBox.getContent() + "\n");
    }
}
//D: Se poate „pune” aceeași carte în ambele cutii?

/* Nu, nu se poate pune aceeasi carte in ambele cutii simultan deoarece un obiect poate exista doar într-o singură instanță.
Atunci cand atribuim o carte unei cutii, logic ca aceasta devine continutul acelei cutii si automat nu o mai putem amplasa intr-o alta cutie in acelasi timp.
*/ 

//E: Dacă modificați titlul unei cărți din prima casetă după punctul 10.4, se va schimba și titlul cărții din a doua casetă? Dacă da - de ce?

// Nu, modificarea titlului unei carti din prima cutie nu va schimba titlul cartii din a doua cutie, fiindca fiecare cutie contine o copie separată a cartii, iar modificarile facute asupra unei copii nu afectează celelalte copii.
 
 
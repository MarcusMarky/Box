//HWP1: Explicați în comentariul 1 ...  ce vă spune interfața ThingInteface?
/* Aceasta Interfata ,,ThingInteface'' imi comunica ca contine doua metode 1. ,,setName'' si ,,getName'' care seteaza numele obiectului si care returneaza numele obiectului.
 Astfel ca interfata este folosita pentru setarea și obtinerea numelui unui obiect.
 */
//HWP2: Ca parte a celui de-al doilea comentariu, scrieți într-o propoziție ceea ce înțelegeți deja despre conținutul „ThingInteface” folosind „Expresive Coding” ca bază?
/* Continutul interfetei ,,ThingInteface'' imi da de inteles ca prin variabila ,,content'' poate stoca orice obiect care implementează interfata ,,ThingInteface''.
  Aceasta variabila mai poate fi utilizata pentru a reprezenta obiecte de diferite tipuri care îndeplinesc cerintele interfetei.
  */
interface ThingInterface {
    public void setName(String name);
    public String getName();
}
//HWP3:
public class Box {
    private ThingInterface content;
//HWP4/7P:
    public Box() {
        
    }

    public Box(ThingInterface content) {
        this.content = content;
    }

    
    public ThingInterface getContent() {
        return content;
    }

    public void setContent(ThingInterface content) {
        this.content = content;
    }
}

/* HWP5: Declarați încă 2 clase Book și Journal - implementând interfața lucrurilor, adăugați proprietăți în fiecare clasă: Integer pages și String title (număr de pagini și titlu). 
În Book adăugați o altă proprietate String authorName - numele autorului și Integer publishingYear - anul emiterii. În Jurnal adăugați proprietatea String category - categoria revistei (de exemplu - sport, despre mașini, despre politică).
*/ 

/* HWP9: Răspundeți la întrebarea: stiind că proprietatea title din clasa cărții (Book) este privată și sa zicem, avem 2 obiecte din această clasă ( Book: oneBook, anotherBook ) - poate `` `oneBooksa acceseze proprietateaanotherBook.title``` direct - ? Argumentati!
 Nu deoarece proprietatea title este declarata ca privata in clasa Book.
 Pentru a accesa proprietatea ,,title'' a obiectului ,,anotherBook'' din obiectul ,,oneBook'', ar trebui sa folosim metodele ,,get/set'' din clasa Book. 
 */

public class Book implements ThingInterface {
    private String title;
    private Integer pages;
    private String authorName;
    private Integer publishingYear;
//HWP7: Suplimentează toate clasele cu constructori impliciti și parametrizați
    public Book() {
        
    }

    public Book(String title, Integer pages, String authorName, Integer publishingYear) {
        this.title = title;
        this.pages = pages;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
//HWP6: Toate proprietățile menționate trebuie să fie protejate de intruziunea externă DIRECTĂ de setter și getter
    private void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getPages() {
        return pages;
    }

    private void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    private void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }
    

    @Override
    public void setName(String name) {
        this.title = name;
    }

    @Override
    public String getName() {
        return title;
    }
//HWP8: Suprascrierea metodei toString() pentru toate clasele
    @Override
    public String toString() {
        return "\nBook: " + title + " | pages: " + pages + " | authorName: " + authorName + " | publishingYear: " + publishingYear + " |";
    }
}


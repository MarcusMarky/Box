/*HWP5: Declarați încă 2 clase Book și Journal - implementând interfața lucrurilor, adăugați proprietăți în fiecare clasă: Integer pages și String title (număr de pagini și titlu). 
În Book adăugați o altă proprietate String authorName - numele autorului și Integer publishingYear - anul emiterii. În Jurnal adăugați proprietatea String category - categoria revistei (de exemplu - sport, despre mașini, despre politică).
*/ 
public class Journal implements ThingInterface {

    private String title;
    private Integer pages;
    private String category;
//HWP7: Suplimentează toate clasele cu constructori impliciti și parametrizați
    public Journal() {
      
    }

    public Journal(String title, Integer pages, String category) {
        this.title = title;
        this.pages = pages;
        this.category = category;
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

    private void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
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
        return "\nJournal title: " + title + " | pages: " + pages + " | category: " + category + " |";
    }
    
}

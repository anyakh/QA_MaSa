
class book {
    // Класс Book, хранит следующую информацию о каждой книге:
// ØНазвание книги
// ØАвтор книги
// ØМетоды getTitle()
//  (возвращает название книги), toString() (возвращает название книги и автора одной строкой).
    String Book_name;
    String Author;
    public book (String x, String y){
        this.Book_name = x;
        this.Author = y;
    }
    public void getTitle(){
        System.out.println("Название книги: " + Book_name);
    }

}

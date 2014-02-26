import java.util.Map;
import java.util.TreeMap;

public class testClass {
 public static void main(String args[]) {
  Map<String, String> listBooks = new TreeMap<>();
  listBooks.put("ISBN525423", "Odyssey");
  listBooks.put("ISBNGGD43245", "Sherlock Holmes' Adventures");
  System.out.println("Key>ISBN525423 is the book: "+listBooks.get("ISBN525423"));
  System.out.println("All the keys..." + listBooks.keySet().toString());
 }
}


class Book implements Comparable<Book>{
 private String id;
 private String title;
 
 Book (String name, String title) {
  setId(name);
  setTitle(title);
 }
 
 @Override
 public int compareTo(Book book) {
  return this.id.compareTo(book.getId());
 }
 
 @Override
 public boolean equals(Object o) {
  if (!(o instanceof Book)) {
   throw new ClassCastException("The objects are not the same");
  }
  Book b = (Book) o;
  return b.id.equals(this.id);
 }
 
 @Override
 public int hashCode(){
	return id.hashCode();
	 
 }
 
 public void setId(String title) {
  this.id = title;
 }
 
 public void setTitle(String edition) {
  this.title = edition;
 }
 
 public String getId() {
  return id;
 }
 
 public String getTitle() {
  return title;
 }
 
 @Override
 public String toString() {
	 return id;
 }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gemina_activity2;


import java.util.LinkedList;

           
public class Gemina_Activity2 {
    class Book{
        
        private String author;
        private String title;
        private String isbn;
        
        public Book(String author,String title,String isbn){
            this.author = author;
            this.title = title;
            this.isbn = isbn;
            
        }
    public String getAuthor() {
        return author;
    }
        public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
    }
  
    class Library{
        private LinkedList<Book> booksByAuthor;
        private LinkedList<Book> booksByTitle;
        private LinkedList<Book> booksByIsbn;
        
        public Library(){
            
            booksByAuthor = new LinkedList<>();
            booksByTitle = new LinkedList<>();
            booksByIsbn = new LinkedList<>();
        }
        public void addBook(Book book){
            booksByAuthor.add(book);
            booksByTitle.add(book);
            booksByIsbn.add(book);
        }
        public LinkedList<Book> findBooksByAuthor(String author){
            LinkedList<Book> result = new LinkedList<>();
            for (Book book : booksByAuthor){
                if(book.getAuthor().equalsIgnoreCase(author)){
                    result.add(book);
                }
            }
            return result;
        }
        public LinkedList<Book> findBooksByTitle(String title){
            LinkedList<Book> result = new LinkedList<>();
            for (Book book : booksByTitle){
                if(book.getTitle().equalsIgnoreCase(title)){
                    result.add(book);
                }
            }
            return result;
        }
        public LinkedList<Book> findBooksByIsbn(String isbn){
            LinkedList<Book> result = new LinkedList<>();
            for (Book book : booksByIsbn){
                if(book.getIsbn().equalsIgnoreCase(isbn)){
                    result.add(book);
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {
        
       //Library library = new Library();
       
       //Book book1 = new Book ("James Gemina","The Wonderer", "568343432");
       //Book book2 = new Book ("Zhong li","The Taste of Osmanthus wine", "75638321");
       //Book book3 = new Book ("Hu Tao","The Legendary Ghost", "23125128");
       //Book book4 = new Book ("Xin Xiao", "How To Use A Spear", "94820135");
       //Book book5 = new Book ("Xiang ling","Chinise Cook Book","78539412");
       
       
       //library.addBook(book1);
       //library.addBook(book2);
       //library.addBook(book3);
       //library.addBook(book4);
       //library.addBook(book5);
       
       
       
        //Dina makaya sirr mao rani akong makaya T_T huhu tapos wala nakoy oras diri sa comlab3 kay bawal na mag overtime HAHAHA
    }     // huhuhu sirr dina makaya HAHAHAH sorry T_T
}

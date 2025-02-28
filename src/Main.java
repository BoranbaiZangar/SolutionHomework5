//1 - task
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] massiv = new int[n];
//        for(int i = 0; i < massiv.length; i++){
//            try{
//                massiv[i] = (int)Math.pow(in.nextInt(),2);
//                System.out.print(massiv[i] + " ");
//            }catch(InputMismatchException e){
//                in.next();
//                System.out.print(0 + " ");
//            }
//        }
//    }
//}

//2 - task
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int result;
//        int a;
//        try{
//            a = in.nextInt();
//            result = n/a;
//            System.out.println(result);
//
//        }catch(ArithmeticException e){
//
//            System.out.print("Division by zero");
//        }
//
//
//    }
//}

//3 - task
//public class Worker {
//    private String name;
//    private String surname;
//
//    public Worker() {}
//
//    public Worker(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//}
//
//
//
//
//
//public class Company {
//    private String name;
//    private Worker director;
//
//    public Company() {}
//
//    public Company(String name, Worker director) {
//        this.name = name;
//        this.director = director;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Worker getDirector() {
//        return director;
//    }
//
//    public void setDirector(Worker director) {
//        this.director = director;
//    }
//
//    public String getData() {
//        try {
//            return "Company name: " + name + ". Information about director -> " + director.getName() + " " + getDirector().getSurname() + ".";
//        } catch (Exception e) {
//            return "Data not found";
//        }
//    }
//}

//4 - task
//public class Book {
//    private int id;
//    private String name;
//    private String author;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public Book() {
//    }
//
//    public Book(int id, String name, String author) {
//        this.id = id;
//        this.name = name;
//        this.author = author;
//    }
//    public String getData(){
//        return "ID: "+getId()+". NAME: "+getName()+". AUTHOR: "+getAuthor()+".";
//    }
//}
//
//
//public class Library {
//    private String name;
//    private String city;
//    private Book books[] = new Book[5];
//    private int index = 0;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public Book[] getBooks() {
//        return books;
//    }
//
//    public void setBooks(Book[] books) {
//        this.books = books;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }
//
//    public Library() {
//    }
//
//    public Library(String name, String city) {
//        this.name = name;
//        this.city = city;
//    }
//
//    public Library(String name, String city, Book[] books, int index) {
//        this.name = name;
//        this.city = city;
//        this.books = books;
//        this.index = index;
//    }
//
//    public void addBook(Book book) {
//        try {
//            books[index] = book;
//            index++;
//        } catch (Exception e) {
//            System.out.println("The library is full");
//        }
//
//    }
//
//    public void printBooks() {
//        for (int i = 0; i < index; i++) {
//            try {
//                System.out.println(books[i].getData());
//            } catch (Exception e) {
//                System.out.println("The book is empty");
//            }
//        }
//    }
//}

//5 - task
//java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            try {
//                int a = in.nextInt();
//                sum+=a;
//            }catch (Exception e){
//                in.next();
//            }
//        }
//        System.out.println(sum);
//    }
//}

//6- task
//java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        boolean go = true;
//        while (go) {
//            try {
//                int a = in.nextInt();
//                int b = in.nextInt();
//                go = false;
//                System.out.println("Sum of numbers: " + (a + b));
//            } catch (Exception e) {
//                in.next();
//                System.out.println("Error: Invalid data entered. Try again");
//            }
//        }
//    }
//}
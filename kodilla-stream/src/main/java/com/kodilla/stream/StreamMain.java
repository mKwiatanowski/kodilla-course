package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StreamMain {

     public static void main(String[] args) {
/*
          BookDirectory theBookDirectory = new BookDirectory();
         List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                  .filter(book -> book.getYearOfPublication() > 2005)
                  .collect(Collectors.toList());

          System.out.println("# elements: " + theResultListOfBooks.size());
          theResultListOfBooks.stream()
                  .forEach(System.out::println);

          Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                  .filter(book -> book.getYearOfPublication() > 2005)
                  .collect(Collectors.toMap(Book::getSignature, book -> book));

          System.out.println("# elements: " + theResultMapOfBooks.size());
          theResultMapOfBooks.entrySet().stream()
                  .map(entry -> entry.getKey() + ": " + entry.getValue())
                  .forEach(System.out::println);


          BookDirectory theBookDirectory2 = new BookDirectory();
          String theResultStringOfBooks = theBookDirectory2.getList().stream()
                  .filter(book -> book.getYearOfPublication() > 2005)
                  .map(Book::toString)
                  .collect(Collectors.joining(",\n","<<\n","\n>>"));

          System.out.println(theResultStringOfBooks);

*/

          Forum theForum = new Forum();
          Map<Integer, ForumUser> theResultMapOfUser = theForum.getUserList().stream()
                  .filter(forum -> forum.getSex() == 'M')
                  .filter(forum -> forum.getDateOfBirth().isBefore(LocalDate.now().minusYears(20)))
                  .filter(forum -> forum.getNumberOfPosts() >= 1)
                  .collect(Collectors.toMap(ForumUser::getUserId, forum -> forum));
          System.out.println("Number of elements in Map: " + theResultMapOfUser.size());

          theResultMapOfUser.entrySet().stream()
                  .map(entry -> entry.getKey() + ": " + entry.getValue())
                  .forEach(System.out::println);

     }
}

//package org.example;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//public class BookServiceTest {
//
//    @Test
//    public void testFindPublicationYear() {
//        BookService bookService = new BookService();
//        BookDao mockBookDao = Mockito.mock(BookDao.class);
//        bookService.setBookDao(mockBookDao);
//        Mockito
//                .when(mockBookDao.findPublicationDate(Mockito.anyInt()))
//                .thenReturn("1894-12-07");
//
//        int publicationYear = bookService.findPublicationYear(5);
//        Assertions.assertEquals(1894, publicationYear);
//    }
//}
//
//class BookService {
//
//    private BookDao bookDao;
//    private DateService dateService = new DateService();
//    private int leastExpectedYear = 1700;
//
//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//
//    public int findPublicationYear(int bookId) {
//        String creationDate = bookDao.findPublicationDate(bookId);
//        int publicationYear = dateService.getYear(creationDate);
//        if (publicationYear < leastExpectedYear) {
//            throw new IllegalArgumentException("Год слишком маленький: где-то произошла ошибка");
//        }
//        return publicationYear;
//    }
//}
//
//class BookDao {
//
//    public String findPublicationDate(int bookId) {
//        //логика для поиска даты публикации в базе данных
//        return "1998-11-24";
//    }
//}
//
//class DateService {
//    public int getYear(String dateString) {
//        String[] dateArray = dateString.split("-");
//        return Integer.parseInt(dateArray[0]);
//    }
//}
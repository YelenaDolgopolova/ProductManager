package domain;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

public class Book extends Product {
    @Test
    public void shouldHaveAllFieldsAndMethodFromSuperClass() {
        Book book = new Book();
//    book.
    }

    @Test
    public void shouldCastFromBaseClass() {
        Product product = new Book();
        if (product instanceof Book) {
            Book book = (Book) product;
//      book.
        }
    }

//    @Test
//    public void shouldNotCastToDifferentClass() {
//        Product product = new Book();
//        Smartphone smartphone = (Smartphone) product;
//    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Book();
        // Вопрос к аудитории: чей метод вызовется?
        product.toString();
    }
}

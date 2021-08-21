package manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductRepositoryTesting {
//    private Product[] items = new Product[0];
    private ProductRepository repository = new ProductRepository();
    private Book coreJava_1 = new Book();
    private Book coreJava_2 = new Book();
    private Book coreJava_3 = new Book();
    private Book coreJava_4 = new Book();
    private Smartphone Samsung = new Smartphone(1,"Galaxy", 1,"Samsung");
    private Smartphone IPhone = new Smartphone(2,"IPhone11", 1,"Apple");
    private Smartphone Honor = new Smartphone(3,"HonorA10", 1,"Honor");

    @Test
    public void shouldSaveOneItem() {
        repository.save(coreJava_1);

        Product[] expected = new Product[]{coreJava_1};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSaveSeveralItem() {
        repository.save(coreJava_1);
        repository.save(coreJava_2);
        repository.save(coreJava_3);
        repository.save(coreJava_4);

        Product[] expected = new Product[]{coreJava_1, coreJava_2, coreJava_3, coreJava_4};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddAndSavelItem() {

        repository.save(Samsung);
        repository.save(IPhone);
        repository.save(Honor);

        Product[] expected = new Product[]{Samsung, IPhone, Honor};
        Product[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

}

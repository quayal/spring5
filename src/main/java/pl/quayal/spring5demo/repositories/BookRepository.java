package pl.quayal.spring5demo.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.quayal.spring5demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

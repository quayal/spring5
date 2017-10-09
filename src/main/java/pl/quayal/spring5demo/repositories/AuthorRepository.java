package pl.quayal.spring5demo.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.quayal.spring5demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

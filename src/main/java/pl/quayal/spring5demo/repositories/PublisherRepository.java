package pl.quayal.spring5demo.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.quayal.spring5demo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

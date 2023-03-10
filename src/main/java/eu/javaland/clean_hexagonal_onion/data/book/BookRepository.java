package eu.javaland.clean_hexagonal_onion.data.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Maik Kingma
 */

@Repository
public interface BookRepository extends JpaRepository<BookJPA, Long> {
}
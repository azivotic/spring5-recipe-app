package guru.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Category;

/**
 * @author Aleksandar Zivotic
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}

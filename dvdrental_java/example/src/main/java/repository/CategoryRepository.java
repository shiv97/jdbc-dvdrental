package repository;

//import jdk.jfr.Category;
//import jdk.Category;
//import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository<Category> extends JpaRepository<Category, Long>
{

}

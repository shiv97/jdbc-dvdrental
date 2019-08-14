
package com.example.start.repositories;

        import com.example.start.model.Actor;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import com.example.start.model.Film;
        //import org.springframework.data.jpa.repository.JpaRepository;
       // import org.springframework.stereotype.Repository;
        import com.example.start.model.Category;
        //import org.springframework.data.jpa.repository.JpaRepository;
        //import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long>
{
    //ActorRepository findByname(String last_name, String first_name);
}
@Repository
public interface FilmRepository extends JpaRepository<Film, Long>
{

}
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>
{

}
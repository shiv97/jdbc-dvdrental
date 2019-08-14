package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ActorRepository extends JpaRepository<actor, Long>
    {
        //ActorRepository findByname(String last_name, String first_name);
    }


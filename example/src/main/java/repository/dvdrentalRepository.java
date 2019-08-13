
package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import net.guides.springboot2.springboot2jpacrudexample.model.Department;

import java.util.List;


@Repository
public interface dvdrentalRepository extends JpaRepository<first_name, String>
{
    dvdrentalRepository findByIdAndDeptname(String last_name, String first_name);

}

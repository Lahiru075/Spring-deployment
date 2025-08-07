package lk.ijse.gdse.springdeployements.repo;

import lk.ijse.gdse.springdeployements.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
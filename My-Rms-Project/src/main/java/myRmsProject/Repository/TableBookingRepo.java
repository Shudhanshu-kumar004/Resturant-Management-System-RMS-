package myRmsProject.Repository;

import myRmsProject.Entity.TableBookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableBookingRepo extends JpaRepository<TableBookingEntity, Long> {
}

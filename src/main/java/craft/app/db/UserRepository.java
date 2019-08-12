package craft.app.db;

import craft.app.models.Project;
import craft.app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
    //can add custom methods here if necessary
    
}
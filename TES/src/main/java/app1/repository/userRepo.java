package app1.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import app1.model.*;
@Repository
public  interface userRepo extends JpaRepository<User,String> {

	User findByUserId(Object username);

	User findByusername(Object getusername);

}

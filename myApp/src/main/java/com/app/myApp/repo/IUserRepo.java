package com.app.myApp.repo;

import com.app.myApp.model.UserC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<UserC,Integer> {
    UserC findFirstByUserEmail(String userEmail);
}

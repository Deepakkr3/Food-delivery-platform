package com.app.myApp.repo;

import com.app.myApp.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITokenRepo extends JpaRepository<Token,Integer> {
    Token findFirstByTokenId(Integer id);
}

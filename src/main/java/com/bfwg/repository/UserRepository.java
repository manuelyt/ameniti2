package com.bfwg.repository;

import com.bfwg.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by manu on 2018-3-8.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}


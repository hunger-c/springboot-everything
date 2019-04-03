package com.orange.dao;

import com.orange.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Z.C.Hemon on 2019/4/2 9:34.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}

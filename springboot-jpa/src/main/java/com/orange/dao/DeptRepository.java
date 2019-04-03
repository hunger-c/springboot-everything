package com.orange.dao;

import com.orange.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Z.C.Hemon on 2019/4/2 14:38.
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept,Integer> {
}

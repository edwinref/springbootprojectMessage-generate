package com.bts.appbts.Repository;


import com.bts.appbts.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>, JpaSpecificationExecutor<Users> {
    Users findUsersByEmailAndAndPassword(String email,String psw);



}

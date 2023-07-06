package com.bts.appbts.Repository;

import com.bts.appbts.Model.message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface messageRepository extends JpaRepository<message, String> {
}


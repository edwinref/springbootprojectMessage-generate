package com.bts.appbts.Repository;

import java.util.Optional;

import com.bts.appbts.Model.message;
import com.bts.appbts.Model.DefaultValues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultValuesRepository extends JpaRepository<DefaultValues, String>{

	Optional<message> findAllById(long l);


}

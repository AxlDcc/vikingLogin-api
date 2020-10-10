package com.viking.Viking.IRepository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.viking.Viking.Entity.Bitacora;
import com.viking.Viking.Entity.ModelGroup;


public interface BitacoraListRepository extends CrudRepository<Bitacora, Integer> {
	@Query("SELECT new com.viking.Viking.Entity.ModelGroup(b.id,COUNT(b.model) as num,b.model) "
			+ "FROM Bitacora as b GROUP BY b.model ")
	List<ModelGroup> groupByModel(Pageable pageable);
}

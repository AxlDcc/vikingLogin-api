package com.viking.Viking.Service;

import java.util.List;

import com.viking.Viking.Entity.Bitacora;
import com.viking.Viking.Entity.ModelGroup;


public interface BitacoraService {
	Bitacora save(Bitacora user);
	List<Bitacora> findAll();
	List<ModelGroup> groupBy();

}

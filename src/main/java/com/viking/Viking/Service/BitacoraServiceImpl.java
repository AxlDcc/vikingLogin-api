package com.viking.Viking.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.viking.Viking.Entity.Bitacora;
import com.viking.Viking.Entity.ModelGroup;
import com.viking.Viking.IRepository.BitacoraListRepository;

@Service
public class BitacoraServiceImpl implements BitacoraService {
	
	@Autowired
	private BitacoraListRepository bitacoraListR;

	@Override
	public Bitacora save(Bitacora item) {
		return bitacoraListR.save(item);

	}

	@Override
	public List<Bitacora> findAll() {
		List<Bitacora> list = new ArrayList<>();
		bitacoraListR.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public List<ModelGroup> groupBy() {
		List<ModelGroup> list = new ArrayList<>();
		
		bitacoraListR.groupByModel(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC,"num") )).iterator().forEachRemaining(list::add);
		return list;	}
}

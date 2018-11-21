package com.mumSched.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mumSched.model.Block;

public interface BlockRepository extends CrudRepository<Block, Long> {
	
	public Block findBlockByBlockMonth(@Param("blockMonth") String blockMonth);
	public List<Block> findByEntryId(Long id);
	public void delete(Long id);
	public Block findOne(Long id);
}

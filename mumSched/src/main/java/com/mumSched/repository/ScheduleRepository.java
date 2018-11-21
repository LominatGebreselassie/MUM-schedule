/*package com.mumSched.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mumSched.model.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Long> {
	
	@Query("select s from Schedule s where s.entry.id = id")
	public Schedule findScheduleByEntryId(Long id);
	

}
*/
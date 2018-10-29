package com.revature.batchservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.batchservice.entity.BatchEntity;
import com.revature.batchservice.repository.BatchRepository;

@Service
public class BatchService implements BatchServiceInterface {
    
	@Autowired
	private BatchRepository br;
	//(BatchRepository) new ClassPathXmlApplicationContext("beans.xml").getBean("batchRepository");
	
	@Override
	public List<BatchEntity> findAllBatches() {
		return br.findAll();
	}
	
	@Override
	public BatchEntity findBatchById(Integer id) {
		return br.findOne(id);
	}

	@Override
	public void createBatch(BatchEntity be) throws IllegalArgumentException {
		if(be.getTrainingName() == null || be.getTrainingType() ==null || be.getCoTrainer()==null
				|| be.getLocation() == null || be.getSkillType() == null || be.getTrainer() ==null 
				|| be.getPassingGrade() == null || be.getGoodGrade() == null || be.getEndDate() == null 
				|| be.getStartDate() == null) {
			throw new IllegalArgumentException("One of fields was null.");
		}
		if ( be.getPassingGrade() > be.getGoodGrade()) {
			throw new IllegalArgumentException("Passing Grade can not be greater than Good Grade.");
		}
		if ( be.getEndDate().compareTo(be.getStartDate()) < 0) {
			throw new IllegalArgumentException("End Date must be After Start date.");
		}
		br.save(be);
	}

	@Override
	public void updateBatch(BatchEntity be) {
		br.save(be);

	}

	@Override
	public void deleteBatch(BatchEntity be) {
		br.delete(be);

	}

}

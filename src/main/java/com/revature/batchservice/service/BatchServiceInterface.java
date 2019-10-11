package com.revature.batchservice.service;

import java.util.List;

import com.revature.batchservice.dto.Benchmark;
import org.springframework.stereotype.Service;

import com.revature.batchservice.entity.BatchEntity;

@Service
public interface BatchServiceInterface {
	
	public List<BatchEntity> findAllBatches();
	public BatchEntity findBatchById(Integer id);
	public List<BatchEntity> findCurrentBatches();
	public BatchEntity createBatch(BatchEntity be) throws IllegalArgumentException;
	public void updateBatch(BatchEntity be);
	public void deleteBatch(Integer batchId);
	public List<Integer> findBatchYears();
	public List<BatchEntity> findBatchesByYearAndQuarter(Integer year, Integer quarter);
	BatchEntity upsertBatch(BatchEntity batchEntity);
	Benchmark getBatchBenchmark(int batchId);
}

package com.msjmovie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msjmovie.dsmovie.entities.Score;
import com.msjmovie.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>  {
	
}

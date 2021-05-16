package com.kd.spring.boot.graphql.test1.dao;

import com.kd.spring.boot.graphql.test1.model.SeriesCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterDao extends JpaRepository<SeriesCharacter, Integer> { }
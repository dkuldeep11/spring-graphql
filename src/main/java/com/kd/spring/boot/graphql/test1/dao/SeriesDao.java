package com.kd.spring.boot.graphql.test1.dao;

import com.kd.spring.boot.graphql.test1.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesDao extends JpaRepository<Series, Integer> { }
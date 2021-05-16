package com.kd.spring.boot.graphql.test1.resolvers;

import com.kd.spring.boot.graphql.test1.model.Series;
import com.kd.spring.boot.graphql.test1.model.SeriesCharacter;
import com.kd.spring.boot.graphql.test1.service.SeriesService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private SeriesService service;

    public List<SeriesCharacter> characters() {
        return service.getCharacters();
    }
    public SeriesCharacter character(Integer id) {
        return service.getCharacter(id);
    }
    public List<Series> allSeries() {
        return service.getSeries();
    }
    public Series series(Integer id) {
        return service.getSeries(id);
    }
}

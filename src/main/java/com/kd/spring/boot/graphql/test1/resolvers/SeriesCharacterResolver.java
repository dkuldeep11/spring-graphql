package com.kd.spring.boot.graphql.test1.resolvers;

import com.kd.spring.boot.graphql.test1.model.Series;
import com.kd.spring.boot.graphql.test1.model.SeriesCharacter;
import com.kd.spring.boot.graphql.test1.service.SeriesService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeriesCharacterResolver implements GraphQLResolver<SeriesCharacter> {

    @Autowired
    private SeriesService seriesService;

    public Series getSeries(SeriesCharacter character) {
        return seriesService.getSeries(character.getSeries().getId());
    }
}

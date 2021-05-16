package com.kd.spring.boot.graphql.test1.service;

import com.kd.spring.boot.graphql.test1.dao.CharacterDao;
import com.kd.spring.boot.graphql.test1.dao.SeriesDao;
import com.kd.spring.boot.graphql.test1.model.Series;
import com.kd.spring.boot.graphql.test1.model.SeriesCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SeriesService {
    @Autowired
    private CharacterDao characterDao;

    @Autowired
    private SeriesDao seriesDao;

    @Transactional
    public Series createSeries(String name, Integer nrOfSeasons) {
        Series series = new Series(name, nrOfSeasons);
        return seriesDao.save(series);
    }
    @Transactional
    public List<Series> getSeries() {
        return seriesDao.findAll();
    }
    @Transactional
    public Series getSeries(Integer id) {
        Optional<Series> series = seriesDao.findById(id);
        return series.orElseThrow(() -> new IllegalArgumentException("Series 'id' not found!!!")  );
    }
    @Transactional
    public SeriesCharacter createCharacter(String name, String nickname, String occupation, LocalDate dateofbirth, Integer seriesId) {
        SeriesCharacter character = new SeriesCharacter(name, nickname, occupation, dateofbirth);
        Series series = getSeries(seriesId);
        character.setSeries(series);
        return characterDao.save(character);
    }
    @Transactional
    public List<SeriesCharacter> getCharacters() {
        return characterDao.findAll();
    }
    @Transactional
    public SeriesCharacter getCharacter(Integer id) {
        Optional<SeriesCharacter> characterOpt = characterDao.findById(id);
        return characterOpt.orElseThrow(() -> new IllegalArgumentException("Character 'id' not found!!!"));
    }
}

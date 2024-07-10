package com.VisualizationDashboard.DataVisualizationDashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VisualizationDashboard.DataVisualizationDashboard.Entity.DataEntity;
import com.VisualizationDashboard.DataVisualizationDashboard.repo.DataRepository;

import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataRepository dataRepository;

    @Override
    @Transactional
    public List<DataEntity> getAllData() {
        return dataRepository.findAll();
    }

    @Override
    public List<DataEntity> getDataByEndYear(Integer endYear) {
        return dataRepository.findByEndYear(endYear);
    }

    @Override
    public List<DataEntity> getDataByTopic(String topic) {
        return dataRepository.findByTopic(topic);
    }

    @Override
    public List<DataEntity> getDataBySector(String sector) {
        return dataRepository.findBySector(sector);
    }

    @Override
    public List<DataEntity> getDataByRegion(String region) {
        return dataRepository.findByRegion(region);
    }

    @Override
    public List<DataEntity> getDataByPestle(String pestle) {
        return dataRepository.findByPestle(pestle);
    }

    @Override
    public List<DataEntity> getDataBySource(String source) {
        return dataRepository.findBySource(source);
    }

    @Override
    public List<DataEntity> getDataBySwot(String swot) {
        return dataRepository.findBySwot(swot);
    }

    @Override
    public List<DataEntity> getDataByCountry(String country) {
        return dataRepository.findByCountry(country);
    }

    @Override
    public List<DataEntity> getDataByCity(String city) {
        return dataRepository.findByCity(city);
    }
}

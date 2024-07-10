package com.VisualizationDashboard.DataVisualizationDashboard.service;

import java.util.List;

import com.VisualizationDashboard.DataVisualizationDashboard.Entity.DataEntity;

public interface DataService {
    List<DataEntity> getAllData();
    List<DataEntity> getDataByEndYear(Integer endYear);
    List<DataEntity> getDataByTopic(String topic);
    List<DataEntity> getDataBySector(String sector);
    List<DataEntity> getDataByRegion(String region);
    List<DataEntity> getDataByPestle(String pestle);
    List<DataEntity> getDataBySource(String source);
    List<DataEntity> getDataBySwot(String swot);
    List<DataEntity> getDataByCountry(String country);
    List<DataEntity> getDataByCity(String city);
}

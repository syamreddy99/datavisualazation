package com.VisualizationDashboard.DataVisualizationDashboard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VisualizationDashboard.DataVisualizationDashboard.Entity.DataEntity;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
    List<DataEntity> findByEndYear(Integer endYear);
    List<DataEntity> findByTopic(String topic);
    List<DataEntity> findBySector(String sector);
    List<DataEntity> findByRegion(String region);
    List<DataEntity> findByPestle(String pestle);
    List<DataEntity> findBySource(String source);
    List<DataEntity> findBySwot(String swot);
    List<DataEntity> findByCountry(String country);
    List<DataEntity> findByCity(String city);
}

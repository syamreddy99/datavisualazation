package com.VisualizationDashboard.DataVisualizationDashboard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.VisualizationDashboard.DataVisualizationDashboard.Entity.DataEntity;
import com.VisualizationDashboard.DataVisualizationDashboard.service.DataService;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {
	@Autowired
	private DataService dataService;

	@GetMapping
	    public List<DataEntity> getAllData(
	            @RequestParam(required = false) Integer endYear,
	            @RequestParam(required = false) String topic,
	            @RequestParam(required = false) String sector,
	            @RequestParam(required = false) String region,
	            @RequestParam(required = false) String pestle,
	            @RequestParam(required = false) String source,
	            @RequestParam(required = false) String swot,
	            @RequestParam(required = false) String country,
	            @RequestParam(required = false) String city
	    ) {
	        if (endYear != null) {
	            return dataService.getDataByEndYear(endYear);
	        } else if (topic != null) {
	            return dataService.getDataByTopic(topic);
	        } else if (sector != null) {
	            return dataService.getDataBySector(sector);
	        } else if (region != null) {
	            return dataService.getDataByRegion(region);
	        } else if (pestle != null) {
	            return dataService.getDataByPestle(pestle);
	        } else if (source != null) {
	            return dataService.getDataBySource(source);
	        } else if (swot != null) {
	            return dataService.getDataBySwot(swot);
	        } else if (country != null) {
	            return dataService.getDataByCountry(country);
	        } else if (city != null) {
	            return dataService.getDataByCity(city);
	        } else {
	            return dataService.getAllData();
	        }
	    }

	@GetMapping("/endyear/{endYear}")
	public List<DataEntity> getDataByEndYear(@PathVariable Integer endYear) {
		return dataService.getDataByEndYear(endYear);
	}

	@GetMapping("/topic/{topic}")
	public List<DataEntity> getDataByTopic(@PathVariable String topic) {
		return dataService.getDataByTopic(topic);
	}

	@GetMapping("/sector/{sector}")
	public List<DataEntity> getDataBySector(@PathVariable String sector) {
		return dataService.getDataBySector(sector);
	}

	@GetMapping("/region/{region}")
	public List<DataEntity> getDataByRegion(@PathVariable String region) {
		return dataService.getDataByRegion(region);
	}

	@GetMapping("/pestle/{pestle}")
	public List<DataEntity> getDataByPestle(@PathVariable String pestle) {
		return dataService.getDataByPestle(pestle);
	}

	@GetMapping("/source/{source}")
	public List<DataEntity> getDataBySource(@PathVariable String source) {
		return dataService.getDataBySource(source);
	}

	@GetMapping("/swot/{swot}")
	public List<DataEntity> getDataBySwot(@PathVariable String swot) {
		return dataService.getDataBySwot(swot);
	}

	@GetMapping("/country/{country}")
	public List<DataEntity> getDataByCountry(@PathVariable String country) {
		return dataService.getDataByCountry(country);
	}

	@GetMapping("/city/{city}")
	public List<DataEntity> getDataByCity(@PathVariable String city) {
		return dataService.getDataByCity(city);
	}
}

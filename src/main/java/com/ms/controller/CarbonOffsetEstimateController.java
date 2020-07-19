package com.ms.controller;

import com.ms.model.CarbonOffsetEstimateDistanceWeightRequest;
import com.ms.model.CarbonOffsetEstimateResponse;
import com.ms.model.CarbonOffsetEstimateWeightRequest;
import com.ms.model.Weight;
import com.ms.service.CarbonOffsetEstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carbon-offset")
public class CarbonOffsetEstimateController {

    private final CarbonOffsetEstimateService carbonOffsetEstimateService;

    @Autowired
    public CarbonOffsetEstimateController(CarbonOffsetEstimateService carbonOffsetEstimateService) {
        this.carbonOffsetEstimateService = carbonOffsetEstimateService;
    }

    @PostMapping("/estimate-by-weight")
    public CarbonOffsetEstimateResponse estimateCarbonOffsetByWeight(@RequestBody CarbonOffsetEstimateWeightRequest weightRequest) {

        return carbonOffsetEstimateService.estimateCarbonOffset(weightRequest);
    }

    @PostMapping("/estimate-by-distance-weight")
    public CarbonOffsetEstimateResponse estimateCarbonOffsetByDistanceWeight(@RequestBody CarbonOffsetEstimateDistanceWeightRequest carbonOffsetEstimateDistanceWeightRequest) {

        return carbonOffsetEstimateService.estimateCarbonOffset(carbonOffsetEstimateDistanceWeightRequest);
    }
}

package com.ms.service;

import com.ms.model.CarbonOffsetEstimateDistanceWeightRequest;
import com.ms.model.CarbonOffsetEstimateResponse;
import com.ms.model.CarbonOffsetEstimateWeightRequest;

public interface CarbonOffsetEstimateService {

    CarbonOffsetEstimateResponse estimateCarbonOffset(CarbonOffsetEstimateWeightRequest request);

    CarbonOffsetEstimateResponse estimateCarbonOffset(CarbonOffsetEstimateDistanceWeightRequest request);

}

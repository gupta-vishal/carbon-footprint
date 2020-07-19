package com.ms.service.external.cloverly;

import com.ms.model.CarbonOffsetEstimateDistanceWeightRequest;
import com.ms.model.CarbonOffsetEstimateResponse;
import com.ms.model.CarbonOffsetEstimateWeightRequest;
import com.ms.service.CarbonOffsetEstimateService;
import com.ms.service.external.cloverly.response.CarbonOffsetEstimationDetails;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class CarbonOffsetEstimateServiceImpl implements CarbonOffsetEstimateService {

    private RestTemplate restTemplate;

    public CarbonOffsetEstimateServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public CarbonOffsetEstimateResponse estimateCarbonOffset(CarbonOffsetEstimateWeightRequest request) {

        HttpEntity<CarbonOffsetEstimateWeightRequest> entity = new HttpEntity<>(request, createHeaders());

        CarbonOffsetEstimationDetails response = restTemplate.postForObject(
                "https://api.cloverly.com/2019-03-beta/estimates/carbon", entity, CarbonOffsetEstimationDetails.class);

        CarbonOffsetEstimateResponse estimateCarbonOffsetEstimateResponse = new CarbonOffsetEstimateResponse();
        estimateCarbonOffsetEstimateResponse.setCurrency(response.getCost().getCurrency());
        estimateCarbonOffsetEstimateResponse.setOffset(response.getCost().getOffset());

        return estimateCarbonOffsetEstimateResponse;
    }

    @Override
    public CarbonOffsetEstimateResponse estimateCarbonOffset(CarbonOffsetEstimateDistanceWeightRequest request) {

        HttpEntity<CarbonOffsetEstimateDistanceWeightRequest> entity = new HttpEntity<>(request, createHeaders());

        CarbonOffsetEstimationDetails response = restTemplate.postForObject(
                "https://api.cloverly.com/2019-03-beta/estimates/shipping", entity, CarbonOffsetEstimationDetails.class);

        CarbonOffsetEstimateResponse estimateCarbonOffsetEstimateResponse = new CarbonOffsetEstimateResponse();
        estimateCarbonOffsetEstimateResponse.setCurrency(response.getCost().getCurrency());
        estimateCarbonOffsetEstimateResponse.setOffset(response.getCost().getOffset());

        return estimateCarbonOffsetEstimateResponse;
    }

    private HttpHeaders createHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer public_key:47800ea0ee541b4c");
        return headers;
    }
}

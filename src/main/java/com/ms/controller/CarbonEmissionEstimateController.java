package com.ms.controller;

import com.ms.model.CarbonEmissionEstimateResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("/carbon-emission")
public class CarbonEmissionEstimateController {

    private final int places = 4;

    @GetMapping("/ground-shipping")
    public CarbonEmissionEstimateResponse calculateForGroundShipping(
            @RequestParam double weightInTons,
            @RequestParam double distanceInMiles) {
        BigDecimal bd = new BigDecimal(Double.toString(0.209 * (weightInTons * distanceInMiles)));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return new CarbonEmissionEstimateResponse(bd.doubleValue());
    }

    @GetMapping("/air-shipping")
    public CarbonEmissionEstimateResponse calculateForAirShipping(
            @RequestParam double weightInTons,
            @RequestParam double distanceInMiles) {
        BigDecimal bd = new BigDecimal(Double.toString(1.278 * (weightInTons * distanceInMiles)));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return new CarbonEmissionEstimateResponse(bd.doubleValue());
    }

    @GetMapping("/rail-shipping")
    public CarbonEmissionEstimateResponse calculateForRailShipping(
            @RequestParam double weightInTons,
            @RequestParam double distanceInMiles) {
        BigDecimal bd = new BigDecimal(Double.toString(0.021 * (weightInTons * distanceInMiles)));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return new CarbonEmissionEstimateResponse(bd.doubleValue());
    }

    @GetMapping("/ocean-shipping")
    public CarbonEmissionEstimateResponse calculateForOceanShipping(
            @RequestParam double weightInTons,
            @RequestParam double distanceInMiles) {
        BigDecimal bd = new BigDecimal(Double.toString(0.0409 * (weightInTons * distanceInMiles)));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return new CarbonEmissionEstimateResponse(bd.doubleValue());
    }

}

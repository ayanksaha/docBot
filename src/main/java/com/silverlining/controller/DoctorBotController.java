package com.silverlining.controller;

import com.silverlining.model.*;
import com.silverlining.service.DoctorBotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/docBot")
public class DoctorBotController {

    @Autowired
    private DoctorBotService service;

    @GetMapping("/commonSymptoms")
    public List<String> getCommonSymptoms() {
        return service.getAllCommonSymptoms();
    }

    @PostMapping("/probableDiagnosis")
    public ProbableDiseases getProbableDiseases(@RequestBody SelectedSymptoms selectedSymptoms) {
        return service.getProbableDiagnosis(selectedSymptoms);
    }

    @PostMapping("/diagnose")
    public DiseaseSummary diagnose(@RequestBody SelectedExtraSymptoms selectedExtraSymptoms) {
        return service.diagnose(selectedExtraSymptoms);
    }

    /*@GetMapping("/openReportSummary")
    public DiseaseSummary openReportSummary(@RequestBody ReportSummaryRequest reportSummaryRequest) {
        return service.openReportSummary(reportSummaryRequest);
    }*/

}

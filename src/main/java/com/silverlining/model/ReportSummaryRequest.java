package com.silverlining.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Getter
@Setter
public class ReportSummaryRequest {
    private final String reportLink;
    private final String passcode;
}

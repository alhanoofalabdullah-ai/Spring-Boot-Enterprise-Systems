package com.alhanoof.analytics.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportScheduler {

    @Scheduled(cron = "0 0 8 * * ?")
    public void generateDailyReports() {

        System.out.println(
            "Daily Executive Reports Generated"
        );
    }
}

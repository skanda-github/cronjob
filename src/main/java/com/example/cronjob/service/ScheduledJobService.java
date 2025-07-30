package com.example.cronjob.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ScheduledJobService {

  // Runs immediately on startup, then every 30 seconds:
  @Scheduled(initialDelayString = "${scheduler.initial-delay-ms}",fixedRateString    = "${scheduler.fixed-rate-ms}")
  public void runJob() {
    System.out.println("Cron job fired at " + LocalDateTime.now());
  }
}
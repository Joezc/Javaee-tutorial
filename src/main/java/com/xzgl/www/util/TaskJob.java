package com.xzgl.www.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by c0de8ug on 16-2-15.
 */
@Component
public class TaskJob {
    @Scheduled(cron = "0 0 0 1 * ?")
    public void job() {
        TermContainer.update();
    }
}

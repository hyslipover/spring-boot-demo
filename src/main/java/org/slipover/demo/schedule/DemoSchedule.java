package org.slipover.demo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DemoSchedule {

    @Scheduled(cron = "* 0/5 * * * *")
    public void $yyyy_MM_dd_hh_$5_ss() {
        System.out.println("我是定时任务，我每5分钟执行，本次执行时间是：" + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()));
    }

    @Scheduled(cron = "30 * * * * *")
    public void $yyyy_MM_dd_hh_mm_30() {
        System.out.println("我是定时任务，我每个30秒整执行，本次执行时间是：" + new SimpleDateFormat("YYYY-MM-DD HH:mm:ss").format(new Date()));
    }

}

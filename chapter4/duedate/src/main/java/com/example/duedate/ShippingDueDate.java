package com.example.duedate;

import java.time.LocalDate;
import java.time.Duration;

/**
 * 出荷期日
 */
public class ShippingDueDate{
    private final LocalDate dueDate;

    public ShippingDueDate(LocalDate startDate){
        // 配送都合などの出荷に関する独自ロジックを実装
        this.dueDate = startDate.plusDays(5);
    }

    // 期限までの残日数
    public long remainingDays(){
        // 独自ロジックがあれば実装
        final LocalDate nowDate = LocalDate.now();
        Duration duration = Duration.between(nowDate.atTime(0, 0, 0), dueDate.atTime(0, 0, 0));
        return duration.toDays();
    }
}
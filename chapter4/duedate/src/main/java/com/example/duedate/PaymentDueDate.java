package com.example.duedate;

import java.time.Duration;
import java.time.LocalDate;

/**
 * 支払期日
 */
public class PaymentDueDate{
    private final LocalDate dueDate;

    public PaymentDueDate(LocalDate startDate){
        // 営業日などの出荷に関する独自ロジックを実装
        this.dueDate = startDate.plusDays(60);
    }

    // 期限までの残日数
    public long remainingDays(){
        // 独自ロジックがあれば実装
        final LocalDate nowDate = LocalDate.now();
        Duration duration = Duration.between(nowDate.atTime(0, 0, 0), dueDate.atTime(0, 0, 0));
        return duration.toDays();
    }
}
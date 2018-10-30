package com.example.stateSample;

public enum State{
    review,     // 審査中
    accept,     // 承認済
    doing,      // 実施中
    finish,     // 終了
    passback,   // 差し戻し中
    cancel;     // 中断中
}
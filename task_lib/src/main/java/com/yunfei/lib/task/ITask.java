package com.yunfei.lib.task;

public interface ITask  {
    void pause();

    void start();

    boolean isPause();

    void doUpdate();

    void doError(Exception e);

    void doFinish();

    void doPause();

    void waiting();
}

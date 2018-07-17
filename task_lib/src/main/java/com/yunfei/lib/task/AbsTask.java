package com.yunfei.lib.task;

import java.util.Observable;

public abstract class AbsTask extends Observable implements ITask {
    private volatile boolean isPause = false;

    @Override
    public void pause() {
        isPause=false;
        doPause();
    }

    @Override
    public boolean isPause() {
        return isPause;
    }
}

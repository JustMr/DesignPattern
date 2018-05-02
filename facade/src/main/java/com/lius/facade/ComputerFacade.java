package com.lius.facade;

import com.lius.SubSystem.CPU;
import com.lius.SubSystem.Disk;
import com.lius.SubSystem.Memory;

/**
 * 通过对三个SubSystem的统一管理
 * 降低访问者client与SubSystem之间的耦合
 * Facade
 * Created by liushuangbo on 2018/5/2.
 */
public class ComputerFacade {

    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public ComputerFacade() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void start() {
        cpu.start();
        disk.start();
        memory.start();
    }

    public void end() {
        cpu.end();
        disk.end();
        memory.end();
    }

}

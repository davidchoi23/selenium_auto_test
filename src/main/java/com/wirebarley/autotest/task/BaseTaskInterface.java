package com.wirebarley.autotest.task;

public interface BaseTaskInterface {
  void preInit();
  void init();
  void execCode();
  void run();
  void fini();
  void afterFini();
}

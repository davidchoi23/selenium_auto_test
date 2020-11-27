package com.wirebarley.autotest.service;

import com.wirebarley.autotest.task.BaseTask;
import com.wirebarley.autotest.operation.Operation;

public class AuToKr extends BaseTask implements Operation{

  @Override
  public void runTest() {
    System.out.println("run Au To Kr");
    super.run();
  }

  @Override
  public void execCode() {

    // 실행하려는 코드 작성

    System.out.println("Code write");
  }
}

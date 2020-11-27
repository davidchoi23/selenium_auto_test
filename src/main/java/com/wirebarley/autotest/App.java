package com.wirebarley.autotest;

import com.wirebarley.autotest.operation.Operation;
import com.wirebarley.autotest.operation.OperationFactory;

public class App {
  public static void main(String[] args) {
    OperationFactory operationFactory = new OperationFactory();
    Operation operation1 = operationFactory.setType("auToKr");
    operation1.runTest();
  }
}

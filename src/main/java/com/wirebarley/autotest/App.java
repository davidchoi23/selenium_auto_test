package com.wirebarley.autotest;

import com.wirebarley.autotest.operation.Operation;
import com.wirebarley.autotest.operation.OperationFactory;
import com.wirebarley.autotest.type.TransferType;

public class App {
  public static void main(String[] args) {
    Operation operation1 = OperationFactory.setType(TransferType.AU_KR);
    operation1.runTest();
  }
}

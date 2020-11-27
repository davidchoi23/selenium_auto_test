package com.wirebarley.autotest.operation;

import com.wirebarley.autotest.service.AuToKr;
import com.wirebarley.autotest.type.TransferType;

public class OperationFactory implements Operation{

  public static Operation setType(TransferType type) {
    if (type == null) {
      return null;
    }
    if (type == TransferType.AU_KR) {
      return new AuToKr();
    }
    return null;
  }

  @Override
  public void runTest() {}
}

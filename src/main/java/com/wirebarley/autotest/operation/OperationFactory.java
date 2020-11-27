package com.wirebarley.autotest.operation;

import com.wirebarley.autotest.service.AuToKr;

public class OperationFactory implements Operation{


  public Operation setType(String type) {
    if (type == null) {
      return null;
    }
    if (type.equalsIgnoreCase("auToKr")) {
      return new AuToKr();
    }
    return null;
  }

  @Override
  public void runTest() {

  }
}

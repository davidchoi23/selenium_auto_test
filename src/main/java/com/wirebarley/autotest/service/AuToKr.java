package com.wirebarley.autotest.service;

import com.wirebarley.autotest.task.BaseTask;
import com.wirebarley.autotest.operation.Operation;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuToKr extends BaseTask implements Operation{

  private WebElement webElement;

  @Override
  public void runTest() {
    System.out.println("run Au To Kr");
    run();
  }

  @Override
  public void execCode() {

    // 실행하려는 코드 작성
    getDriver().getLocalStorage();


    // 빈 탭 생성
    getDriver().executeScript("window.open('about:blank','_blank');");

    // 탭 목록 가져오기
    List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());


    // 첫번째 탭으로 전환
    getDriver().switchTo().window(tabs.get(0));
    // 웹페이지 요청
    getDriver().get("https://uat.wirebarley.com/");



    webElement = getDriver().findElement(By.cssSelector("body > div:nth-child(2) > header > div > div.header-menu-wrap > ul > li.d-pc > a"));
    webElement.click();

    webElement = getDriver().findElement(By.name("usernameText"));
    String daum_id ="test@wirebarley.com";
    webElement.sendKeys(daum_id);

    //iframe 내부에서 pw 필드 탐색
    webElement = getDriver().findElement(By.name("password"));
    String daum_pw ="1q2w3e4r5t!";
    webElement.sendKeys(daum_pw);


    webElement = getDriver().findElement(By.id("btn-login"));
    webElement.click();

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Code write");
  }
}

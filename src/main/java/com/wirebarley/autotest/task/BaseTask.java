package com.wirebarley.autotest.task;

import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@NoArgsConstructor
public class BaseTask implements BaseTaskInterface {

  @Getter
  @Setter
  private ChromeDriver driver;

  @Override
  public void preInit() {
    // 현재 package의 workspace 경로, Windows는 [ chromedriver.exe ]
    Path path = Paths.get(System.getProperty("user.dir"), "src/main/resources/chromedriver");  // 현재 package의

    // WebDriver 경로 설정
    System.setProperty("webdriver.chrome.driver", path.toString());
  }

  @Override
  public void init() {
    // WebDriver 옵션 설정
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");            // 전체화면으로 실행
    options.addArguments("--disable-popup-blocking");    // 팝업 무시
    options.addArguments("--disable-default-apps");     // 기본앱 사용안함

    // WebDriver 객체 생성
    setDriver(new ChromeDriver( options ));
  }

  /**
   * 오버라이드로 코드 작성
   */
  @Override
  public void execCode() {

  }


  @Override
  public void fini() {
    // 탭 종료
    getDriver().close();

  }

  @Override
  public void afterFini() {
    // 5초 후에 WebDriver 종료
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      // WebDriver 종료
      getDriver().quit();
    }
  }


  // 이 부분을 실행
  @Override
  public void run() {
    preInit();
    init();
    execCode();
    fini();
    afterFini();
  }
}

package com.example.testykamil;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MainTestUs {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Test
    public void checkData1() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Emilia");
        driver.findElement(By.id("inputPassword3")).sendKeys("Urbanek");
        driver.findElement(By.id("dataU")).sendKeys("22-12-2011");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Brak kwalifikacji", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData2() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Lukasz");
        driver.findElement(By.id("inputPassword3")).sendKeys("Dwojek");
        driver.findElement(By.id("dataU")).sendKeys("05-01-2000");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Dorosly", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData3() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Tomek");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kowalski");
        driver.findElement(By.id("dataU")).sendKeys("08-02-2005");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Blad danych", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData4() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Kamil");
        driver.findElement(By.id("inputPassword3")).sendKeys("łapka");
        driver.findElement(By.id("dataU")).sendKeys("23-05-2006");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Junior", closeAlertAndGetItsText());
        afterTest();
    }


    @Test
    public void checkData5() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marta");
        driver.findElement(By.id("inputPassword3")).sendKeys("Zawisza");
        driver.findElement(By.id("dataU")).sendKeys("26-05-1954");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Blad danych", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData6() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Justyna");
        driver.findElement(By.id("inputPassword3")).sendKeys("Korczyk");
        driver.findElement(By.id("dataU")).sendKeys("02-09-2007");
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Blad danych", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData7() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Paweł");
        driver.findElement(By.id("inputPassword3")).sendKeys("Korek");
        driver.findElement(By.id("dataU")).sendKeys("29-03-2002");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Dorosly", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData8() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Karol");
        driver.findElement(By.id("inputPassword3")).sendKeys("Nowak");
        driver.findElement(By.id("dataU")).sendKeys("11-08-2007");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Blad danych", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData9() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Natalia");
        driver.findElement(By.id("inputPassword3")).sendKeys("Patyk");
        driver.findElement(By.id("dataU")).sendKeys("30-03-2004");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Junior", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData10() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Edward");
        driver.findElement(By.id("inputPassword3")).sendKeys("Janko");
        driver.findElement(By.id("dataU")).sendKeys("02-01-1953");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Senior", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData11() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Robert");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kmieć");
        driver.findElement(By.id("dataU")).sendKeys("02-11-2004");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Junior", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData12() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Marcin");
        driver.findElement(By.id("inputPassword3")).sendKeys("Panek");
        driver.findElement(By.id("dataU")).sendKeys("22-07-2006");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Junior", closeAlertAndGetItsText());
        afterTest();
    }


    @Test
    public void checkData13() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Małgorzata");
        driver.findElement(By.id("inputPassword3")).sendKeys("Pucek");
        driver.findElement(By.id("dataU")).sendKeys("10-10-2007");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Mlodzik", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData14() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Józef");
        driver.findElement(By.id("inputPassword3")).sendKeys("Krasik");
        driver.findElement(By.id("dataU")).sendKeys("07-09-1952");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Blad danych", closeAlertAndGetItsText());
        afterTest();
    }

    @Test
    public void checkData15() throws Exception {
        setUp();
        driver.findElement(By.id("inputEmail3")).sendKeys("Aleksandra");
        driver.findElement(By.id("inputPassword3")).sendKeys("Kopcik");
        driver.findElement(By.id("dataU")).sendKeys("04-10-2008");
        driver.findElement(By.id("rodzice")).click();
        driver.findElement(By.id("lekarz")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        closeAlert();
        assertEquals("Mlodzik", closeAlertAndGetItsText());
        afterTest();
    }

    private void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\seleniumWebdrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
    }

    private void closeAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    private void afterTest() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
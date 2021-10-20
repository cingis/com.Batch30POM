package tests.day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReaderlle extends TestBase {

    @Test
    public void positiveTestCongig(){

        //Bir test method olustur NegativeLoginTest()
        //	https://www.concorthotel.com/ adresine git
        //	login butonuna bas
        //	test data username: manager1
        //	test data password : manager1!
        //	Degerleri girildiginde sayfaya girilemedigini test et

        driver.get(ConfigReader.getProperty("CHUrl"));

        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);

        concortHotelPage.ilkLoginLinki.click();

        concortHotelPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));

        concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
        concortHotelPage.loginButonu.click();

        Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());

    }
}

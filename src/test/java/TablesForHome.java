import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TablesForHome {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testForTableTR() {
        //how menu rows in table with data
        //print row 2
        ////print row 7



    }

    @Test
    public void testForTableColumns() {
        //how menu columns in table with data
        //print all Country


    }

    @Test
    public void testForTableCells() {
        // print:  Helen Bennett
        //print:  Italy

    }
}

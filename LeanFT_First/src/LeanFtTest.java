

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;
import com.hp.lft.sdk.web.Button;
import com.hp.lft.sdk.web.ButtonDescription;
import com.hp.lft.sdk.web.EditField;
import com.hp.lft.sdk.web.EditFieldDescription;
import com.hp.lft.sdk.web.Link;
import com.hp.lft.sdk.web.LinkDescription;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFtTest();
        globalSetup(LeanFtTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
    	// Browser browser = BrowserFactory.launch(BrowserType.INTERNET_EXPLORER);
    	Browser browser = BrowserFactory.launch(BrowserType.CHROME);
    	browser.navigate("http://sw-sync.australiasoutheast.cloudapp.azure.com");
    	
    	EditField f_username = browser.describe(EditField.class, new EditFieldDescription.Builder()
    			.type("text").tagName("INPUT").name("user_name").build());
    	EditField f_password = browser.describe(EditField.class, new EditFieldDescription.Builder()
    			.type("password").tagName("INPUT").name("user_password").build());
    	
    	Button btn_login = browser.describe(Button.class, new ButtonDescription.Builder()
    			.buttonType("submit").tagName("INPUT").name("Log In").build());
    	
    	f_username.setValue("admin");
    	f_password.setSecure("598a9c898191a49089d2d9dbc1b9872cace188064db8");
    	btn_login.click();
    	
    	browser.sync();
    	
    	Link lnk_logout = browser.describe(Link.class, new LinkDescription.Builder()
    			.tagName("A").innerText("Log Out").build());
    	
    	browser.sync();
    	
    	browser.close();
    	
    	
    	
    }

}
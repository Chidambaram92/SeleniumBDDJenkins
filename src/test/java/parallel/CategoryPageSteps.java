package parallel;

import java.util.List;

import org.junit.Assert;

import com.pages.AccountsPage;
import com.pages.CategoryPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CategoryPageSteps {

	private AccountsPage accountsPage= new AccountsPage(DriverFactory.getDriver());
	private CategoryPage categoryPage=new CategoryPage(DriverFactory.getDriver());

	@Given("category user is on Accounts page")
	public void user_is_on_accounts_page() {
		String title = accountsPage.getAccountsPageTitle();
		System.out.println("Accounts Page title is: "+title);
	}

@When("verify the category tabs displayed")
public void validateCategory(DataTable testData){
	List<String> categoryList = testData.asList();
	System.out.println("Expected accounts section list: " + categoryList);
	List<String> applicationCategoryList = categoryPage.getCategorySectionsList();
	System.out.println("Actual accounts section list in Application is: " + applicationCategoryList);
	Assert.assertTrue(applicationCategoryList.containsAll(categoryList));
	
}
}

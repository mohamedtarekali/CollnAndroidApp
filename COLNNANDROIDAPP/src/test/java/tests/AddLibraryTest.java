package tests;

import org.testng.annotations.Test;

import pages.DashBoardPage;
import pages.LibraryPage;

public class AddLibraryTest extends TestBase {
	DashBoardPage dashBoardPageObject;
	LibraryPage libraryPageObject;
	 
	@Test
	public void userCanAddLibrary() {
		dashBoardPageObject = new DashBoardPage(driver);
		dashBoardPageObject.userOpenLibraryFromDashBoard();
		libraryPageObject = new LibraryPage(driver);
		libraryPageObject.userAddLibrary();
		System.out.println("done from server side");
	}

}

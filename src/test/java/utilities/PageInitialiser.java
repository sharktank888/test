package utilities;

import pages.CareersPage;
import pages.CustomerServicePage;
import pages.DeliveryPage;
import pages.FindStorePage;
import pages.GiftCardsPage;
import pages.HomePage;
import pages.InvestorRelationsPage;
import pages.MenuPage;
import pages.RegistrationPage;
import pages.RewardPage;
import pages.SignInPage;
import pages.StoriesPage;

public class PageInitialiser extends Base {

	public static HomePage hp;
	public static GiftCardsPage gcp;
	public static StoriesPage sp;
	public static MenuPage mp;
	public static RegistrationPage rp;
	public static SignInPage sip;
	public static RewardPage RP;
	public static DeliveryPage dp;
	public static CustomerServicePage csp;
	public static InvestorRelationsPage irp;
	public static FindStorePage fsp;
	public static CareersPage cp;

	public static void initialise() {
		hp = new HomePage();
		gcp = new GiftCardsPage();
		sp = new StoriesPage();
		mp = new MenuPage();
		rp = new RegistrationPage();
		sip = new SignInPage();
		RP = new RewardPage();
		dp = new DeliveryPage();
		csp = new CustomerServicePage();
		irp = new InvestorRelationsPage();
		fsp = new FindStorePage();
		cp = new CareersPage();
	}

}

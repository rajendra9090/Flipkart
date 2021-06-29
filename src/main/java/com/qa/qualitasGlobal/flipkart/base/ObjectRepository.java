/*@author= Mayur Adhude*/

package com.qa.qualitasGlobal.flipkart.base;



public class ObjectRepository {

	//site url
	public static final String url = "https://www.flipkart.com/";	
	

// LoginPopUpPage objects
	public static final String username = "//div[@class='Km0IJL col col-3-5']//div//form//div//input[@type='text']";
	public static final String password = "//div[@class='Km0IJL col col-3-5']//div//form//div//input[@type='password']";
	public static final String loginbutton = "//div[@class='Km0IJL col col-3-5']//div//form//div//button[@type='submit']";
	public static final String forgot = "//div[@class='Km0IJL col col-3-5']//div//form//div//a//text()[last()]";
	public static final String signup = "//div[@class='Km0IJL col col-3-5']//div//form//a[@href=\\\"/account/login?signup=true\\\"]//text()[last()]";
	public static final String popuploginlogo = "//div[@class='Og_iib col col-2-5 _3SWFXF']//span[text()='Login']";

//Flipkart Header menu
	//click on flipkart logo image to go to HomePage ( common to all)
	public static final String clikonflipkartimg = "//*[@id=\"container\"]/div/header/div[1]/div/div[1]/a[@href='/']";
	//Search webelement common to all
	public static final String commonsearchbox = "//input[@type='text'][@placeholder='Search for products, brands and more']";
	public static final String searchbutton ="//div[@id='container']//button[@type='submit']";
	public static final String redminote6="//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]";
	
	//yourName
	public static final String yourname = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']";
	 
	public static final String myprofile ="//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/account/?rd=0&link=home_account']//div[text()='My Profile']";
	public static final String titleofmyprofilepage ="//head//title[text()='My Profile']";
	public static final String flipkartpluszone ="//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/plus']//div[text()='Flipkart Plus Zone']";
	public static final String gamezone = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/gamezone']//div[text()='Game Zone']";
	public static final String order = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/account/orders?link=home_orders']//div[text()='Orders']";
	public static final String wishlist = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/wishlist?link=home_wishlist']//div[text()='Wishlist']";
	public static final String rewards = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/account/rewards?link=home_rewards']//div[text()='Rewards']";
	public static final String giftcards = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/account/giftcard?link=home_giftcard']//div[text()='Gift Cards']";
	public static final String notifications = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='/notifications?otracker=Notifications_view_all']//div[text()='Notifications']";
	public static final String logout = "//div[@id='container']//div//header//div[1]//div//div[3]//div[1]//div[@class='row']//a[@href='#']//div[text()='Logout']";
	
	
//More
	public static final String more ="//div[@id='container']//span[text()='More']";
//Cart
	public static final String cart ="//div[@id='container']//a[@href='/viewcart?otracker=Cart_Icon_Click']//span[text()='Cart']";
	public static final String clickonaddtocart = "//*[@id='container']/div/div[1]/div[2]/div/div[1]/div[1]/div[2]/div/ul/li[1]/button[text()='ADD TO CART']";
	//Continue Shopping
	public static final String continueshopping_btn ="//div[@id='container']//a[@href='/?otracker=Cart_Continue%20shopping']//button//span[text()='Continue shopping']";
	//place order
	public static final String placeorder_btn = "//div[@id='container']//form[@method='post' and @action='/checkout/init']//button//span[text()='Place Order']";

//My Cart(Number of item)
	public static final String mycarttotalitem ="//div[@id='container']//span[contains(text(),'My Cart')]";
	
	//
	public static final String pincodetxtbox = "//div[@id='container']//input[@type='text' and @placeholder='Enter Delivery Pincode'][@id='pincodeInputId']";
	
//Extended Warranty for xxx button
	public static final String ew_addfor_btn ="//div[@id='container']//button//span[contains(text(),'Add for')]";
	
     //Save For Later
	
	//for 1st item in the cart
	public static final String saveforlater1 = "//div[@id='container']//div[@tabindex='12']//span[text()='Save For Later']";
	//for 2nd item in the cart
	public static final String saveforlater2 = "//div[@id='container']//div[@tabindex='22']//span[text()='Save For Later']";
	//for 3rd item in the cart
	public static final String saveforlater3 = "//div[@id='container']//div[@tabindex='32']//span[text()='Save For Later']";
	//for 4th item in the cart
	public static final String saveforlater4 = "//div[@id='container']//div[@tabindex='42']//span[text()='Save For Later']";
	//for 5th item in the cart
	public static final String saveforlater5 = "//div[@id='container']//div[@tabindex='52']//span[text()='Save For Later']";
	
	// Remove
	
	//for 1st item in the cart
	public static final String remove1 = "//div[@id='container']//div[@tabindex='13']//span[text()='Remove']";
	//for 2nd item in the cart
	public static final String remove2 = "//div[@id='container']//div[@tabindex='23']//span[text()='Remove']";
	//for 3rd item in the cart
	public static final String remove3 = "//div[@id='container']//div[@tabindex='33']//span[text()='Remove']";
	//for 4th item in the cart
	public static final String remove4 = "//div[@id='container']//div[@tabindex='43']//span[text()='Remove']";
	//for 5th item in the cart
	public static final String remove5 = "//div[@id='container']//div[@tabindex='53']//span[text()='Remove']";
	
	
	
// Flipkart subHeader menu Hover list objects 
	// Electronics, TVs & Appliances, Men, Women,Baby & Kids, Home & Furniture, Sports, Books & More,Offer Zone
	public static final String electronics = "//div[@id='container']//ul//li[1]//span[text()='Electronics']";
	public static final String tvsandappliances = "//div[@id='container']//ul//li[2]//span[text()='TVs & Appliances']";
	public static final String men = "//div[@id='container']//ul//li[3]//span[text()='Men']";
	public  final static String women = "//div[@id='container']//ul//li[4]//span[text()='Women']";
	public static final String babyandkids = "//div[@id='container']//ul//li[5]//span[text()='Baby & Kids']";
	public static final String homeandfurniture = "//div[@id='container']//ul//li[6]//span[text()='Home & Furniture']";
	public static final String sportsbooksandMore = "//div[@id='container']//ul//li[7]//span[text()='Sports, Books & More']";
	public static final String offerzone = "//div[@id='container']//ul//li[8]//a[@href='/offers-store?otracker=nmenu_offer-zone']";
	
	
	
//Under Women Category
	
	
	//Clothing
	public static final String clothing = "//div[@id='container']//ul//li[4]//a[@title='Clothing']";
	//Winter & Seasonal Wear
	public static final String winterandseasonalwear = "//a[@title='Winter & Seasonal Wear']";
	
	//Western Wear
	public static final String westernwear= "//a[@title='Western Wear']";
	
	//Lingerie & Sleep wear
	public static final String lingerieandsleepwear ="//a[@title='Lingerie & Sleepwear']";
	
	//Ethnic Wear
	public static final String ethnicwear = "//a[@title='Ethnic Wear' and @href='/womens-clothing/ethnic-wear/pr?sid=2oq,c1r,3pj&otracker=nmenu_sub_Women_0_Ethnic%20Wear&otracker=nmenu_sub_Women_0_Ethnic%20Wear']";
	
	//Sports Wear
	public static final String sportswear = "//a[@title='Sports Wear' and @href='/womens-clothing/sports-gym-wear/pr?sid=2oq,c1r,6p8&otracker=nmenu_sub_Women_0_Sports%20Wear&otracker=nmenu_sub_Women_0_Sports%20Wear']";
	
	//Swim & Beachwear
	public static final String swimandbeachwear = "//a[@title='Swim & Beachwear' and @href='/womens-clothing/lingerie-sleep-swimwear/swim-beach-wear/pr?sid=2oq,c1r,tbt,wg3&otracker=nmenu_sub_Women_0_Swim%20and%20Beachwear&otracker=nmenu_sub_Women_0_Swim%20%26%20Beachwear&otracker=nmenu_sub_Women_0_Swim%20%26%20Beachwear']";
	
	
	
	
	
	
	
	
}

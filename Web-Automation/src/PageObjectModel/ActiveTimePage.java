package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveTimePage {

	public ActiveTimePage (WebDriver oBrowser)
	{
	      PageFactory.initElements(oBrowser, this);
	}

	//WebElement for username

	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}

	//WebElement for password

	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}

	//WebElement for Login Button
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//WebElement for Create user
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement Createuser;
	public WebElement getCreateuser()
	{
		return Createuser;
	}

	//WebElement for Adduser
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement Adduser;
	public WebElement getAdduser()
	{
		return Adduser;
	}

	//WebElement for firstname
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	//WebElement for lastname
	private WebElement lastName;
	public WebElement getlastname()
	{
		return lastName;
	}
	//WebElement for email
	private WebElement email;
	public WebElement getemail()
	{
		return email;
	}

	//WebElement for login details username
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserDataLightBox_usernameField()
	{
		return userDataLightBox_usernameField;
	}

	//WebElement for login details password
	private WebElement userDataLightBox_passwordField;
	public WebElement getuserDataLightBox_passwordField()
	{
		return userDataLightBox_passwordField;
	}
	//WebElement for login details retype password
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getuserDataLightBox_passwordCopyField()
	{
		return userDataLightBox_passwordCopyField;
	}

	//Webelement for create user button
	private WebElement userDataLightBox_commitBtn;
	public WebElement getuserDataLightBox_commitBtn()
	{
		return userDataLightBox_commitBtn;
	}
	//*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]
	//Webelement for delete button
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]")
	private WebElement Deleteuser;
	public WebElement getDeleteuser()
	{
		return Deleteuser;
	}

	//Webelement for deletebutton
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getuserDataLightBox_deleteBtn()
	{
		return userDataLightBox_deleteBtn;
	}

	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}


	// HW3 webelement for create customer    
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
	private WebElement Createcustomer;
	public WebElement getCreatecustomer()
	{
		return Createcustomer;
	}
	// click Add new button
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
	private WebElement Addnew;
	public WebElement getAddnew()
	{
		return Addnew;
	}

	// click new customer button
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement Clicknewcustomer;
	public WebElement getClicknewcustomer()
	{
		return Clicknewcustomer;
	}
	
	
	// click new customer button   
	@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
	private WebElement EnterCustomername;
	public WebElement getEnterCustomername()
	{
		return EnterCustomername;
	}

	// click create customer button  
	@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']")
	private WebElement Clickcreatecustomer;
	public WebElement getClickcreatecustomer()
	{
		return Clickcreatecustomer;
	}
	
	//Delete Customer
	 
	//Clicking on rakesh settings button to delete
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement ClickSettingtodelete;
	public WebElement getClickSettingtodelete()
	{
		return ClickSettingtodelete;
	}
	
	//clicking on action 
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")
	private WebElement Clickactiontodelete;
	public WebElement getClickactiontodelete()
	{
		return Clickactiontodelete;
	}
	
	//clicking delete after pressing action
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
	private WebElement Clickdeleteafteraction;
	public WebElement getClickdeleteafteraction()
	{
		return Clickdeleteafteraction;
	}
	
	//permanently delete
	
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")
	private WebElement Clickpermanentlydelete;
	public WebElement getClickpermanentlydelete()
	{
		return Clickpermanentlydelete;
	}
	 //*[@id="userListTableContainer"]/table/tbody/tr[2]/td[1]
	
	//hw2 Modify user
	
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
	private WebElement Clickonwholeuser;
	public WebElement getClickonwholeuser()
	{
		return Clickonwholeuser;
	}
	
	// Username clearing
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement Clickonusernameandclear;
	public WebElement getClickonusernameandclear()
	{
		return Clickonusernameandclear;
	}
	
	//Modifycustomer using settings button
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement Clicksettingsbutton;
	public WebElement getClicksettingsbutton()
	{
		return Clicksettingsbutton;
	}
	
	// clicking active button to modify 
    
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement Clickactivebutton;
	public WebElement getClickactivebutton()
	{
		return Clickactivebutton;
	}
	
	//change active to archieve
	
	@FindBy(xpath="/html/body/div[23]/div[2]/div")
	private WebElement Clickarchievebutton;
	public WebElement getClickarchievebutton()
	{
		return Clickarchievebutton;
	}
	
	//Create project
	//clicking addnew inside task
	
	//*[@id="cpTreeBlock"]/div[2]/div[1]/div[2]/div
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div")
	private WebElement Clickaddnewbutton;
	public WebElement getClickaddnewbutton()
	{
		return Clickaddnewbutton;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement Clicknewprojectbutton;
	public WebElement getClicknewprojectbutton()
	{
		return Clicknewprojectbutton;
	}
	
	@FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
	private WebElement Clickprojectname;
	public WebElement getClickprojectname()
	{
		return Clickprojectname;
	}
	
	@FindBy(xpath="//*[@id=\'projectPopup_newCustomerNameField\']")
	private WebElement Clickcustomername;
	public WebElement getClickcustomername()
	{
		return Clickcustomername;
	}


	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']")
	private WebElement Clickcreateproject;
	public WebElement getClickcreateproject()
	{
		return Clickcreateproject;
	}
	
	
	//Delete project
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement Clickdeleteprojectsettings;
	public WebElement getClickdeleteprojectsettings()
	{
		return Clickdeleteprojectsettings;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement Clickactiontodeleteproject;
	public WebElement getClickactiontodeleteproject()
	{
		return Clickactiontodeleteproject;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement Clickdeleteinactionnutton;
	public WebElement getClickdeleteinactionbutton()
	{
		return Clickdeleteinactionnutton;
	}
	
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement Clickpermanentlydeletebutton;
	public WebElement getClickpermanentlydeletebutton()
	{
		return Clickpermanentlydeletebutton;
	}
	
	//Modify project
	
		@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
		private WebElement Clickmodifyprojectsettings;
		public WebElement getClickmodifyprojectsettings()
		{
			return Clickmodifyprojectsettings;
		}
		
		//*[@id="taskListBlock"]/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")
		private WebElement Clickmodifyactivebutton;
		public WebElement getClickmodifyactivebutton()
		{
			return Clickmodifyactivebutton;
		}
		
		@FindBy(xpath="/html/body/div[26]/div[2]/div")
		private WebElement Clickmodifyarchievebutton;
		public WebElement getClickmodifyarchievebutton()
		{
			return Clickmodifyarchievebutton;
		}
		
		//Create task
		
		
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div")
		private WebElement Clickaddnewtaskbutton;
		public WebElement getClickaddnewtaskbutton()
		{
			return Clickaddnewtaskbutton;
		}
		
		@FindBy(xpath="/html/body/div[13]/div[1]")
		private WebElement Clicknewtaskbutton;
		public WebElement getClicknewtaskbutton()
		{
			return Clicknewtaskbutton;
		}
		
		@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
		private WebElement Clicknewtasknamebutton;
		public WebElement getClicknewtasknamebutton()
		{
			return Clicknewtasknamebutton;
		}
		
		@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']")
		private WebElement Clickcreatetaskbutton;
		public WebElement getClickcreatetaskbutton()
		{
			return Clickcreatetaskbutton;
		}
		
		//Delete task
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]")
		private WebElement Clickwholetask;
		public WebElement getClickwholetask()
		{
			return Clickwholetask;
		}
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")
		private WebElement Clickactivebuttontodeletetask;
		public WebElement getClickactivebuttontodeletetask()
		{
			return Clickactivebuttontodeletetask;
		}
		
		@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
		private WebElement Clickdeletetaskbutton;
		public WebElement getClickdeletetaskbutton()
		{
			return Clickdeletetaskbutton;
		}
		
		@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
		private WebElement Clickpermanentlydeletetaskbutton;
		public WebElement getClickpermanentlydeletetaskbutton()
		{
			return Clickpermanentlydeletetaskbutton;
		}
}





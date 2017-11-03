package view;

import javax.persistence.Column;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import controller.UserManager;
import model.User;

public class UserAction extends ActionSupport  implements ModelDriven<User>, Preparable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserManager linkController;
	private User user =new User();
	  public  UserAction()
	    {
	    	linkController =new UserManager();
	    }
	   
	    private String Name;
		private String cardNo;
		private String address;
	    private String username;
		private String password;
		public UserManager getLinkController() {
			return linkController;
		}
		public void setLinkController(UserManager linkController) {
			this.linkController = linkController;
		}
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getCardNo() {
			return cardNo;
		}
		public void setCardNo(String cardNo) {
			this.cardNo = cardNo;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	
		
		
	  @Override
      public void prepare() throws Exception {
    	  user=new User();
		}
	  @Override
		public User getModel() {
		    return user;
		}
	 @Override
	public String execute() throws Exception {

			try {
		  linkController.register(user);
			}catch(Exception e) {
				e.printStackTrace();
			}
		return SUCCESS;
	}

			
	
	 
     public String login(){
    	 
    	 String chk;
    	 chk=linkController.login(getUsername(),getPassword());
      return chk;
     }
	
	
}

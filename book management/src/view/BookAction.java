package view;
//import java.util.List;



import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import controller.BookManager;
import model.Book;
import net.sf.hibernate.HibernateException;

public class BookAction extends ActionSupport  implements ModelDriven<Book>, Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BookManager linkController;
	private Book book =new Book();
	private String index_name;
	private String keyword;
	private String editCategory;
	private String editName;
	public String getEditName() {
		return editName;
	}



	public void setEditName(String editName) {
		this.editName = editName;
	}



	public String getEditCategory() {
		return editCategory;
	}



	public void setEditCategory(String editCategory) {
		this.editCategory = editCategory;
	}



	private List books = new ArrayList<>();
	
	public String execute(){
		try {
			books=linkController.list();
			return SUCCESS;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ERROR;
	}
	
	

	public BookAction()
	    {
	    	linkController =new BookManager();
	    }
	
		
      @Override
		public void prepare() throws Exception {
		    book=new Book();
		}

		@Override
		public Book getModel() {
		    return book;
		}
	
	/*public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}*/
  
   /* public String execute() {
  		if(null !=book) {
  			linkController.add(book);
  		}
  		return SUCCESS;
  	}
      */
    public String add() {
		System.out.println(book.getAuthor().toString());
		try {
		linkController.add(book);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
    public String update()
    {
    	try{
    		linkController.update(getEditName().toString(),getEditCategory().toString());
    	}catch(Exception e) {
			e.printStackTrace();
		}
    	return SUCCESS;
    }
    
    public String view(){
    	
    	try{
    		books=linkController.list();
    		System.out.println(books.size());
    	}catch (Exception e) {
    		e.printStackTrace();
		}
		return SUCCESS ;
    }
    public String search()
    {
    	try{
    		books=linkController.search(getKeyword());
    		//System.out.print("Fucntion is Called");
    		System.out.println(books.size());
    	}catch (Exception e) {
    		e.printStackTrace();
		}
    	
    	return SUCCESS;
    }
    public String delete() {
    	System.out.println(getIndex_name().toString());
		int chk=linkController.delete(getIndex_name().toString());
		if(chk<=0)
		{
			return ERROR;
		}
		else{
		return SUCCESS;}
	}


	public List getBooks() {
		return books;
	}


	public void setBooks(List books) {
		this.books = books;
	}


	public String getIndex_name() {
		return index_name;
	}



	public void setIndex_name(String index_name) {
		System.out.println("Setter executed. name : " + index_name);
		this.index_name = index_name;
	}



	public String getKeyword() {
		return keyword;
	}



	public void setKeyword(String keyword) {
		System.out.println("Setter executed. name : " + keyword);
		this.keyword = keyword;
	}
}
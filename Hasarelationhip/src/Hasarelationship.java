 class Author1{
	private String name,email;
	private char gender;
	public Author1(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
 class Book1{
	private String name;
	private Author1 author;
	private double price;
	private int qty;
	public Book1(String name, Author1 author, double price, int qty) {
		super();
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author1 getAuthor1() {
		return author;
	}
	public void setAuthor1(Author1 author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString(){
		return name+ " "+price+" "+ qty+" "+ author.getName()+" "+author.getGender()+" "+author.getEmail();
	}
 }
 public class Hasarelationship {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Author1 author=new Author1("Dharnajaya","Dharnajaya@gmail.com" ,'M');
			Book1 book=new Book1("C++", author, 300.0, 10);
			System.out.println(book.toString());
		}
		}


		

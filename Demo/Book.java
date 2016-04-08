package Assignment_4;

import java.util.ArrayList;

public class Book extends Items implements Comparable {
String afname,alname;
  Book(){
	
}
  Book(Book b){
	  this.bid=b.id;
		this.bname=b.name;
		this.pgcount=b.pgcount;
		this.edition=b.edition;
		this.publisher=b.publisher;
		 
	  
  }
	Book(Author au,String name, int id, String year, int quant, int price, String title,int pgcount,String edition,String publisher) {
		super(name, id, year, quant, price, title);
		this.bid=id;
		this.bname=name;
		this.pgcount=pgcount;
		this.edition=edition;
		this.publisher=publisher;
		this.afname = au.afName;
		this.alname = au.alName;
		// TODO Auto-generated constructor stub
	}
	
	public String getAfname() {
		return afname;
	}
	public void setAfname(String afname) {
		this.afname = afname;
	}
	public String getAlname() {
		return alname;
	}
	public void setAlname(String alname) {
		this.alname = alname;
	}

	int bid;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPgcount() {
		return pgcount;
	}
	public void setPgcount(int pgcount) {
		this.pgcount = pgcount;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	String bname;
	int pgcount;
	String edition;
	String publisher;
	

	@Override
	public int compareTo(Object o) {
		ArrayList<Book>b=(ArrayList<Book>) o;
		 		
		 		
		 		for (int i = 0; i < b.size()-1; i++) {
		 			
		 			if(b.get(i).getAfname().equals(b.get(i+1).getAfname()))
		 			{
		 				
		 				
		 				
		 			 if(b.get(i).getAlname().equals(b.get(i+1).getAlname())){
		 				 
		 				 if(b.get(i).getTitle().equals(b.get(i+1).getTitle()))
		 				 {
		 					 
		 					continue; 
		 					 
		 				 }
		 				 else{
		 					 
		 				 Book b1,b2;
		 					int ch1,ch2,count=0;
		 		        	double negative,positive,equal;
		 		        	for(int j=0;i<b.get(i).getTitle().length();j++)
		 		  	      {
		 		        	ch1=(int)(b.get(i).getTitle().charAt(j));
		 		        	ch2=(int)(b.get(i+1).getTitle().charAt(j));
		 		        	if(ch1-ch2<0)	
		 		        	{
		 		        		negative=ch1-ch2;
		 		        		System.out.println("the difference btw "+b.get(i).getTitle().charAt(j)+"-"+b.get(i+1).getTitle().charAt(j)+" is "+negative);
		 		        		System.out.println("Since the negative result, the parameter in lhs is lexicographically first");
		 		        		
		 		        		break;
		 		        	}
		 		        	else if(ch1-ch2>0)	
		 		        	{
		 		        		positive=ch1-ch2;
		 		        		System.out.println("the difference btw "+b.get(i).getTitle().charAt(j)+"-"+b.get(i+1).getTitle().charAt(j)+" is "+positive);
		 		        		System.out.println("Since the positive result, the parameter in rhs is lexicographically first");
		 		        		b1=b.get(i);
		 		        		b2=b.get(i+1);
		 		        		b.set(i+1, b1);
		 		        		b.set(i, b2);
		 		        		break;
		 		        	} 
		 					 
		 				 }
		 				
		 				
		 			} 
		 			
		 				
		 			}
		 			}
		 			else{                                                                  //first if else 
		 				 Book b1,b2;
		 					int ch1,ch2,count=0;
		 		        	double negative,positive,equal;
		 		        	
		 		        	for(int j=0;j<b.get(i).getAfname().length();j++)
		 		  	      {
		 		        	ch1=(int)(b.get(i).getAfname().charAt(j));
		 		        	ch2=(int)(b.get(i+1).getAfname().charAt(j));
		 		        	if(ch1-ch2<0)	
		 		        	{
		 		        		negative=ch1-ch2;
		 		        		System.out.println("the difference btw "+b.get(i).getAfname().charAt(j)+"-"+b.get(i+1).getAfname().charAt(j)+" is "+negative);
		 		        		System.out.println("Since the negative result, the parameter in lhs is lexicographically first");
		 		        		
		 		        		break;
		 		        	}
		 		        	else if(ch1-ch2>0)	
		 		        	{
		 		        		positive=ch1-ch2;
		 		        		System.out.println("the difference btw "+b.get(i).getAfname().charAt(j)+"-"+b.get(i+1).getAfname().charAt(j)+" is "+positive);
		 		        		System.out.println("Since the positive result, the parameter in rhs is lexicographically first");
		 		        		b1=b.get(i);
		 		        		b2=b.get(i+1);
		 		        		b.set(i+1, b1);
		 		        		b.set(i, b2);
		 		        		break;
		 		        	} 
		 				
		 			}
					
				}
		 		}
		 		tostring(b);
				return 0 ;
	}
	public static String tostring(ArrayList<Book>b){
		for(Book a : b)
 		{
 			if(a instanceof Book)
 			{
 				System.out.println("Author Name :"+a.getAfname()+" "+a.getAlname()+"\n"+"The Id of the book :"+a.getId() +"\n"+"The name of the Book :"+a.getName()+"\n"+"The price of the Item :"+a.getPrice()+"\n"+"The quantity :"+a.getQuant()+"\n"+"The Title of the book :"+a.getTitle()+"\n"+"Year the book released :"+a.getYear());
 				System.out.println("The edition of the book :"+((Book) a).getEdition());
 				System.out.println("The publisher :"+((Book) a).getPublisher());
 				System.out.println("........................................................................................");
 				
 		//System.out.println(a.getId() +" "+a.getName()+" "+a.getPrice()+" "+a.getQuant()+" "+a.getTitle()+" "+a.getYear()+"\t"+a.);
 			
 			}
 			
 			
 		}
		return null;
 	    	
	}
	}

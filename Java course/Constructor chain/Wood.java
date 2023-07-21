class Wood{

  String tree;
  double weight;
  int quality;
  String purpose;
  float price;
  
  Wood()
  {
	  System.out.println("Invoking default constructor");
  }
  
  Wood(String tree)
  {
	  this.tree=tree;
	  System.out.println("Invoking String in constructor");
  }
  Wood(String tree,double weight)
  {
	  this.tree=tree;
	  this.weight=weight;
	  System.out.println("Invoking String,double in constructor");
  }
   Wood(String tree,double weight,int quality)
  {
	  this(tree,weight);
	  this.quality=quality;
	  System.out.println("Invoking String,double,int in constructor");
  }
   Wood(String tree,double weight,int quality,String purpose)
  {
	  this(tree,weight,quality);
	  this.purpose=purpose;
	  System.out.println("Invoking String,double,int,String in  constructor");
  }
   Wood(String tree,double weight,int quality,String purpose,float price)
  {
	  this(tree,weight,quality,purpose);
	  this.price=price;
	  System.out.println("Invoking String,double,int,String,float in constructor");
  }
}
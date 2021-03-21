package stores;
class MaxInForum extends ForumMall
{
public static void main(String[] args)
{
	MaxInForum customer = new MaxInForum();
	customer.billing();
	customer.entrypass();
	customer.swipeCard();
}
protected void billing()
{
System.out.println("Barcode scanned for items");
}
void entrypass()
{
	System.out.println("permission granted for entry");
}
 private void swipeCard()
{
	System.out.println("enter pin");
}
}
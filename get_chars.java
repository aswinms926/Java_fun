
public class get_chars {
	public static void main(String args[])
	{
		String s="Hai my name is Aswin ";
		int start=4;
		int end =20;
	    char buff[]=new char[end-start];
	    s.getChars(start, end, buff, 0);
	    System.out.println(buff);
	    
	}

}

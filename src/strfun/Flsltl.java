package strfun;

public class Flsltl 
{
public static void main (String[] args)
{
	int fl=0;
	int sl=0;
	int tl=0;
	int[] arr={26,39,378,9};
	
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>fl)
		{tl=sl;
		sl=fl;
		fl=arr[i];
		
		}
		else if(arr[i]>sl)
		{
			tl=sl;
			sl=arr[i];
		}
		else
		
		{ if(tl>arr[i])
			tl=arr[i];
		}
}
	System.out.println(fl);
	System.out.println(sl);
	System.out.println(tl);
}


}
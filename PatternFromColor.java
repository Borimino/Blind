public class PatternFromColor
{
	private static int length = 5;
	private static int width = 5;

	public static void main(String[] args)
	{

	}

	private static void makePattern(String hex)
	{

	}

	private static void drawPattern(int[] array)
	{
		for(int i=0; i<length; i++)
		{
			for(int j=0; j<width; j++)
			{
				System.out.print(array[i*width+j] + " ");
			}
			System.out.println("");
		}
	}
}

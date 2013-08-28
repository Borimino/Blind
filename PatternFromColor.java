public class PatternFromColor
{
	private static int length = 5;
	private static int width = 5;

	static int[] black = {
		1,1,1,1,1,
		1,1,1,1,1,
		1,1,1,1,1,
		1,1,1,1,1,
		1,1,1,1,1};		;
	static int[] white = {
		0,0,0,0,0,
		0,0,0,0,0,
		0,0,0,0,0,
		0,0,0,0,0,
		0,0,0,0,0};
	static int[] red0 = {
			0,0,0,0,1,
			0,0,0,1,0,
			0,0,1,0,0,
			0,1,0,0,0,
			1,0,0,0,0};
	static int[] red1 = {
			0,0,0,1,1,
			0,0,1,1,0,
			0,1,1,0,0,
			1,1,0,0,0,
			1,0,0,0,1};
	static int[] red2 = {
			0,0,1,1,1,
			0,1,1,1,0,
			1,1,1,0,0,
			1,1,0,0,1,
			1,0,0,1,1};
	static int[] red3 = {
			0,1,1,1,1,
			1,1,1,1,0,
			1,1,1,0,1,
			1,1,0,1,1,
			1,0,1,1,1};
	static int[] red4 = black;
	static int[] blue0 = {
			0,0,0,0,0,
			0,0,0,0,0,
			1,1,1,1,1,
			0,0,0,0,0,
			0,0,0,0,0};
	static int[] blue1 = {
			0,0,0,0,0,
			0,0,0,0,0,
			1,1,1,1,1,
			1,1,1,1,1,
			0,0,0,0,0};
	static int[] blue2 = {
			0,0,0,0,0,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			0,0,0,0,0};
	static int[] blue3 = {
			0,0,0,0,0,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1,
			1,1,1,1,1};
	static int[] blue4 = black;
	static int[] green0 = {
			0,0,0,0,0,
			0,0,0,0,0,
			0,0,1,0,0,
			0,0,0,0,0,
			0,0,0,0,0};
	static int[] green1 = {
			0,0,0,0,0,
			0,0,1,0,0,
			0,1,1,1,0,
			0,0,1,0,0,
			0,0,0,0,0};
	static int[] green2 = {
			0,0,0,0,0,
			0,1,1,1,0,
			0,1,1,1,0,
			0,1,1,1,0,
			0,0,0,0,0};
	static int[] green3 = {
			0,0,1,0,0,
			0,1,1,1,0,
			1,1,1,1,1,
			0,1,1,1,0,
			0,0,1,0,0};
	static int[] green4 = black;
	int[][] redBlue = new int[5][length*width];
	int[][] blueGreen = new int[5][length*width];
	int[][] greenRed = new int[5][length*width];

	public static void main(String[] args)
	{
		PatternFromColor.makePattern(100, 0, 0);
	}

	private static void makePattern(int r, int g, int b)
	{
		int total = r+g+b;
		if(r >= total/2)
		{
			if(r > (128/6)*5)
			{
				PatternFromColor.drawPattern(red4);
			}else if(r > (128/6)*4)
			{
				PatternFromColor.drawPattern(red3);
			}else if(r > (128/6)*3)
			{
				PatternFromColor.drawPattern(red2);
			}else if(r > (128/6)*2)
			{
				PatternFromColor.drawPattern(red1);
			}else if(r > (128/6)*2)
			{
				PatternFromColor.drawPattern(red0);
			}else
			{
				PatternFromColor.drawPattern(white);
			}
		}
		if(b >= total/2)
		{
			if(b > (128/6)*5)
			{
				PatternFromColor.drawPattern(blue4);
			}else if(b > (128/6)*4)
			{
				PatternFromColor.drawPattern(blue3);
			}else if(b > (128/6)*3)
			{
				PatternFromColor.drawPattern(blue2);
			}else if(b > (128/6)*2)
			{
				PatternFromColor.drawPattern(blue1);
			}else if(b > (128/6)*2)
			{
				PatternFromColor.drawPattern(blue0);
			}else
			{
				PatternFromColor.drawPattern(white);
			}

		}
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

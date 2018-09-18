package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void hasDuplicates_test1() 
	{	
		int[] arr= {1,2,3,4,5};
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test2() 
	{	
		int[] arr= {1,1,3,4,5};
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test3() 
	{	
		int[] arr= {1,2,3,4,1};
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.hasDuplicates(arr));
	}
	
	@Test
	public void hasDuplicates_test4() 
	{	
		int[] arr= null;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.hasDuplicates(arr));
	}
	
	@Test
	public void doesElementExist_Test1()
	{
		int[] arr = {1,2,3,4,5};
		int iValue=3;
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test2()
	{
		int[] arr = {1,2,3,4,5};
		int iValue=99;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void doesElementExist_Test3()
	{
		int[] arr = null;
		int iValue=1;
		LatinSquare lq = new LatinSquare();
		assertFalse(lq.doesElementExist(arr, iValue));
	}
	
	@Test
	public void getColumn_Test() {
	
	int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,3,4,1},{3,4,1,2}};
	LatinSquare ls = new LatinSquare(mySquare);
	
	System.out.println(Arrays.toString(ls.getColumn(2)));
	}
	
	@Test
	public void getColumn_Test2() {

	int[][] mySquare = {{2,6,4},{3,2,1},{9,3,7},{7,8,9}};
	LatinSquare ls = new LatinSquare(mySquare);

	System.out.println(Arrays.toString(ls.getColumn(0)));
	}
	
	@Test
	public void getColumn_Test3() {
	
	int[][] mySquare = {{1,2,3,4},{4,3,2,1},{2,3,4,1},{3,4,1,2}};
	LatinSquare ls = new LatinSquare(mySquare);
	
	System.out.println(Arrays.toString(ls.getColumn(3)));
	}
	
	@Test
	public void ContainsZeroTest() {
		int[][] mySquare = {{1,2,3},{3,2,1},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertFalse(ls.ContainsZero());
	}
	
	@Test
	public void ContainsZeroTest() {
		int[][] mySquare = {{1,2,3},{3,0,1},{2,3,1}};
		
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertTrue(ls.ContainsZero());
	}
	
	
}

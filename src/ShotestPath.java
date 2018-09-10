
public class ShotestPath {
	// 순환식 : general case, base case 중요
	
	int[][] m = new int[5][5];
	
	// recursive algorithm
	public int mat(int i, int j) {
		if(i == 1 && j == 1) {
			return m[i][j];
		}else if(i == 1) {
			return mat(1, j-1) + m[i][j];
		}else if(j == 1) {
			return mat(i-1, 1) + m[i][j];
		}else {
			return Math.min(mat(i-1,j), mat(i, j-1)) + m[i][j];
		}
	}
	
	// memoization
	int[][] L = {
			     {-1,-1,-1,-1,-1},
				 {-1,-1,-1,-1,-1},
				 {-1,-1,-1,-1,-1},
				 {-1,-1,-1,-1,-1},
				 {-1,-1,-1,-1,-1}
				};
	
	// dynamic programming 
	// 행(i)우선 계산, bottom -up 방법
	// 시간복잡도, O(n2)
	
	// tip, 배열의 i=0, j=0 부분을 무한대로 채워줌
	// if i==1 or if j==1 인 경우를 별도로 식별하지 않아도 됨
	
	// 최종 : 최소경로 구하기
	
}
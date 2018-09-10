
public class ShotestPath {
	// ��ȯ�� : general case, base case �߿�
	
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
	// ��(i)�켱 ���, bottom -up ���
	// �ð����⵵, O(n2)
	
	// tip, �迭�� i=0, j=0 �κ��� ���Ѵ�� ä����
	// if i==1 or if j==1 �� ��츦 ������ �ĺ����� �ʾƵ� ��
	
	// ���� : �ּҰ�� ���ϱ�
	
}
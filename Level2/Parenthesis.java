package Level2;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {

	public static void main(String[] args) {
				int n = 3;
				List<String> ans = new ArrayList<>();
				String s = ""
				generateParenthesis(n, n, s, ans);
				for (String k : ans) {
					System.out.println(k);
				}
			}
			static void generateParenthesis(int left, int right,String s,List<String> answer){
				if (left == 0 && right == 0) {
					answer.add(s);
				}
				if (left > right || left < 0 || right < 0) {
					return;
				}
				s += "(";
				generateParenthesis(left - 1, right, s, answer);
				s = s.substring(0, s.length() - 1);
				s += ")";
				generateParenthesis(left, right - 1, s, answer);
				s = s.substring(0, s.length() - 1);
			}
}

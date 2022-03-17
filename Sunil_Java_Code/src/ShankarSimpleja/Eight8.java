package ShankarSimpleja;
enum Wk {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturaday, Sunday
}
public class Eight8 {

	public static void main(String[] args) {
		for(Wk w :Wk.values())
		{
			System.out.print(w+"  ");
		}

	}

}

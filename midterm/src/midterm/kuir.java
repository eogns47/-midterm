package midterm;

public class kuir {
	public static void main(String[] args) throws Exception {
		String command = args[0];
		String path = args[1];

		if (command.equals("-m")) {
			if (args[2].equals("-q")) {
				String query = args[3];
				Midterm midterm = new Midterm(path, query);
				midterm.showSnippet();
			} else
				System.out.println("input query");

		}
	}
}
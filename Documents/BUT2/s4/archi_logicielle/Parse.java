public class Parse implements InterfaceData {

	private String data;
	private String[] tableau;

	public static void main(String[] args) {
		Parse p = new Parse();
		String s = " abcd " + " , " + " efgh ";
		p.setData(s);
		
		p.parse();
		p.afficher();

		p.clean();
		p.afficher();
	}

	@Override
	public void setData(String item) {
		this.data = item;
	}

	@Override
	public String getData() {
		return this.data;
	}

	@Override
	public void parse() {
		this.tableau = this.data.split(",");	// A compléter : retirer espaces avec trim()
	}

	@Override
	public void clean() {
		for (int i=0; i < tableau.length; i++) {
			tableau[i] = tableau[i].trim();
		}
	}// A compléter : retirer espaces avec trim()

	@Override 
	public void afficher() {
		for (String element : tableau) {
			System.out.println("[" + element + "]");
		}	// A compléter : afficher les éléments du tableau
	}
}

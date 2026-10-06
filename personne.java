public class Personne {

    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    public Personne() {
        nom = "Ben ALI";
        prenom = "Med";
        age = 30;
        sexe = "Homme";
    }

    public Personne(String nom, String prenom, int age, String sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getName() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
        System.out.println("Sexe : " + sexe);
    }

    public boolean sameLastName(Personne p) {
        return nom.equals(p.nom);
    }

    public static void main(String[] args) {

        Personne p1 = new Personne();
        Personne p2 = new Personne("Trabelsi", "Ahmed", 25, "Homme");

        p1.affiche();
        System.out.println();

        p2.affiche();
        System.out.println();

        if (p1.sameLastName(p2))
            System.out.println("Meme nom");
        else
            System.out.println("Noms differents");

        if (p1.getAge() > p2.getAge())
            System.out.println("La personne 1 est la plus agee");
        else if (p2.getAge() > p1.getAge())
            System.out.println("La personne 2 est la plus agee");
        else
            System.out.println("Meme age");
    }
}
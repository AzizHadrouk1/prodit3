package tn.tuniprob.gestionmagasin;

public class Magasin {

    private int identifiant;
    private String adresse;
    static int compteur_produit=0;
    private final int CAPCITE=50;

    private Produit [] tabprod=new Produit[CAPCITE];

    private int comp;
    public Magasin(){}

    public Magasin(int id,String ad)
    {
        identifiant=id;
        adresse=ad;
    }

    public void ajouter(Produit p)
    {if(comp<CAPCITE) {
        tabprod[comp] = p;
        comp++;
        compteur_produit++;
    }else {
        System.out.println("Magasin plein");
    }
    }

    public static int getcomp(){

        return compteur_produit;
    }

    public void afficherMarquePr()
    {
       for (int i=0;i<comp;i++)
           System.out.println("Marque :"+tabprod[i].getMarque());
    }



    public String toString()
    {
        String str="L'ensemble des produits :\n";
        for (int i=0;i<comp;i++)
            str+=tabprod[i]+"\n";

        return "identifiant ;"+identifiant+" adresse :"+adresse+"\n"+str;

    }
}

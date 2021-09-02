package co.edu.unipiloto.mccc.beeractivity;



public class BeerExpert {
    private String light[];
    private String brown[];
    private String dark[];
    private String amber[];
    //Clase a llamar después
    public BeerExpert(String light[], String [] brown, String [] dark, String []amber){
        this.light = light;
        this.brown = brown;
        this.dark = dark;
        this.amber = amber;
    }

    public String getRecomnedation(String opcion){
        switch (opcion){
            case "light":
                return getLight();
            case "dark":
                return getDark();
            case "brown":
                return getBrowm();
            case "amber":
                return getAmber();
            default:return "asd";
        }

    }

    public String getAmber() {
        String aux  = "";
        for (String item:this.amber){
            aux = aux + item  + "\n";
        }
        return aux;
    }

    public String getBrowm() {
        String aux  = "";
        for (String item:this.brown){
            aux = aux + item + "\n";
        }
        return aux;
    }

    public String getDark() {
        String aux  = "";
        for (String item:this.dark){
            aux = aux + item + "\n";
        }
        return aux;
    }

    public String getLight() {
        String aux  = "";
        for (String item:this.dark){
            aux = aux + item + "\n";
        }
        return aux;
    }
}


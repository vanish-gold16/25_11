public class Ctverec {
    private int strana;

    public String FillSquare(){
        String text = "";
        for (int i = 0; i < strana; i++) {
            text +="\n";
            for (int j = 0; j < 5; j++) {
                text += "*  ";
            }
        }
        return text;
    }

    public Ctverec(int strana) {
        this.strana = strana;
    }

    public int getStrana() {
        return strana;
    }

    public void setStrana(int strana) {
        this.strana = strana;
    }
}

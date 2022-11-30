public class Parallelepiped {
    private int dlina;
    private int vysota;
    private int shirina;

    public Parallelepiped(){

    }

    public Parallelepiped(int dlina, int vysota, int shirina) throws Exception{

            chekInfo(dlina,vysota,shirina);
        }


    private void chekInfo(int dlina,int vysota,int shirina)throws Exception{
        if (dlina<0 || shirina<0 || vysota<0 || dlina>20 || shirina>20 || vysota>20 ){
            throw new Exception();
        } else {
            this.dlina=dlina;
            this.vysota=vysota;
            this.shirina=shirina;
        }
    }

    public int getDlina() {
        return dlina;
    }

    public void setDlina(int dlina) {
        this.dlina = dlina;
    }

    public int getVysota() {
        return vysota;
    }

    public void setVysota(int vysota) {
        this.vysota = vysota;
    }

    public int getShirina() {
        return shirina;
    }

    public void setShirina(int shirina) {
        this.shirina = shirina;
    }
    public void getArea(){
        System.out.println(2*((vysota * dlina) + (dlina * shirina) + (vysota * shirina)));
    }
    public void getVolume(){
        System.out.println(dlina*shirina*vysota);
    }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "dlina=" + dlina +
                ", vysota=" + vysota +
                ", shirina=" + shirina +
                '}';
    }
}

public class Ejemplo1Abstraccion {

    public static void main(String[] args) {
        
        Persona per = new Persona();
        System.out.println(per.alimentarse("adulto"));
        System.out.println(per.reproducirse("adulto"));
        System.out.println(per.envejecer(""));
        System.out.println(per.morir("adulto"));
    }
}

abstract class SerVivo {
    public abstract String alimentarse(String pSer);
    public abstract String reproducirse(String pSer);
    public abstract int envejecer(String pSer);
    public abstract String morir(String pSer);
}

class Persona extends SerVivo {
    @Override
    public String alimentarse(String pSer) {
        return pSer + " ingiere alimentos";
    }

    @Override
    public String reproducirse(String pSer) {
        return pSer + " se reproduce en forma sexual";
    }

    @Override
    public int envejecer(String pSer) {
        return 60;
    }

    @Override
    public String morir(String pSer) {
        return pSer + " muere de múltiples formas";
    }


}

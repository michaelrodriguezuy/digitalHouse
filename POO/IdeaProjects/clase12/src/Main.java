public class Main {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(); //utilizo el constructor vacio
        cc.setSaldo(1500);
        cc.setDescubiertoPermitido(1000);
        cc.extraer(350);
        System.out.println(cc.informarSaldo());


        String numero = "1234";
        Integer a = Integer.parseInt(numero);
        System.out.println(a.getClass());



        Cuenta c = new CajaAhorro();
        Cuenta c1 = new CuentaCorriente();
        ((CajaAhorro)c).cobrarIntereses();
        ((CuentaCorriente)c1).setDescubiertoPermitido(200000);

        System.out.println(c.toString());
        System.out.println(((Cuenta)c).toString());


        System.out.println(c.getClass());

        if (c instanceof CajaAhorro){
            System.out.println("La variable c es una caja de ahorro");
        }else{
            System.out.println("La variable c no es una caja de ahorra");
        }













    }
}
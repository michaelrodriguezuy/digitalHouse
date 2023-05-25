public class ComputerFactory {

    private HardwareConfiguration windows;
    private HardwareConfiguration mac;

    public Computer buildNewComputer(String type){

        Computer resultado = new Computer();

        if("WIN".equalsIgnoreCase(type)){
            if(this.windows == null){
                this.windows = new HardwareConfiguration();
                this.windows.setRamMemory(2);
                this.windows.setHardDriveCapacity(128);
            }
            resultado.setHardware(this.windows);
        }else if("MAC".equalsIgnoreCase(type)){
            if(this.mac == null){
                this.mac = new HardwareConfiguration();
                this.mac.setRamMemory(16);
                this.mac.setHardDriveCapacity(500);
            }
            resultado.setHardware(this.mac);
        }else{
            return null;
        }

        return resultado;

    }
}

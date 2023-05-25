package cadenaResponsabilidad;

import model.Articulo;

public abstract class AnalistaDeCalidadHandler {
    private AnalistaDeCalidadHandler sucessor;
    public AnalistaDeCalidadHandler(AnalistaDeCalidadHandler sucessor) {
        this.sucessor = sucessor;
    }
    public AnalistaDeCalidadHandler(){
    }
    protected abstract String error(Articulo articulo);
    public String handleValidarCalidadDelProducto(Articulo articulo){
        if (procesarCalidadArticulo(articulo)){
            if (this.sucessor == null){
                return "CALIDAD OPTIMA!";
            } else{
                return this.sucessor.handleValidarCalidadDelProducto(articulo);
            }
        }
        return error(articulo);
    }
    protected abstract boolean procesarCalidadArticulo(Articulo articulo);

    public AnalistaDeCalidadHandler getSucessor() {
        return sucessor;
    }

    public void setSucessor(AnalistaDeCalidadHandler sucessor) {
        this.sucessor = sucessor;
    }
}

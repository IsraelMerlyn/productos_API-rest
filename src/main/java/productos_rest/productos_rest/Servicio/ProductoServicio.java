package productos_rest.productos_rest.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productos_rest.productos_rest.model.Producto;
import productos_rest.productos_rest.repositorio.ProductoRepositorio;

@Service
public class ProductoServicio {
    @Autowired
    private ProductoRepositorio repositorio;

    public List<Producto> listarProductos() {
        return repositorio.findAll();
    }

    public void guardarProducto(Producto producto) {
        repositorio.save(producto);
    }

    public Producto obtenerProductoId(Integer id){
        return repositorio.findById(id).get();
    }

    public void eliminarProducto(Integer id) {
        repositorio.deleteById(id);
    }
}

package productos_rest.productos_rest.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import productos_rest.productos_rest.model.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{
    
}

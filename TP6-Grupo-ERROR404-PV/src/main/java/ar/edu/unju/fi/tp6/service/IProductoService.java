package ar.edu.unju.fi.tp6.service;

import java.util.List;

import ar.edu.unju.fi.tp6.model.Producto;

public interface IProductoService {
	public void generarTablaProducto();
	
	public void agregarProducto(Producto producto);
	
	public Producto ultimoProducto();
	
	public List<Producto> obtenerProductos();
	
	public Producto getProductoPorCodigo(int codigo, int cantidad);
}

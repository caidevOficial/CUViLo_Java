/*
 * Copyright (C) 2020 caidev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package entidades;

/**
 * @author FacuFalcone
 *
 */
public class Producto {

	// Atributos
	protected int codigo;
	protected int stock; 
	protected String descripcion;
	protected String rubro;
	protected double precio;
	private Laboratorio labo;
	
	// Constructores
	
	/**
	 * set the data necessary to reserve space on memory.
	 */
	public Producto() {
		this.codigo = 0;
		this.stock = 0;
		this.descripcion = "";
		this.rubro = "";
		this.precio = 0;
		this.labo = null;
	}
	
	/**
	 * @param codigo
	 */
	public Producto(int codigo) {
		if(codigo>0) {
			this.codigo = codigo;
		}
	}
	
	/**
	 * @param codigo
	 * @param stock
	 */
	public Producto(int codigo, int stock) {
		this(codigo);
		if(stock>0) {
			this.stock = stock;
		}
	}
	
	/**
	 * @param codigo
	 * @param stock
	 * @param descripcion
	 */
	public Producto(int codigo, int stock, String descripcion) {
		this(codigo, stock);
		if(descripcion!=null) {
			this.descripcion = descripcion;
		}
	}
	
	/**
	 * @param codigo
	 * @param stock
	 * @param descripcion
	 * @param rubro
	 */
	public Producto(int codigo, int stock, String descripcion, String rubro) {
		this(codigo, stock, descripcion);
		if(rubro!=null) {
			this.rubro = rubro;
		}
	}
	
	/**
	 * @param codigo
	 * @param stock
	 * @param descripcion
	 * @param rubro
	 * @param precio
	 */
	public Producto(int codigo, int stock, String descripcion, String rubro, double precio) {
		this(codigo,stock,descripcion,rubro);
		if(precio>0) {
			this.precio = precio;			
		}
	}

	/**
	 * @param codigo
	 * @param stock
	 * @param descripcion
	 * @param rubro
	 * @param precio
	 * @param labo
	 */
	public Producto(int codigo, int stock, String descripcion, String rubro, double precio, Laboratorio labo) {
		this(codigo,stock,descripcion,rubro,precio);
		if(labo!=null) {
			this.labo = labo;			
		}
	}

	// Getters
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @return the rubro
	 */
	public String getRubro() {
		return rubro;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @return the labo
	 */
	public Laboratorio getLabo() {
		return labo;
	}

	// Setters
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		if(codigo>0) {
			this.codigo = codigo;			
		}
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		if(stock>0) {
			this.stock = stock;			
		}
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		if(descripcion!=null) {
			this.descripcion = descripcion;			
		}
	}

	/**
	 * @param rubro the rubro to set
	 */
	public void setRubro(String rubro) {
		if(rubro!=null) {
			this.rubro = rubro;			
		}
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio = precio;			
		}
	}
	
	/**
	 * @param labo the labo to set
	 */
	public void setLabo(Laboratorio labo) {
		if(labo!=null) {
			this.labo = labo;			
		}
	}

	/**
	 * Shows all the info of the product.
	 */
	public void Mostrar() {
		System.out.println("Codigo: " + getCodigo());
		System.out.println("Descripcion: " + getDescripcion());
		System.out.println("Rubro: " + getRubro());
		System.out.println("Stock: " + getStock());
		System.out.println("Laboratorio: " + getLabo());
		System.out.println("Precio: $" + getPrecio());
	}
	
	/**
	 * @return returns the value of the entire stock.
	 */
	public double stockValorizado() {
		double valor = getStock()*getPrecio()*1.12;
		return valor;
	}
}

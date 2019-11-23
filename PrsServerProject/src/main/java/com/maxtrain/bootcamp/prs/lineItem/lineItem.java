package com.maxtrain.bootcamp.prs.lineItem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.maxtrain.bootcamp.prs.product.Product;
import com.maxtrain.bootcamp.prs.request.Request;

public class lineItem {

	@Entity
	public class LineItem {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@ManyToOne(optional = false)
		@JoinColumn(name = "RequestID")
		private Request request;
		@ManyToOne(optional = false)
		@JoinColumn(name = "ProductID")
		private Product product;
		@Column(nullable = false)
		private int quantity;

		public LineItem(int id, Request request, Product product, int quantity) {

			super();
			this.id = id;
			this.request = request;
			this.product = product;
			this.quantity = quantity;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Request getRequest() {
			return request;
		}

		public void setRequest(Request request) {
			this.request = request;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "LineItem [id=" + id + ", request=" + request + ", product=" + product + ", quantity=" + quantity
					+ "]";
		}

	}
}

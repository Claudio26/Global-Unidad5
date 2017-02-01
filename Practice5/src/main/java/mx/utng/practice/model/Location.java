package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="locations")
public class Location {
		@Id @GeneratedValue
		private Long id;
		@Column(length =50)
		private String log_wid;
		@Column(length =20)
		private String parent;
		@Column(length =20)
		private String uptlocation;
		@Column(length =20)
		private String name;
		@Column (length =20)
		private String code;
		@Column (length =20)
		private String Description;
		
		
		
		public Location(String log_wid, String parent, String uptlocation, String name, String code, String Description) {
			super();
			this.log_wid=log_wid;
			this.parent=parent;
			this.uptlocation=uptlocation;
			this.name=name;
			this.code=code;
			this.Description=Description;
		}

		public Location() {
			this("","","","","","");
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		

		public String getLog_wid() {
			return log_wid;
		}

		public void setLog_wid(String log_wid) {
			this.log_wid = log_wid;
		}

		public String getParent() {
			return parent;
		}

		public void setParent(String parent) {
			this.parent = parent;
		}

		public String getUptlocation() {
			return uptlocation;
		}

		public void setUptlocation(String uptlocation) {
			this.uptlocation = uptlocation;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDescription() {
			return Description;
		}

		public void setDescription(String description) {
			Description = description;
		}

		@Override
		public String toString() {
			return "Location [id=" + id + ", log_wid=" + log_wid + ", parent=" + parent + ", uptlocation=" + uptlocation + ", name=" + name
					+ ", code=" +code + ",Description=" +Description+ "]";
		}
		
	}



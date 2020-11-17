package sources.data;

import com.google.gson.annotations.SerializedName;

public class VehiclesResponse{

	@SerializedName("films")
	private String films;

	@SerializedName("pilot")
	private String pilot;

	@SerializedName("vehicle_class")
	private String vehicleClass;

	@SerializedName("name")
	private String name;

	@SerializedName("length")
	private String length;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	@SerializedName("url")
	private String url;

	public void setFilms(String films){
		this.films = films;
	}

	public String getFilms(){
		return films;
	}

	public void setPilot(String pilot){ this.pilot = pilot; }

	public String getPilot(){ return pilot; }

	public void setVehicleClass(String vehicleClass){
		this.vehicleClass = vehicleClass;
	}

	public String getVehicleClass(){
		return vehicleClass;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLength(String length){
		this.length = length;
	}

	public String getLength(){
		return length;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"VehiclesResponse{" + 
			"films = '" + films + '\'' + 
			",pilot = '" + pilot + '\'' + 
			",vehicle_class = '" + vehicleClass + '\'' + 
			",name = '" + name + '\'' + 
			",length = '" + length + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}
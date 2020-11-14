package sources.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LocationsResponse{

	@SerializedName("films")
	private List<String> films;

	@SerializedName("surface_water")
	private String surfaceWater;

	@SerializedName("name")
	private String name;

	@SerializedName("length")
	private Object length;

	@SerializedName("residents")
	private List<String> residents;

	@SerializedName("id")
	private String id;

	@SerializedName("climate")
	private String climate;

	@SerializedName("terrain")
	private String terrain;

	@SerializedName("url")
	private List<String> url;

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
	}

	public void setSurfaceWater(String surfaceWater){
		this.surfaceWater = surfaceWater;
	}

	public String getSurfaceWater(){
		return surfaceWater;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLength(Object length){
		this.length = length;
	}

	public Object getLength(){
		return length;
	}

	public void setResidents(List<String> residents){
		this.residents = residents;
	}

	public List<String> getResidents(){
		return residents;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setClimate(String climate){
		this.climate = climate;
	}

	public String getClimate(){
		return climate;
	}

	public void setTerrain(String terrain){
		this.terrain = terrain;
	}

	public String getTerrain(){
		return terrain;
	}

	public void setUrl(List<String> url){
		this.url = url;
	}

	public List<String> getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"LocationsResponse{" + 
			"films = '" + films + '\'' + 
			",surface_water = '" + surfaceWater + '\'' + 
			",name = '" + name + '\'' + 
			",length = '" + length + '\'' + 
			",residents = '" + residents + '\'' + 
			",id = '" + id + '\'' + 
			",climate = '" + climate + '\'' + 
			",terrain = '" + terrain + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}
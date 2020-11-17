package sources.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class FilmResponse {

	@SerializedName("director")
	private String director;

	@SerializedName("length")
	private Object length;

	@SerializedName("description")
	private String description;

	@SerializedName("vehicles")
	private List<String> vehicles;

	@SerializedName("title")
	private String title;

	@SerializedName("rt_score")
	private String rtScore;

	@SerializedName("people")
	private List<String> people;

	@SerializedName("url")
	private String url;

	@SerializedName("release_date")
	private String releaseDate;

	@SerializedName("species")
	private List<String> species;

	@SerializedName("producer")
	private String producer;

	@SerializedName("locations")
	private List<String> locations;

	@SerializedName("id")
	private String id;

	public void setDirector(String director){
		this.director = director;
	}

	public String getDirector(){
		return director;
	}

	public void setLength(Object length){
		this.length = length;
	}

	public Object getLength(){
		return length;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setVehicles(List<String> vehicles){
		this.vehicles = vehicles;
	}

	public List<String> getVehicles(){
		return vehicles;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setRtScore(String rtScore){
		this.rtScore = rtScore;
	}

	public String getRtScore(){
		return rtScore;
	}

	public void setPeople(List<String> people){
		this.people = people;
	}

	public List<String> getPeople(){
		return people;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setReleaseDate(String releaseDate){
		this.releaseDate = releaseDate;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public void setSpecies(List<String> species){
		this.species = species;
	}

	public List<String> getSpecies(){
		return species;
	}

	public void setProducer(String producer){
		this.producer = producer;
	}

	public String getProducer(){
		return producer;
	}

	public void setLocations(List<String> locations){
		this.locations = locations;
	}

	public List<String> getLocations(){
		return locations;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"director = '" + director + '\'' + 
			",length = '" + length + '\'' + 
			",description = '" + description + '\'' + 
			",vehicles = '" + vehicles + '\'' + 
			",title = '" + title + '\'' + 
			",rt_score = '" + rtScore + '\'' + 
			",people = '" + people + '\'' + 
			",url = '" + url + '\'' + 
			",release_date = '" + releaseDate + '\'' + 
			",species = '" + species + '\'' + 
			",producer = '" + producer + '\'' + 
			",locations = '" + locations + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
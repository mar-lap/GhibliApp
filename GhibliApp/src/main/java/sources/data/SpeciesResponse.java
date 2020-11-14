package sources.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SpeciesResponse {

	@SerializedName("films")
	private List<String> films;

	@SerializedName("name")
	private String name;

	@SerializedName("length")
	private Object length;

	@SerializedName("eye_colors")
	private String eyeColors;

	@SerializedName("id")
	private String id;

	@SerializedName("classification")
	private String classification;

	@SerializedName("people")
	private List<String> people;

	@SerializedName("url")
	private String url;

	@SerializedName("hair_colors")
	private String hairColors;

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
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

	public void setEyeColors(String eyeColors){
		this.eyeColors = eyeColors;
	}

	public String getEyeColors(){
		return eyeColors;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setClassification(String classification){
		this.classification = classification;
	}

	public String getClassification(){
		return classification;
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

	public void setHairColors(String hairColors){
		this.hairColors = hairColors;
	}

	public String getHairColors(){
		return hairColors;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"films = '" + films + '\'' + 
			",name = '" + name + '\'' + 
			",length = '" + length + '\'' + 
			",eye_colors = '" + eyeColors + '\'' + 
			",id = '" + id + '\'' + 
			",classification = '" + classification + '\'' + 
			",people = '" + people + '\'' + 
			",url = '" + url + '\'' + 
			",hair_colors = '" + hairColors + '\'' + 
			"}";
		}
}
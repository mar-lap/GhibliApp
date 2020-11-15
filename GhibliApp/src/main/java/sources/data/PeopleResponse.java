package sources.data;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PeopleResponse {

	@SerializedName("films")
	private List<String> films;

	@SerializedName("eye_color")
	private String eyeColor;

	@SerializedName("gender")
	private String gender;

	@SerializedName("species")
	private String species;

	@SerializedName("name")
	private String name;

	@SerializedName("length")
	private Object length;

	@SerializedName("id")
	private String id;

	@SerializedName("age")
	private int age;

	@SerializedName("url")
	private String url;

	@SerializedName("hair_color")
	private String hairColor;

	public void setFilms(List<String> films){
		this.films = films;
	}

	public List<String> getFilms(){
		return films;
	}

	public void setEyeColor(String eyeColor){
		this.eyeColor = eyeColor;
	}

	public String getEyeColor(){
		return eyeColor;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setSpecies(String species){
		this.species = species;
	}

	public String getSpecies(){
		return species;
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

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setHairColor(String hairColor){
		this.hairColor = hairColor;
	}

	public String getHairColor(){
		return hairColor;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"films = '" + films + '\'' + 
			",eye_color = '" + eyeColor + '\'' + 
			",gender = '" + gender + '\'' + 
			",species = '" + species + '\'' + 
			",name = '" + name + '\'' + 
			",length = '" + length + '\'' + 
			",id = '" + id + '\'' + 
			",age = '" + age + '\'' + 
			",url = '" + url + '\'' + 
			",hair_color = '" + hairColor + '\'' + 
			"}";
		}
}
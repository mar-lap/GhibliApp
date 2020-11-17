package foruser;


import sources.providers.*;
import forserver.md.*;
import forserver.usecases.*;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

public class UI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Films testFilmApiProvider(String id) {
        GetFilmIdByUseCase useCase = new GetFilmIdByUseCase(new ApiFilmProvider());
        Films film = useCase.getFilmsById(id);
        return film;
    }

    private People testPeopleApiProvider(String id) {
        GetPeopleIdByUseCase useCase = new GetPeopleIdByUseCase(new ApiPeopleProvider());
        People people = useCase.getPeopleById(id);
        return people;
    }

    private Locations testLocationApiProvider(String id) {
        GetLocationIdByUseCase useCase = new GetLocationIdByUseCase(new ApiLocationProvider());
        Locations location = useCase.getLocationById(id);
        return location;
    }

    private Species testSpeciesApiProvider(String id) {
        GetSpeciesIdByUseCase useCase = new GetSpeciesIdByUseCase(new ApiSpeciesProvider());
        Species species = useCase.getSpeciesById(id);
        return species;
    }

    private Vehicles testVehicleApiProvider(String id) {
        GetVehicleIdByUseCase useCase = new GetVehicleIdByUseCase(new ApiVehiclesProvider());
        Vehicles vehicle = useCase.getVehicleById(id);
        return vehicle;
    }

    public FlowPane BadAnswer(FlowPane column, String type) {
        if (type == "people") type = "person";

        Label answer = new Label("Sorry, didn't find that " + type);
        answer.setTextFill(Color.WHITE);
        answer.setFont(Font.font("Arial", FontWeight.BOLD, 15));

        column = new FlowPane(Orientation.HORIZONTAL, answer);
        column.setAlignment(Pos.CENTER);

        return column;
    }

    public Stage Answer(Stage primaryStage, String type, String id) {
        FlowPane column = new FlowPane();
        int q = 1;
        switch(q) {
            case 1: if (type == "films") {
                Films film_answer = testFilmApiProvider(id);
                if (film_answer != null) {
                    Label title = new Label("title:" + film_answer.getTitle());
                    title.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    title.setTextFill(Color.WHITE);

                    Label desc = new Label("description: " + film_answer.getDescription());
                    desc.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    desc.setTextFill(Color.WHITE);
                    desc.setWrapText(true);
                    desc.setMaxWidth(300);

                    Label dir = new Label("director: " + film_answer.getDirector());
                    dir.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    dir.setTextFill(Color.WHITE);

                    Label prod = new Label("producer: " + film_answer.getProducer());
                    prod.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    prod.setTextFill(Color.WHITE);

                    Label rel = new Label("release date: " + film_answer.getRelease_date());
                    rel.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    rel.setTextFill(Color.WHITE);

                    Label score = new Label("rt score: " + film_answer.getRt_score());
                    score.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    score.setTextFill(Color.WHITE);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, title, desc, dir, prod, rel, score);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 2;

            case 2: if (type == "people") {
                People people = testPeopleApiProvider(id);
                if (people != null) {
                    Label name = new Label("name: " + people.getName());
                    name.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    name.setTextFill(Color.WHITE);

                    Label gender = new Label("gender: " + people.getGender());
                    gender.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    gender.setTextFill(Color.WHITE);

                    Label age = new Label("age: " + people.getAge());
                    age.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    age.setTextFill(Color.WHITE);

                    Label eye_color = new Label("eye_color: " + people.getEye_color());
                    eye_color.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    eye_color.setTextFill(Color.WHITE);

                    Label hair_color = new Label("hair_color: " + people.getHair_color());
                    hair_color.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    hair_color.setTextFill(Color.WHITE);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, gender, age, eye_color, hair_color);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 3;

            case 3: if (type == "locations") {
                Locations location = testLocationApiProvider(id);
                if (location != null) {
                    Label name = new Label("name: " + location.getName());
                    name.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    name.setTextFill(Color.WHITE);

                    Label climate = new Label("climate: " + location.getClimate());
                    climate.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    climate.setTextFill(Color.WHITE);

                    Label terrain = new Label("terrain: " + location.getTerrain());
                    terrain.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    terrain.setTextFill(Color.WHITE);

                    Label surf_water = new Label("surface water: " + location.getSurface_water());
                    surf_water.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    surf_water.setTextFill(Color.WHITE);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, climate, terrain, surf_water);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 4;

            case 4: if (type == "species") {
                Species species = testSpeciesApiProvider(id);
                if (species != null) {
                    Label name = new Label("name: " + species.getName());
                    name.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
                    name.setTextFill(Color.WHITE);

                    Label classification = new Label("classification: " + species.getClassification());
                    classification.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
                    classification.setTextFill(Color.WHITE);

                    Label eye_color = new Label("eye color: " + species.getEye_colors());
                    eye_color.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
                    eye_color.setTextFill(Color.WHITE);

                    Label hair_color = new Label("hair color: " + species.getHair_colors());
                    hair_color.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
                    hair_color.setTextFill(Color.WHITE);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, classification, eye_color, hair_color);
                    column.setAlignment(Pos.CENTER);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 5;

            case 5: if (type == "vehicles") {
                Vehicles vehicle = testVehicleApiProvider(id);
                if (vehicle != null) {
                    Label name = new Label("name: " + vehicle.getName());
                    name.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    name.setTextFill(Color.WHITE);

                    Label desc = new Label("description: " + vehicle.getDescription());
                    desc.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    desc.setTextFill(Color.WHITE);
                    desc.setWrapText(true);
                    desc.setMaxWidth(400);

                    Label veh_class = new Label("vehicle class: " + vehicle.getVehicle_class());
                    veh_class.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    veh_class.setTextFill(Color.WHITE);

                    Label length = new Label("length: " + vehicle.getLength());
                    length.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
                    length.setTextFill(Color.WHITE);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, desc, veh_class, length);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }

            break;
        }

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/ghibliImage.jpeg", 400, 280, false, true);
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        column.setBackground(new Background(image));

        Scene scene = new Scene(column, 400, 280);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        primaryStage.getIcons().add(icon);

        primaryStage.show();
        return primaryStage;
    }

    public Stage EnterId(Stage stage, String type) {
        Label title = new Label("Enter id:");
        title.setFont(Font.font("Arial", FontWeight.LIGHT, 15));
        AnchorPane.setTopAnchor(title, 80.0);
        AnchorPane.setLeftAnchor(title, 110.0);
        AnchorPane.setRightAnchor(title, 20.0);
        title.setTextFill(Color.WHITE);

        TextField id = new TextField();
        AnchorPane.setTopAnchor(id, 110.0);
        AnchorPane.setLeftAnchor(id, 50.0);

        Label text = new Label("...");
        text.setTextFill(Color.BLUEVIOLET);

        Hyperlink find = new Hyperlink("Find");
        AnchorPane.setTopAnchor(find, 110.0);
        AnchorPane.setLeftAnchor(find, 210.0);
        find.setTextFill(Color.WHITE);
        find.setOnAction(e -> {
            Stage stage_answer = new Stage();
            stage_answer = Answer(stage_answer, type, id.getText());

        });

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/wind.jpg",300, 200, false, true, true);
        ImageView back = new ImageView(img);

        AnchorPane root = new AnchorPane(back, title, id, find, text);
        Scene scene = new Scene(root, 300,  200);

        stage.setScene(scene);

        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }

    public Stage window(Stage stage) {
        Label title = new Label("What information from Ghibli Studio do you prefer to know?");
        title.setTextFill(Color.WHITE);
        title.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        AnchorPane.setTopAnchor(title, 20.0);
        AnchorPane.setLeftAnchor(title, 12.0);
        AnchorPane.setRightAnchor(title, 20.0);

        Hyperlink type1_btn = new Hyperlink("1");
        AnchorPane.setTopAnchor(type1_btn, 50.0);
        AnchorPane.setLeftAnchor(type1_btn, 15.0);
        AnchorPane.setBottomAnchor(type1_btn, 220.0);
        type1_btn.setTextFill(Color.BLACK);

        type1_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "films");
        });

        Label films = new Label("Films");
        films.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        AnchorPane.setBottomAnchor(films, 45.0);
        AnchorPane.setLeftAnchor(films, 45.0);
        AnchorPane.setBottomAnchor(films, 225.0);
        films.setTextFill(Color.WHITE);

        Hyperlink type2_btn = new Hyperlink("2");
        AnchorPane.setTopAnchor(type2_btn, 90.0);
        AnchorPane.setLeftAnchor(type2_btn, 15.0);
        AnchorPane.setBottomAnchor(type2_btn, 180.0);
        type2_btn.setTextFill(Color.BLACK);

        type2_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "people");
        });


        Label people = new Label("People");
        people.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
        AnchorPane.setBottomAnchor(people, 85.0);
        AnchorPane.setLeftAnchor(people, 45.0);
        AnchorPane.setBottomAnchor(people, 185.0);
        people.setTextFill(Color.WHITE);

        Hyperlink type3_btn = new Hyperlink("3");
        AnchorPane.setTopAnchor(type3_btn, 130.0);
        AnchorPane.setLeftAnchor(type3_btn, 15.0);
        AnchorPane.setBottomAnchor(type3_btn, 140.0);
        type3_btn.setTextFill(Color.BLACK);

        type3_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "locations");
        });

        Label locations = new Label("Locations");
        locations.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
        AnchorPane.setBottomAnchor(locations, 135.0);
        AnchorPane.setLeftAnchor(locations, 45.0);
        AnchorPane.setBottomAnchor(locations, 145.0);
        locations.setTextFill(Color.WHITE);

        Hyperlink type4_btn = new Hyperlink("4");
        AnchorPane.setTopAnchor(type4_btn, 170.0);
        AnchorPane.setLeftAnchor(type4_btn, 15.0);
        AnchorPane.setBottomAnchor(type4_btn, 100.0);
        type4_btn.setTextFill(Color.BLACK);

        type4_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "species");
        });

        Label species = new Label("Species");
        species.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
        AnchorPane.setBottomAnchor(species, 175.0);
        AnchorPane.setLeftAnchor(species, 45.0);
        AnchorPane.setBottomAnchor(species, 105.0);
        species.setTextFill(Color.WHITE);

        Hyperlink type5_btn = new Hyperlink("5");
        AnchorPane.setTopAnchor(type5_btn, 210.0);
        AnchorPane.setLeftAnchor(type5_btn, 15.0);
        AnchorPane.setBottomAnchor(type5_btn, 60.0);
        type5_btn.setTextFill(Color.BLACK);

        type5_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "vehicles");
        });

        Label vehicles = new Label("Vehicles");
        vehicles.setFont(Font.font("Arial", FontWeight.LIGHT, 13));
        AnchorPane.setBottomAnchor(vehicles, 215.0);
        AnchorPane.setLeftAnchor(vehicles, 45.0);
        AnchorPane.setBottomAnchor(vehicles, 65.0);
        vehicles.setTextFill(Color.WHITE);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/spirit.jpg", 400, 300, false, true,true);
        ImageView back_img = new ImageView();
        back_img.setImage(img);

        AnchorPane root = new AnchorPane(back_img, title, films, people, locations, species, vehicles, type1_btn, type2_btn, type3_btn, type4_btn, type5_btn);

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);

        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();
        return stage;
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage = window(primaryStage);
    }
}

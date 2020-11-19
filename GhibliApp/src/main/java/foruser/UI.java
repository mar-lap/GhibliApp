package foruser;

import sources.providers.*;
import forserver.md.*;
import forserver.usecases.*;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.application.Application;
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
        Label answer = new Label("Sorry, didn't find that " + type);
        answer.setTextFill(Color.BLACK);
        answer.setFont(Font.font("Arial", FontWeight.BOLD, 15));

        column = new FlowPane(Orientation.HORIZONTAL, answer);
        column.setAlignment(Pos.CENTER);

        return column;
    }

    public FlowPane NullAnswer(FlowPane column) {
        Label answer = new Label("There's nothing. Are you sure, that you entered the id?");
        answer.setTextFill(Color.BLACK);
        answer.setFont(Font.font("Arial", FontWeight.BOLD, 15));

        column = new FlowPane(answer);
        column.setAlignment(Pos.CENTER);

        return column;
    }

    public Stage Answer(Stage primaryStage, String type, String id) {
        FlowPane column = new FlowPane();
        int q = 1;

        if (id.length() == 0) {
            q = 6;
            column = NullAnswer(column);
        }

        switch(q) {
            case 1: if (type == "film") {
                Films film_answer = testFilmApiProvider(id);
                if (film_answer != null) {
                    Label title = new Label("title:" + film_answer.getTitle());
                    title.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    title.setTextFill(Color.BLACK);

                    Label desc = new Label("description: " + film_answer.getDescription());
                    desc.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    desc.setTextFill(Color.BLACK);
                    desc.setWrapText(true);
                    desc.setMaxWidth(300);

                    Label dir = new Label("director: " + film_answer.getDirector());
                    dir.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    dir.setTextFill(Color.BLACK);

                    Label prod = new Label("producer: " + film_answer.getProducer());
                    prod.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    prod.setTextFill(Color.BLACK);

                    Label rel = new Label("release date: " + film_answer.getRelease_date());
                    rel.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    rel.setTextFill(Color.BLACK);

                    Label score = new Label("rt score: " + film_answer.getRt_score());
                    score.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    score.setTextFill(Color.BLACK);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, title, desc, dir, prod, rel, score);
                    column.setAlignment(Pos.CENTER);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 2;

            case 2: if (type == "person") {
                People people = testPeopleApiProvider(id);
                if (people != null) {
                    Label name = new Label("name: " + people.getName());
                    name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    name.setTextFill(Color.BLACK);

                    Label gender = new Label("gender: " + people.getGender());
                    gender.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    gender.setTextFill(Color.BLACK);

                    Label age = new Label("age: " + people.getAge());
                    age.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    age.setTextFill(Color.BLACK);

                    Label eye_color = new Label("eye_color: " + people.getEye_color());
                    eye_color.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    eye_color.setTextFill(Color.BLACK);

                    Label hair_color = new Label("hair_color: " + people.getHair_color());
                    hair_color.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    hair_color.setTextFill(Color.BLACK);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, gender, age, eye_color, hair_color);
                    column.setAlignment(Pos.CENTER);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 3;

            case 3: if (type == "location") {
                Locations location = testLocationApiProvider(id);
                if (location != null) {
                    Label name = new Label("name: " + location.getName());
                    name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    name.setTextFill(Color.BLACK);

                    Label climate = new Label("climate: " + location.getClimate());
                    climate.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    climate.setTextFill(Color.BLACK);

                    Label terrain = new Label("terrain: " + location.getTerrain());
                    terrain.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    terrain.setTextFill(Color.BLACK);

                    Label surf_water = new Label("surface water: " + location.getSurface_water());
                    surf_water.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    surf_water.setTextFill(Color.BLACK);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, climate, terrain, surf_water);
                    column.setAlignment(Pos.CENTER);
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
                    name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    name.setTextFill(Color.BLACK);

                    Label classification = new Label("classification: " + species.getClassification());
                    classification.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    classification.setTextFill(Color.BLACK);

                    Label eye_color = new Label("eye color: " + species.getEye_colors());
                    eye_color.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    eye_color.setTextFill(Color.BLACK);

                    Label hair_color = new Label("hair color: " + species.getHair_colors());
                    hair_color.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    hair_color.setTextFill(Color.BLACK);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, classification, eye_color, hair_color);
                    column.setAlignment(Pos.CENTER);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }
            else q = 5;

            case 5: if (type == "vehicle") {
                Vehicles vehicle = testVehicleApiProvider(id);
                if (vehicle != null) {
                    Label name = new Label("name: " + vehicle.getName());
                    name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    name.setTextFill(Color.BLACK);

                    Label desc = new Label("description: " + vehicle.getDescription());
                    desc.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    desc.setTextFill(Color.BLACK);
                    desc.setWrapText(true);
                    desc.setMaxWidth(400);

                    Label veh_class = new Label("vehicle class: " + vehicle.getVehicle_class());
                    veh_class.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    veh_class.setTextFill(Color.BLACK);

                    Label length = new Label("length: " + vehicle.getLength());
                    length.setFont(Font.font("Arial", FontWeight.BOLD, 15));
                    length.setTextFill(Color.BLACK);

                    column = new FlowPane(Orientation.VERTICAL, 10, 10, name, desc, veh_class, length);
                    column.setAlignment(Pos.CENTER);
                }
                else {
                    column = BadAnswer(column, type);
                }
            }

            break;
        }

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/ghibliImage.jpeg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false,true, true));
        column.setBackground(new Background(image));

        Scene scene = new Scene(column, 500, 400);

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
        title.setTextFill(Color.WHITE);

        FlowPane enter = new FlowPane(title);
        enter.setAlignment(Pos.TOP_CENTER);

        TextField id = new TextField();

        Hyperlink find = new Hyperlink("Find");
        find.setTextFill(Color.WHITE);
        find.setOnAction(e -> {
            Stage stage_answer = new Stage();
            stage_answer = Answer(stage_answer, type, id.getText());

        });

        FlowPane find_id = new FlowPane(Orientation.HORIZONTAL, 10, 10, id, find);
        find_id.setAlignment(Pos.CENTER);

        FlowPane root = new FlowPane(Orientation.VERTICAL, 10, 10, enter, find_id);
        root.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/wind.jpg",300, 200, false, true, true);
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(300, 200, false, false, true, true));
        root.setBackground(new Background(image));

        Scene scene = new Scene(root, 300,  200);

        stage.setScene(scene);

        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }

    public Stage Greeting(Stage stage) {
        Label title = new Label("What information from Ghibli Studio do you prefer to know?");
        title.setTextFill(Color.WHITE);
        title.setFont(Font.font("Arial", FontWeight.LIGHT, 14));

        FlowPane top = new FlowPane(title);
        top.setAlignment(Pos.TOP_CENTER);

        Hyperlink type1_btn = new Hyperlink("1");
        type1_btn.setTextFill(Color.BLACK);
        type1_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "film");
        });

        Label films = new Label("Films");
        films.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        films.setTextFill(Color.WHITE);

        FlowPane first_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type1_btn, films);

        Hyperlink type2_btn = new Hyperlink("2");
        type2_btn.setTextFill(Color.BLACK);
        type2_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "person");
        });

        Label people = new Label("People");
        people.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        people.setTextFill(Color.WHITE);

        FlowPane second_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type2_btn, people);

        Hyperlink type3_btn = new Hyperlink("3");
        type3_btn.setTextFill(Color.BLACK);
        type3_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "location");
        });

        Label locations = new Label("Locations");
        locations.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        locations.setTextFill(Color.WHITE);

        FlowPane third_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type3_btn, locations);

        Hyperlink type4_btn = new Hyperlink("4");
        type4_btn.setTextFill(Color.BLACK);
        type4_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "species");
        });

        Label species = new Label("Species");
        species.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        species.setTextFill(Color.WHITE);

        FlowPane forth_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type4_btn, species);

        Hyperlink type5_btn = new Hyperlink("5");
        type5_btn.setTextFill(Color.BLACK);
        type5_btn.setOnAction(e -> {
            Stage stage_id = new Stage();
            stage_id = EnterId(stage_id, "vehicle");
        });

        Label vehicles = new Label("Vehicles");
        vehicles.setFont(Font.font("Arial", FontWeight.LIGHT, 14));
        vehicles.setTextFill(Color.WHITE);

        FlowPane fifth_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type5_btn, vehicles);

        FlowPane result = new FlowPane(Orientation.VERTICAL, 10, 10, top, first_row, second_row, third_row, forth_row, fifth_row);
        result.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/spirit.jpg", 400, 300, false, true);
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false,true, true));
        result.setBackground(new Background(image));

        Scene scene = new Scene(result, 400, 300);
        stage.setScene(scene);

        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();
        return stage;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage = Greeting(primaryStage);
    }
}

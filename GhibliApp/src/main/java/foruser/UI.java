package foruser;

import sources.providers.*;
import forserver.md.*;
import forserver.usecases.*;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
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
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;

import java.util.List;

public class UI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private List <Films> FilmsApiProvider() {
        GetFilm films = new GetFilm(new ApiAllFilmsProvider());
        List<Films> film = films.GetListOfFilms();
        return(film);
    }

    private List <People> PeopleApiProvider() {
        GetPeople people = new GetPeople(new ApiAllPeopleProvider());
        List <People> person = people.GetListOfPeople();
        return person;
    }

    private List <Locations> LocationsApiProvider() {
        GetLocation loc = new GetLocation(new ApiAllLocationsProvider());
        List<Locations> locs = loc.GetLIstOfLocations();
        return locs;
    }

    private List <Species> SpeciesApiProvider() {
        GetSpecies species = new GetSpecies(new ApiAllSpeciesProvider());
        List <Species> speciess = species.GetListOfSpecies();
        return speciess;
    }

    private List <Vehicles> VehiclesApiProvider() {
        GetVehicle vehicle = new GetVehicle(new ApiAllVehiclesProvider());
        List<Vehicles> vehicles = vehicle.GetListOfVehicles();
        return vehicles;
    }

    public VBox ButtonsForFilms(List <Films> data) {
        VBox Pane = new VBox();
        Button []buttons = new Button[data.size()];

        Label title = new Label("Choice a film: ");
        title.setAlignment(Pos.TOP_CENTER);
        title.setFont(Font.font("Arial", FontWeight.BLACK, 15));

        Pane.setSpacing(10);
        Pane.setPadding(new Insets(15, 20, 10, 10));
        Pane.getChildren().add(title);

        int i = 0;
        for (Button but:buttons) {
            but = new Button(data.get(i).getTitle());
            but.setTextFill(Color.BLACK);
            but.prefWidthProperty().bind(Pane.widthProperty().multiply(0.5));
            int finalI = i;
            but.setOnAction(e -> {
                Stage primStage = new Stage();
                primStage = Answer.AnswerForFilms(primStage, data.get(finalI));
            });
            Pane.getChildren().add(but);
            i++;
        }

        return Pane;
    }

    public VBox ButtonsForPeople(List <People> data) {
        VBox Pane = new VBox();
        Button []buttons = new Button[data.size()];
        Label title = new Label("Choice a person: ");
        title.setAlignment(Pos.TOP_CENTER);
        title.setFont(Font.font("Arial", FontWeight.BLACK, 15));

        Pane.setSpacing(10);
        Pane.setPadding(new Insets(15, 20, 10, 10));
        Pane.getChildren().add(title);

        int i = 0;
        for (Button but:buttons) {
            but = new Button(data.get(i).getName());
            but.setTextFill(Color.BLACK);
            but.prefWidthProperty().bind(Pane.widthProperty().multiply(0.5));
            int finalI = i;
            but.setOnAction(e -> {
                Stage primStage = new Stage();
                primStage = Answer.AnswerForPeople(primStage, data.get(finalI));
            });
            Pane.getChildren().add(but);
            i++;
        }

        return Pane;
    }

    public VBox ButtonsForLocations(List <Locations> data) {
        VBox Pane = new VBox();
        Button []buttons = new Button[data.size()];
        Label title = new Label("Choice a location: ");
        title.setAlignment(Pos.TOP_CENTER);
        title.setFont(Font.font("Arial", FontWeight.BLACK, 15));

        Pane.setSpacing(10);
        Pane.setPadding(new Insets(15, 20, 10, 10));
        Pane.getChildren().add(title);

        int i = 0;
        for (Button but:buttons) {
            but = new Button(data.get(i).getName());
            but.setTextFill(Color.BLACK);
            but.prefWidthProperty().bind(Pane.widthProperty().multiply(0.5));
            int finalI = i;
            but.setOnAction(e -> {
                Stage primStage = new Stage();
                primStage = Answer.AnswerForLocations(primStage, data.get(finalI));
            });
            Pane.getChildren().add(but);
            i++;
        }

        return Pane;
    }

    public VBox ButtonsForSpecies(List <Species> data) {
        VBox Pane = new VBox();
        Button []buttons = new Button[data.size()];
        Label title = new Label("Choice a species: ");
        title.setAlignment(Pos.TOP_CENTER);
        title.setFont(Font.font("Arial", FontWeight.BLACK, 15));

        Pane.setSpacing(10);
        Pane.setPadding(new Insets(15, 20, 10, 10));
        Pane.getChildren().add(title);

        int i = 0;
        for (Button but:buttons) {
            but = new Button(data.get(i).getName());
            but.setTextFill(Color.BLACK);
            but.prefWidthProperty().bind(Pane.widthProperty().multiply(0.5));
            int finalI = i;
            but.setOnAction(e -> {
                Stage primStage = new Stage();
                primStage = Answer.AnswerForSpecies(primStage, data.get(finalI));
            });
            Pane.getChildren().add(but);
            i++;
        }

        return Pane;
    }

    public VBox ButtonsForVehicles(List <Vehicles> data) {
        VBox Pane = new VBox();
        Button []buttons = new Button[data.size()];
        Label title = new Label("Choice a vehicle: ");
        title.setAlignment(Pos.TOP_CENTER);
        title.setFont(Font.font("Arial", FontWeight.BLACK, 15));

        Pane.getChildren().add(title);
        Pane.setSpacing(10);
        Pane.setPadding(new Insets(10, 10, 10, 10));

        int i = 0;
        for (Button but:buttons) {
            but = new Button(data.get(i).getName());
            but.setTextFill(Color.BLACK);
            but.prefWidthProperty().bind(Pane.widthProperty().multiply(0.5));
            int finalI = i;
            but.setOnAction(e -> {
                Stage primStage = new Stage();
                primStage = Answer.AnswerForVehicles(primStage, data.get(finalI));
            });
            Pane.getChildren().add(but);
            i++;
        }

        return Pane;
    }

    public Stage Choice(Stage PrimaryStage, String type) {

        ScrollPane scroll = new ScrollPane();
        FlowPane pane = null;
        VBox pain = new VBox();

        int q = 1;
        switch(q) {
            case 1: if (type == "film") {
                List<Films> data = FilmsApiProvider();
                pain = ButtonsForFilms(data);
            }
            else q = 2;

            case 2: if (type == "person") {
                List <People> data = PeopleApiProvider();
                pain = ButtonsForPeople(data);
            }
            else q = 3;

            case 3: if (type == "location") {
                List <Locations> data = LocationsApiProvider();
                pain = ButtonsForLocations(data);
            }
            else q = 4;

            case 4: if (type == "species") {
                List <Species> data = SpeciesApiProvider();
                pain = ButtonsForSpecies(data);
            }
            else q = 5;

            case 5: if (type == "vehicle") {
                List <Vehicles> data = VehiclesApiProvider();
                pain = ButtonsForVehicles(data);
            }
            else q = 6;
        }

        scroll.setContent(pain);
        scroll.setHbarPolicy(ScrollBarPolicy.NEVER);
        scroll.setVbarPolicy(ScrollBarPolicy.NEVER);
        scroll.setPrefViewportHeight(600);
        scroll.setPrefViewportWidth(500);

        pain.getStylesheets().add("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/java/foruser/Style.css");
        pain.prefWidthProperty().bind(PrimaryStage.widthProperty().multiply(1));
        pain.prefHeightProperty().bind(PrimaryStage.heightProperty().multiply(1));
        pain.setAlignment(Pos.TOP_CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/2ndwind.jpg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false,true, true));
        pain.setBackground(new Background(image));


        Scene scene = new Scene(scroll, 600, 500);
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("Ghibli App");
        PrimaryStage.getIcons().add(icon);

        PrimaryStage.show();

        return PrimaryStage;
    }

    public Stage Greeting(Stage stage) {
        Label title = new Label("What information from Ghibli Studio do you prefer to know?");
        title.setTextFill(Color.WHITE);
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));

        FlowPane top = new FlowPane(title);
        top.setAlignment(Pos.TOP_CENTER);

        Hyperlink type1_btn = new Hyperlink("1");
        type1_btn.setOnAction(e -> {
            Stage stage_choice = new Stage();
            stage_choice = Choice(stage_choice, "film");
        });

        Label films = new Label("Films");
        films.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        films.setTextFill(Color.WHITE);

        FlowPane first_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type1_btn, films);

        Hyperlink type2_btn = new Hyperlink("2");
        type2_btn.setOnAction(e -> {
            Stage stage_choice = new Stage();
            stage_choice = Choice(stage_choice, "person");
        });

        Label people = new Label("People");
        people.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        people.setTextFill(Color.WHITE);

        FlowPane second_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type2_btn, people);

        Hyperlink type3_btn = new Hyperlink("3");
        type3_btn.setOnAction(e -> {
            Stage stage_choice = new Stage();
            stage_choice = Choice(stage_choice, "location");
        });

        Label locations = new Label("Locations");
        locations.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        locations.setTextFill(Color.WHITE);

        FlowPane third_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type3_btn, locations);

        Hyperlink type4_btn = new Hyperlink("4");
        type4_btn.setOnAction(e -> {
            Stage stage_choice = new Stage();
            stage_choice = Choice(stage_choice, "species");
        });

        Label species = new Label("Species");
        species.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        species.setTextFill(Color.WHITE);

        FlowPane forth_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type4_btn, species);

        Hyperlink type5_btn = new Hyperlink("5");
        type5_btn.setOnAction(e -> {
            Stage stage_choice = new Stage();
            stage_choice = Choice(stage_choice, "vehicle");
        });

        Label vehicles = new Label("Vehicles");
        vehicles.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vehicles.setTextFill(Color.WHITE);

        FlowPane fifth_row = new FlowPane(Orientation.HORIZONTAL, 10, 10, type5_btn, vehicles);

        FlowPane result = new FlowPane(Orientation.VERTICAL, 10, 10, top, first_row, second_row, third_row, forth_row, fifth_row);
        result.getStylesheets().add("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/java/foruser/Style.css");
        result.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/spirit.jpg");
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

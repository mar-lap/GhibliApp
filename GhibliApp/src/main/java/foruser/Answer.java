package foruser;

import forserver.md.*;

import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;

public class Answer {

    public static Stage AnswerForFilms(Stage stage, Films film_answer) {
        StackPane pane = new StackPane();
        FlowPane pane_text = new FlowPane();

        Label title = new Label("title:" + film_answer.getTitle());
        title.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        title.setTextFill(Color.BLACK);
        title.setTranslateZ(1);


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

        Label release = new Label("release date: " + film_answer.getRelease_date());
        release.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        release.setTextFill(Color.BLACK);

        Label score = new Label("rt score: " + film_answer.getRt_score());
        score.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        score.setTextFill(Color.BLACK);

        FlowPane pane_back = new FlowPane();
        pane_back.setStyle("-fx-background-color: white;");
        pane_back.setOpacity(0.5F);

        pane_text.setOrientation(Orientation.VERTICAL);
        pane_text.prefWidthProperty().bind(stage.widthProperty().multiply(0.3));
        pane_text.prefHeightProperty().bind(stage.heightProperty().multiply(1));
        pane_text.getChildren().addAll(title, desc, dir, prod, release, score);
        pane_text.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/GhibliStudio.jpg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,
                false, false, true, true));
        pane.setBackground(new Background(image));
        pane.getChildren().addAll(pane_back, pane_text);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 600, 500);
        stage.setScene(scene);
        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }

    public static Stage AnswerForPeople(Stage stage, People people_answer) {
        StackPane pane = new StackPane();
        FlowPane pane_text = new FlowPane();

        Label name = new Label("name:" + people_answer.getName());
        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        name.setTextFill(Color.BLACK);

        Label gender = new Label("gender: " + people_answer.getGender());
        gender.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        gender.setTextFill(Color.BLACK);

        Label age = new Label("age: " + people_answer.getAge());
        age.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        age.setTextFill(Color.BLACK);

        Label eye_color = new Label("eye color: " + people_answer.getEye_color());
        eye_color.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        eye_color.setTextFill(Color.BLACK);

        Label hair_color = new Label("hair color: " + people_answer.getHair_color());
        hair_color.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        hair_color.setTextFill(Color.BLACK);

        FlowPane pane_back = new FlowPane();
        pane_back.setStyle("-fx-background-color: white;");
        pane_back.setOpacity(0.5F);

        pane_text.setOrientation(Orientation.VERTICAL);
        pane_text.prefWidthProperty().bind(stage.widthProperty().multiply(0.3));
        pane_text.prefHeightProperty().bind(stage.heightProperty().multiply(1));
        pane_text.getChildren().addAll(name, gender, age, eye_color, hair_color);
        pane_text.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/GhibliStudio.jpg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,
                false, false, true, true));
        pane.setBackground(new Background(image));
        pane.getChildren().addAll(pane_back, pane_text);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 600, 500);
        stage.setScene(scene);
        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }

    public static Stage AnswerForLocations(Stage stage, Locations locs_answer) {
        StackPane pane = new StackPane();
        FlowPane pane_text = new FlowPane();

        Label name = new Label("name:" + locs_answer.getName());
        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        name.setTextFill(Color.BLACK);

        Label climate = new Label("climate: " + locs_answer.getClimate());
        climate.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        climate.setTextFill(Color.BLACK);

        Label terrain = new Label("terrain: " + locs_answer.getTerrain());
        terrain.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        terrain.setTextFill(Color.BLACK);

        Label surf_water = new Label("surface water: " + locs_answer.getSurface_water());
        surf_water.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        surf_water.setTextFill(Color.BLACK);

        FlowPane pane_back = new FlowPane();
        pane_back.setStyle("-fx-background-color: white;");
        pane_back.setOpacity(0.5F);

        pane_text.setOrientation(Orientation.VERTICAL);
        pane_text.prefWidthProperty().bind(stage.widthProperty().multiply(0.3));
        pane_text.prefHeightProperty().bind(stage.heightProperty().multiply(1));
        pane_text.getChildren().addAll(name, climate, terrain, surf_water);
        pane_text.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/GhibliStudio.jpg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,
                false, false, true, true));
        pane.setBackground(new Background(image));
        pane.getChildren().addAll(pane_back, pane_text);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 600, 500);
        stage.setScene(scene);
        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }

    public static Stage AnswerForSpecies(Stage stage, Species species_answer) {
        StackPane pane = new StackPane();
        FlowPane pane_text = new FlowPane();

        Label name = new Label("name:" + species_answer.getName());
        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        name.setTextFill(Color.BLACK);

        Label classification = new Label("classification: " + species_answer.getClassification());
        classification.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        classification.setTextFill(Color.BLACK);

        Label eye_colors = new Label("eye colors: " + species_answer.getEye_colors());
        eye_colors.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        eye_colors.setTextFill(Color.BLACK);

        Label hair_colors = new Label("hair colors: " + species_answer.getHair_colors());
        hair_colors.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        hair_colors.setTextFill(Color.BLACK);

        FlowPane pane_back = new FlowPane();
        pane_back.setStyle("-fx-background-color: white;");
        pane_back.setOpacity(0.5F);

        pane_text.setOrientation(Orientation.VERTICAL);
        pane_text.prefWidthProperty().bind(stage.widthProperty().multiply(0.3));
        pane_text.prefHeightProperty().bind(stage.heightProperty().multiply(1));
        pane_text.getChildren().addAll(name, classification, eye_colors, hair_colors);
        pane_text.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/GhibliStudio.jpg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,
                false, false, true, true));
        pane.setBackground(new Background(image));
        pane.getChildren().addAll(pane_back, pane_text);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 600, 500);
        stage.setScene(scene);
        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }

    public static Stage AnswerForVehicles(Stage stage, Vehicles vehicle_answer) {
        StackPane pane = new StackPane();
        FlowPane pane_text = new FlowPane();

        Label name = new Label("name:" + vehicle_answer.getName());
        name.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        name.setTextFill(Color.BLACK);

        Label desc = new Label("description: " + vehicle_answer.getDescription());
        desc.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        desc.setTextFill(Color.BLACK);
        desc.setWrapText(true);
        desc.setMaxWidth(300);

        Label veh_class = new Label("vehicle class: " + vehicle_answer.getVehicle_class());
        veh_class.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        veh_class.setTextFill(Color.BLACK);

        Label length = new Label("length: " + vehicle_answer.getLength());
        length.setFont(Font.font("Arial", FontWeight.BOLD, 15));
        length.setTextFill(Color.BLACK);

        FlowPane pane_back = new FlowPane();
        pane_back.setStyle("-fx-background-color: white;");
        pane_back.setOpacity(0.5F);

        pane_text.setOrientation(Orientation.VERTICAL);
        pane_text.prefWidthProperty().bind(stage.widthProperty().multiply(0.3));
        pane_text.prefHeightProperty().bind(stage.heightProperty().multiply(1));
        pane_text.getChildren().addAll(name, desc, veh_class, length);
        pane_text.setAlignment(Pos.CENTER);

        Image img = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/GhibliStudio.jpg");
        BackgroundImage image = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO,
                false, false, true, true));
        pane.setBackground(new Background(image));
        pane.getChildren().addAll(pane_back, pane_text);
        pane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(pane, 600, 500);
        stage.setScene(scene);
        stage.setTitle("Ghibli App");
        Image icon = new Image("file:C:/Users/madfl/IdeaProjects/GhibliApp/src/main/resources/images/totoro.png");
        stage.getIcons().add(icon);

        stage.show();

        return stage;
    }


}

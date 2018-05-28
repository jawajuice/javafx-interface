package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.lang.*;
public class Controller {


    public Button but1;
    public Button but1p3;
    public Button but2p3;
    public CheckBox checkp3;
    public ChoiceBox choicep3;
    public BorderPane borderpane;
    public Pane pane1;
    public Pane pane2;
    public Pane pane3;
    public HBox boxy;
    public Button inv1;
    public Button open3;
    public Button open2;
    public Button open1;
    public Button inv2;
    public Button inv3;
    public Label label3;
    public Label label2;
    public Label label1;
    public Button but1p1;
    public Button but2p1;
    public Button but3p1;
    public Button but4p1;
    public Button but5p1;
    public Button but6p1;
    public ToggleButton tog1;
    public ToggleButton tog2;
    public RadioButton radio1;
    public ComboBox combo1;










    public void initialize() {

        // Combobox meni
        ObservableList<String> comboList = FXCollections.observableArrayList("Option 1","Option 2","Option 3");


        combo1.setValue("Options");
        combo1.setItems(comboList);

        ObservableList<String> choiceList = FXCollections.observableArrayList("Option 1","Option 2","Option 3");

        // Choicebox meni

        choicep3.setItems(choiceList);
        choicep3.getSelectionModel().selectFirst();


        // zazna spremembe širine in nato pokliče ustrezno metodo
        borderpane.widthProperty().addListener(e -> System.out.println());
        borderpane.widthProperty().addListener(e -> {
            if(borderpane.getWidth() < 700 && borderpane.getWidth() > 600 ) {
                changeToSmallLayout();
            }  else if (borderpane.getWidth() < 600 && borderpane.getWidth() >510){
                changeToSmallLayout2();
            }  else if(borderpane.getWidth() < 510) {
                changeToSmallLayout3();
          }  else if (borderpane.getWidth() > 700){
                changeToLargeLayout();
            }

        });


    }
            // metode za spremembe menija
    public void changeToSmallLayout() {
        pane3.getChildren().removeAll(but1p3, but2p3, choicep3, checkp3, label3, open3);
        inv3.setVisible(true);
        inv3.setManaged(true);

        pane2.getChildren().removeAll(label2, radio1, combo1, open2);
        pane2.getChildren().addAll(label2, radio1, combo1, open2);
        inv2.setVisible(false);
        inv2.setManaged(false);


    }


    public void changeToSmallLayout2() {
        pane2.getChildren().removeAll(label2, radio1, combo1, open2);
        inv2.setVisible(true);
        inv2.setManaged(true);


        pane1.getChildren().removeAll(label1, but1p1, but2p1, but3p1, but4p1, but5p1, but6p1, tog1, tog2, open1);
        pane1.getChildren().addAll(label1, but1p1, but2p1, but3p1, but4p1, but5p1, but6p1, tog1, tog2, open1);
        inv1.setVisible(false);
        inv1.setManaged(false);


    }
    public void changeToSmallLayout3() {

        pane1.getChildren().removeAll(label1, but1p1, but2p1, but3p1, but4p1, but5p1, but6p1, tog1, tog2, open1);
        inv1.setVisible(true);
        inv1.setManaged(true);


    }


    public void changeToLargeLayout() {

        inv2.setVisible(false);
        inv2.setManaged(false);
        pane2.getChildren().removeAll(label2, radio1, combo1, open2);
        pane2.getChildren().addAll(label2, radio1, combo1, open2);

        inv3.setVisible(false);
        inv3.setManaged(false);
        pane3.getChildren().removeAll(but1p3, but2p3, choicep3, checkp3, label3, open3);
        pane3.getChildren().addAll(but1p3, but2p3, choicep3, checkp3, label3, open3);




    }


            //metode za odzivne menije

    public void createPopup3() {


        Stage mystage = (Stage) borderpane.getScene().getWindow();

        Stage popup3 = new Stage();
        popup3.setX(mystage.xProperty().doubleValue() + boxy.widthProperty().doubleValue() - 210);
        popup3.setY(mystage.yProperty().doubleValue() + 144);

        Pane pane1 = new Pane();
        pane1.setId("pane");
        pane1.getStylesheets().add("/sample/viper2.css");

        popup3.initStyle(StageStyle.UNDECORATED);
        popup3.setScene(new Scene(pane1, 245, 114));
        popup3.initModality(Modality.WINDOW_MODAL);



        pane1.getChildren().removeAll(but1p3, but2p3, choicep3, checkp3, label3, open3);
        pane1.getChildren().addAll(but1p3, but2p3, choicep3, checkp3, label3, open3);

        popup3.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (! isNowFocused) {
                popup3.hide();
            }
        });

        popup3.show();
    }


    public void createPopup2() {


        Stage mystage = (Stage) borderpane.getScene().getWindow();

        Stage popup2 = new Stage();
        popup2.setX(mystage.xProperty().doubleValue() + borderpane.widthProperty().doubleValue() - 310);
        popup2.setY(mystage.yProperty().doubleValue() + 144);

        Pane pane1 = new Pane();
        pane1.setId("pane");
        pane1.getStylesheets().add("/sample/viper2.css");

        popup2.initStyle(StageStyle.UNDECORATED);
        popup2.setScene(new Scene(pane1, 195  , 114));
        popup2.initModality(Modality.WINDOW_MODAL);



        pane1.getChildren().removeAll(label2, radio1, combo1, open2);
        pane1.getChildren().addAll(label2, radio1, combo1, open2);

        popup2.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (! isNowFocused) {
                popup2.hide();
            }
        });

        popup2.show();
    }

    public void createPopup1() {


        Stage mystage = (Stage) borderpane.getScene().getWindow();

        Stage popup1 = new Stage();
        popup1.setX(mystage.xProperty().doubleValue()+ 8);
        popup1.setY(mystage.yProperty().doubleValue() + 144);

        Pane pane1 = new Pane();
        pane1.setId("pane");
        pane1.getStylesheets().add("/sample/viper2.css");

        popup1.initStyle(StageStyle.UNDECORATED);
        popup1.setScene(new Scene(pane1, 210  , 114));
        popup1.initModality(Modality.WINDOW_MODAL);



        pane1.getChildren().removeAll(label1, but1p1, but2p1, but3p1, but4p1, but5p1, but6p1, tog1, tog2, open1);
        pane1.getChildren().addAll(label1, but1p1, but2p1, but3p1, but4p1, but5p1, but6p1, tog1, tog2, open1);

        popup1.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (! isNowFocused) {
                popup1.hide();
            }
        });

        popup1.show();
    }

            //metode za popup okenca

    public void openWindow1() {

        Stage mystage = (Stage) borderpane.getScene().getWindow();

        Stage popup1 = new Stage();
        popup1.setX(mystage.xProperty().doubleValue() );
        popup1.setY(mystage.yProperty().doubleValue() + 144);

        BorderPane popuppane = new BorderPane();

        popup1.setScene(new Scene(popuppane,250  , 300));
        popup1.initModality(Modality.WINDOW_MODAL);
        popup1.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (! isNowFocused) {
                popup1.hide();
            }
        });

        popup1.show();


    }
    public void openWindow2() {

        Stage mystage = (Stage) borderpane.getScene().getWindow();

        Stage popup1 = new Stage();
        popup1.setX(mystage.xProperty().doubleValue()+ 220);
        popup1.setY(mystage.yProperty().doubleValue() + 144);

        BorderPane popuppane = new BorderPane();

        popup1.setScene(new Scene(popuppane,250  , 300));
        popup1.initModality(Modality.WINDOW_MODAL);
        popup1.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (! isNowFocused) {
                popup1.hide();
            }
        });

        popup1.show();


    }
    public void openWindow3() {

        Stage mystage = (Stage) borderpane.getScene().getWindow();

        Stage popup1 = new Stage();
        popup1.setX(mystage.xProperty().doubleValue()+ 350);
        popup1.setY(mystage.yProperty().doubleValue() + 144);

        BorderPane popuppane = new BorderPane();

        popup1.setScene(new Scene(popuppane,250  , 300));
        popup1.initModality(Modality.WINDOW_MODAL);
        popup1.focusedProperty().addListener((obs, wasFocused, isNowFocused) -> {
            if (! isNowFocused) {
                popup1.hide();
            }
        });

        popup1.show();


    }



}
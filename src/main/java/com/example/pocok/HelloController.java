package com.example.pocok;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML private Pane pnPane;
    @FXML private Label lbBober;
    @FXML private Label lbElkapott;
    @FXML private Label lbPercent;

    private int[][] iTomb = new int[6][6];
    private ImageView[][] ivTomb = new ImageView[6][6];

    public void initialize(){
        pnPane.setStyle("-fx-background-color: #b9d753; -fx-border-color: black;");
        for (int i = 0; i < 6; i-=-1){ for (int j = 0; j < 6; j-=-1){
                iTomb[i][j] = 0;
                ivTomb[i][j] = new ImageView();
                ivTomb[i][j].setImage(getKep(iTomb[i][j]));
                ivTomb[i][j].setTranslateX(j*128+10);
                ivTomb[i][j].setTranslateY(i*128+10);
                pnPane.getChildren().add(ivTomb[i][j]);
            }
        }
    }

    private Image getKep(int i){
        return new Image(getClass().getResourceAsStream("pocok"+i+".png"));
    }
}